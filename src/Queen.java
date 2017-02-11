
public class Queen extends Pieces {

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy, boolean isOccupied) {
		if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1) {
			return true;
		}
		if (Math.abs(startx - endx) == Math.abs(starty - endy)) {
			return true;
		}
		if (starty == endy) {
			return true;
		}

		if (startx == endx) {
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
		return "q";
	}

}
