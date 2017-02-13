public class Pawn extends Pieces {

	public Pawn() {
		name = "Pawn";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			if (startx == endx && endy == starty + 1)
				return true;
			return false;
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
		// TODO Auto-generated method stub
		return false;
	}

}