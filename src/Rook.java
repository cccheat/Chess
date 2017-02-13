public class Rook extends Pieces {

	public Rook() {
		name = "Rook";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			if (((startx == endx) && !(endy == starty)) || (!(startx == endx) && (endy == starty)))
				return true;
		} else {
			return false;
		}
		return false;
	}

	@Override
	public boolean canJump() {
		return false;
	}

	@Override
	public String toString() {
		return "rook";
	}

	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		
		return false;
	}

}