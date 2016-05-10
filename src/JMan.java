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
        setColor(c);
        
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
        int movex=0,movey=0;
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
        
        // if the move-to block is available else do nothing
        if ( map.isInGrid(x+movex,y+movey) ){
        	
        	// If the move-to block is empty move JMan to target location
        	if ( map.isEmpty(x+movex,y+movey) ){
        		
        		map.move(x, y, x+movex, y+movey);
        	
        	// capture the piece and change JMan color	
        	} else if ( (getColorID()+1)%3 == map.pieceAt(x+movex,y+movey).getColorID() ){
        		
        		setColor(map.pieceAt(x+movex,y+movey).getColorID());
        		
        		map.move(x, y, x+movex, y+movey);
        	}
        	
        	
        }
   
    }
    
    /** = representation of this piece */
    public String toString() {
   
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
