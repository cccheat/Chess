
public class Bishop extends Pieces {

	public Bishop(){
		name = "Bishop";
	}
	
	@Override
	public boolean canMove(int startx, int starty, int endx, int endy, boolean isOccupied) {
		if(Math.abs(startx - endx) == Math.abs(starty - endy)){
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
		return "b";
	}

}
