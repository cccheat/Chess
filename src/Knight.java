
public class Knight extends Pieces {

	@Override
	public boolean canMove(int startx, int starty, int endx, int endy) {
		if (isFree(endx, endy) && isValid(endx, endy)) {
			//i cant come up with a way to make this work
		}
		return false;
	}

	@Override
	public boolean canJump() {
		return true;
	}

	@Override
	public String toString() {
		return "knight";
	}

}
