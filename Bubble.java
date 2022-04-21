
import java.awt.Color;
import java.awt.Point;

    public class Bubble {
        /**
         * the color of the bubble
         */
        Color color;
      
        /**
         * localisation du ballon dans la matrice
         */
        Point loc;
        /**
         * l'indice de colonne 
         */
        int col; 
        /**
         *  l'indice le la ligne
        */
        int ligne; 
        /**
         * constructor for the class bubble
         * @param c the color of the bubble
         */
        public Bubble(Color c){
            color = c;
        
        }
        /**
	     * setter for the location of the bubble (top left corner)
	     * @param p the desired location
	     */
    	public void setLocation(Point p){
		this.loc=p;
	    }
	
	    /**
	    * getter for the location of the bubble (top left corner)
	    * @return the position of the top left corner of the bubble
	    */
	    public Point getLocation(){
		return loc;
	    }
          /**
    	 * returns the y coordinate of the bubble within the bubble matrix
	     * @return the row of the bubble matrix in which this bubble can be found
	     */
	    public int getLigne(){
		return loc.y;
	    }
	
    	/**
	     * returns the x coordinate of the bubble within the bubble matrix
	     * @return the column of the bubble matrix in which this bubble can be found
	     */
	    public int getCol(){
		return loc.x;
    	}
  
        
        /**
         * getter for the color of the bubble
         * @return the color of the bubble
         */
        public Color getColor(){
            return color;
        }
        
     
        
     
        
        
        /**
         * static method for getting a random color that can be set
         * as the color of a bubble
         * @param bound the number of possibilities when choosing randomly, maximal 8
         * @return the generated color
         */
        public static Color getRandomColor(int bound){
            int rnd = (int) (bound<=4 ? Math.random()*bound : Math.random()*4);
            switch (rnd) {
            case 0:
                return Color.blue;
            case 1:
                return Color.red;
            case 2:
                return Color.yellow;
            case 3:
                return Color.green;
            case 4:
                return Color.orange;
            
            default:
                break;
            } 
            return null;
        }
        
    }

