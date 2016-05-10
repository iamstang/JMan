package JMan;

import java.awt.Color;

/*
 * @author Khanutchon Ammawong
 */
public class Walker extends Piece{


	/*
	 * Constructor
	 * @param x X location of piece in array; grid[x][y]
	 * @param y X location of piece in array; grid[x][y]
	 * @param c integer indicate the color of piece
	 * @param m the game map
	 */
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
		// TODO Auto-generated constructor stub
		super.x = x;
		super.y = y;
		super.map = m;

		setColor(c);
	}

	@Override
	public void act() {
		
		int i = rand(1,3);
		
		// 1/3 times they will move to random direction
		if ( i == 3 ){
			
			int movex=0,movey=0;
			int j = rand(0,3);
			if ( j == 0 ){

				movex = 0;
				movey = -1;

			} else if ( j == 1 ){

				movex = 0;
				movey = 1;

			} else if ( j == 2 ){

				movex = -1;
				movey = 0;

			} else if ( j == 3 ){

				movex = 1;
				movey = 0;

			}



			if ( map.isInGrid(x+movex,y+movey) ){

				if ( map.isEmpty(x+movex,y+movey) ){

					map.move(x, y, x+movex, y+movey);
				}
			}
		}


	}

}
