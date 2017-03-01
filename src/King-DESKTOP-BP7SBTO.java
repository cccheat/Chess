public class King extends Pieces {

	public String name;

	public King() {
		name = "King";
	}

	// public boolean isAlive;
	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy) && !IntheWay(startx, starty, endx, endy)) {
			if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1)
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
		return "king";
	}

	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		// TODO Auto-generated method stub
		return false;
	}

}