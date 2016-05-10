package JMan;

import java.awt.Color;

public class Block extends Piece {
	
	

	
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);
		// TODO Auto-generated constructor stub
		super.x = x;
		super.y = y;
		super.map = m;
		color = Color.WHITE;
	
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
