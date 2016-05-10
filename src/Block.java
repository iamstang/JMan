package JMan;

import java.awt.Color;
/*
 * @author Khanutchon Ammawong
 */
public class Block extends Piece {
	
	

	/*
	 * Constructor
	 * @param x X location of piece in array; grid[x][y]
	 * @param y X location of piece in array; grid[x][y]
	 * @param c integer indicate the color of piece
	 * @param m the game map
	 */
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);
		// TODO Auto-generated constructor stub
		super.x = x;
		super.y = y;
		super.map = m;
		color = Color.WHITE;
		colorID = 99;
	}

	@Override
	public void act() {
		// do nothing
		
	}

}
