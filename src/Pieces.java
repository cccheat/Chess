public abstract class Pieces extends Board {
	public String name;

	// public boolean isAlive;

	// still needs finishing
	public boolean isFree(int endX, int endY) {
		return true;
	}

	public abstract boolean canMove(int startx, int starty, int endx, int endy);

	public abstract boolean canJump();

	public abstract String toString();
}