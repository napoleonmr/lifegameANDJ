package lifegameANDJ;

public class Cell {

	private int neigbours;
	private boolean status;

	public Cell(int neigbours, boolean b) {
		this.neigbours = neigbours;
		this.status = b;
		
	}

	//Any live cell with two or three live neighbours lives on to the next generation.
	
	public void tick() {
		if ( this.neigbours < 2)
			this.status= false;	
		if ( this.neigbours > 3)
			this.status =false;
		if ( this.neigbours ==3)
			this.status = true;
			
	
	}

	public boolean getStatus() {
		
		return this.status;
	}

	
}
