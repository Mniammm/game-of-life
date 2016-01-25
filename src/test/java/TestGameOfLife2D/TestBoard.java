package TestGameOfLife2D;

import org.junit.Assert;
import org.junit.Test;

import GameOfLife2D.Board;
import GameOfLife2D.Cell;

public class TestBoard {

	@Test
	public void testCreate() {

		Cell cell = new Cell();

		Assert.assertEquals(false, cell.getState());
		cell.setNeighbours(5);
		Assert.assertEquals(5, cell.getNumberOfNeighbours());
		cell.setAlive();
		Assert.assertEquals(true, cell.getState());
		cell.setDead();
		Assert.assertEquals(false, cell.getState());
	}

	@org.junit.Test
	public void testCreateBoard() {

		Board board = new Board(10, 10);

		// Assert.assertArrayEquals(expecteds, board.);

	}

}
