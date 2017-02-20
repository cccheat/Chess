public abstract class Pieces extends Board {
	public String name;
	public String Color;
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

	/**
	 * checks if there is anything in the way fo the moving it is individual per
	 * piece movement -> some share because they have the same basic movement
	 * everyone except of knight needs it
	 *
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 * @return if anything is in the way
	 */
	public abstract boolean IntheWay(int startx, int starty, int endx, int endy);

	/**
	 * 
	 * @return abstract canJump method
	 */
	public abstract boolean canJump();

	public abstract String toString();
}