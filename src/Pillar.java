package JMan;

import java.awt.Color;
/*
 * @author Khanutchon Ammawong
 */
public class Pillar extends Piece {
	
	
	/*
	 * Constructor
	 * @param x X location of piece in array; grid[x][y]
	 * @param y X location of piece in array; grid[x][y]
	 * @param c integer indicate the color of piece
	 * @param m the game map
	 */
	public Pillar(int x, int y, int c, Map m){
		super(Piece.PILLAR, m);
		
		super.x = x;
		super.y = y;
		super.map = m;
		setColor(c);
	}
	
	
	@Override
	public void act() {
		
		int i = rand(1,3);
		
		// 1/3 times the pillar will change the color
		if ( i == 3 ){
			setColor(rand(0,2));
		}
		// 2/3 time they will do nothing
	}
}
