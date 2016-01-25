package GameOfLife2D;

public class Board {

	private Cell[][] cells;
	private int width;
	private int height;

	public Board(int width, int height) {

		this.width = width;
		this.height = height;
		cells = new Cell[width][height];

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
			cells[i][j]= new Cell();
			}
		}

	}

	public void countNeighbours(int x, int y) {
		int sumOfNeighbour = 0;
		int start_x = Math.max(x - 1, 0);
		int start_y = Math.max(y - 1, 0);
		int end_x = Math.min(x + 1, width-1);
		int end_y = Math.min(y + 1, height-1);

		for (int i = start_x; i <= end_x; i++) {
			for (int j = start_y; j <= end_y; j++) {

				if (cells[i][j].alive == true) {
					sumOfNeighbour++;
				}

			}
		}

		if (cells[x][y].alive == true) {
			sumOfNeighbour--;

		}

		cells[x][y].setNeighbours(sumOfNeighbour);
	//	System.out.print(x);
	//	System.out.print(" ");
	//	System.out.print(y);
	//	System.out.print(" ");
	//	System.out.print(sumOfNeighbour);
	//	System.out.println();
		

	}
	public void setValueOfCell(int x, int y)
	{
		cells[x][y].setAlive();
		
	}

	public void nextBoardState() {

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				countNeighbours(i, j);

			}
		}

	}

	public void updateBoardState() {

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (cells[i][j].getNumberOfNeighbours() >= 3 && cells[i][j].getState() == false) {

					cells[i][j].setAlive();

				} else if ((cells[i][j].getNumberOfNeighbours() < 2 || cells[i][j].getNumberOfNeighbours() > 3)
						&& cells[i][j].getState() == true) {

					cells[i][j].setDead();
				}
				else{}
			}
		}

	}
	
	public void showBoard()
	{
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++){
				
				if (cells[i][j].getState()==true){
				
				System.out.print("1 ");}
				else {
				System.out.print("0 ");}
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
