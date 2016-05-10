package JMan;

import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
	
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
        // Complete this
        initColor(c);
        
        super.x = x;
        super.y = y;
        super.map = m;
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN,m);
        // Complete this;
        color = c;
        
        super.x = x;
        super.y = y;
        super.map = m;
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){
        return;
    }
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){
        setActed(true);
        int movex=1,movey=1;
        if ( i == 0 ){
        	movex = 0;
        	movey = -1;
        } else if ( i == 1 ){
        	movex = 0;
        	movey = 1;
        } else if ( i == 2 ){
        	movex = -1;
        	movey = 0;
        } else if ( i == 3 ){
        	movex = 1;
        	movey = 0;
        }
        
        map.move(x, y, x+movex, y+movey);
        
//        if ( map.isEmpty(x+movex,y+movey) ){
//        	
//        }
        // Complete this
    }
    
    /** = representation of this piece */
    public String toString() {
        String color= "";
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
