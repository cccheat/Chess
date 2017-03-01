
public class Bishop extends Pieces {

	public Bishop() {
		name = "Bishop";
	}

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy) && !IntheWay(startx, starty, endx, endy)) {
			if (Math.abs(startx - endx) == Math.abs(starty - endy))
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
		return "bishop";
	}

	@Override
	public boolean IntheWay(int startx, int starty, int endx, int endy) {
		// TODO Auto-generated method stub
		return false;
	}

}
