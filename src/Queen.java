
public class Queen extends Pieces {

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1)
				return true;

			else if (Math.abs(startx - endx) == Math.abs(starty - endy))
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
		return "queen";
	}

	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		// TODO Auto-generated method stub
		return false;
	}

}
