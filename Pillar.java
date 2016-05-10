package JMan;

import java.awt.Color;

public class Pillar extends Piece {
	
	
	
	public Pillar(int x, int y, int c, Map m){
		super(Piece.PILLAR, m);
		
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
