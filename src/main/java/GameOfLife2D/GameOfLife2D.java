package GameOfLife2D;

public class GameOfLife2D {

	public static void main(String[] args) {
		Board board1 = new Board(20, 20);
		
		//System.out.println(board1.cells[0][0].alive);
		
		
		board1.setValueOfCell(2, 2);
		board1.setValueOfCell(2, 3);
		board1.setValueOfCell(2, 1);
		
		board1.showBoard();
		board1.nextBoardState();
		board1.updateBoardState();
		board1.showBoard();
		board1.nextBoardState();
		board1.updateBoardState();
		board1.showBoard();


		
	}

}
