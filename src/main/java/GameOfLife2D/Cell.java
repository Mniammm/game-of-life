package GameOfLife2D;

public class Cell {

	boolean alive=false;
	int neighbours = 0;

	public Cell() {
		
	}

	public void setNeighbours(int newNumbersOfNeighbours) {

		
		neighbours = newNumbersOfNeighbours;
		
		

	}

	public void setAlive() {

		alive = true;

	}

	public void setDead() {
		
		alive = false;
	}
	
	public Boolean getState()
	{
		
		return alive;
		
	}
	
	public int getNumberOfNeighbours()
	{
		
		return this.neighbours;
		
	}
	
	public int stateOfCell()
	{
		if(this.alive=true)
		{
			return 1;
		}
		else{return 0;}
	}

	public void view() {

	}

}
