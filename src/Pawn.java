public class Pawn extends Pieces {
	public int MOVE_COUNT = 0;
	
	public Pawn() {
		name = "Pawn";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			if (startx == endx && endy == starty + 1)
				return true;
		}

		if (!isFree(endx, endy)) {
			if (endx == startx + 1 && endy == starty + 1) {
				return true;
			} else if (endx == startx - 1 && endy == starty + 1) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean canJump() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "pawn";

	}

	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		//dont need it cuz it can only move one except of in the first one in which you wont get a object in the way
		return false;
	}

}