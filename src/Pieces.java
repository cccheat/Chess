public abstract class Pieces {
	public String name;
	
	//public boolean isAlive;

	public abstract boolean canMove(int startx,int starty,int endx,int endy, boolean isOccupied);
	
	public abstract boolean canJump();
	
	public abstract String toString();
	
}