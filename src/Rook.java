public class Rook extends Pieces {

	public Rook(){
		name = "Rook";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy, boolean isOccupied) {
			if(starty == endy){
				return true;
			}
			
			if(startx == endx){
				return true;
			}
		
		return false;
	}

	@Override
	public boolean canJump() {
		return false;
	}

	@Override
	public String toString() {
		return "r";
	}

}