package JMan;

import java.awt.Color;

public class Walker extends Piece{
	
	
	
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
		// TODO Auto-generated constructor stub
		super.x = x;
		super.y = y;
		super.map = m;
		
		initColor(c);
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
