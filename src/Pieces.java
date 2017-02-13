public abstract class Pieces extends Board {
	public String name;

	// public boolean isAlive;

	// still needs finishing
	public boolean isFree(int endX, int endY) {
		return true;
	}

	/**
	 * 
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 * @return abstract can move method
	 */
	public abstract boolean canMove(int startx, int starty, int endx, int endy);

	public abstract boolean IntheWay(int startx, int starty, int endx, int endy);

	/**
	 * 
	 * @return abstract canJump method
	 */
	public abstract boolean canJump();

	public abstract String toString();
}