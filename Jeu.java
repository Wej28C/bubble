import java.awt.Point;
import java.awt.Color;
import java.util.ArrayList;
public class Jeu {
    /**
     * Le ballon 
     * */
    private Bubble bubble; 
    /** 
     * la liste des ballons dans une ligne
     */
    private ArrayList<Bubble> lignList;
    /*
     le conteneur des ballons*/
    private ArrayList<lignList> matrice; 
    /** 
     * nombre de lignes possibles
     * */
    public static final int NbLignes =4 ; 
    public static final int NbColonne=6; 
    /**
     * les couleurs des ballons
     *  */
    private Color colors; 

    public Jeu (){
        matrice = new ArrayList<lignList>(); 
        for(int i=0; i<NbLignes ; i++ ){
            lignList= new ArrayList<Bubble>();
            matrice.add(lignList);
            for(int j=0; j<NbColonne;j++){
                Bubble b= new Bubble (Bubble.getRandomColor(4));
                b.setLocation(new Point(j,i));
                lignList.add(b);

            }
        }
    }

   /* 
    public ArrayList<lignList> rajouterBubbledansMatrice(){
        matrice = new ArrayList<lignList>(); 
            for(int i=0; i<NbLignes ; i++ ){
                lignList= new ArrayList<Bubble>();
                matrice.add(lignList);
                for(int j=0; j<NbColonne;j++){
                    Bubble b= new Bubble (Bubble.getRandomColor(colors));
                    b.setLocation(new Point(j,i));
                    lignList.add(b);

                }
            }
            return matrice;
    }*/

    /**
	 * retourne les voisins de la boule 
	 * @param ligne indice de la ligne contenant la boule 
	 * @param col indice de colonne contenant la boule 
	 * @return list des oules voisines 
	 */
	private ArrayList<Bubble> getNeighbours(int ligne, int col){
		ArrayList<Bubble> neighbours = new ArrayList<Bubble>();

        //1er cas 
        if ((col>0) && (col<5) && (ligne>0) && (ligne<NbLignes-1)){
            //dans la meme ligne
            neighbours.add(matrice.get(ligne).get(col+1));
            neighbours.add(matrice.get(ligne).get(col-1));
            //dans la ligne de dessus
            neighbours.add(matrice.get(ligne-1).get(col));
            neighbours.add(matrice.get(ligne-1).get(col+1));
            neighbours.add(matrice.get(ligne-1).get(col-1));
            //dans la ligne de dessous
            neighbours.add(matrice.get(ligne+1).get(col));
            neighbours.add(matrice.get(ligne+1).get(col+1));
            neighbours.add(matrice.get(ligne+1).get(col-1));
        }
        //2eme cas 
        if((col==0)&&(ligne>0)&&(ligne<NbLignes)){
            //droite
            neighbours.add(matrice.get(ligne).get(col));
            //haut
            neighbours.add(matrice.get(ligne-1).get(col));
            //haut droite
            neighbours.add(matrice.get(ligne-1).get(col+1));
            //bas
            neighbours.add(matrice.get(ligne+1).get(col));
            //bas droite
            neighbours.add(matrice.get(ligne+1).get(col+1));
            
        }
        //3eme cas 
        if ((col==NbColonne-1)&&(ligne>0)&&(ligne<NbLignes)){
            //gauche
            neighbours.add(matrice.get(ligne).get(col-1));
            //haut
            neighbours.add(matrice.get(ligne-1).get(col));
            //haut gauche 
            neighbours.add(matrice.get(ligne-1).get(col-1));
            //dessous
            neighbours.add(matrice.get(ligne+1).get(col));
            //dessous gauche
            neighbours.add(matrice.get(ligne+1).get(col-1));
        }
        //4eeme cas 
        if((col==NbColonne-1)&&(ligne==0)){
            //gauche
            neighbours.add(matrice.get(ligne).get(col-1));
            //desous
            neighbours.add(matrice.get(ligne+1).get(col));
            //dessous gauche 
            neighbours.add(matrice.get(ligne+1).get(col-1));
        }
        //5 cas 
        if((col==0)&&(ligne==0)){
            //droite
            neighbours.add(matrice.get(ligne).get(col+1));
            //dessous
            neighbours.add(matrice.get(ligne+1).get(col));
            //dessous droite 
            neighbours.add(matrice.get(ligne+1).get(col+1));
        }
        //6eme cas
        if((col==0)&&(ligne==NbLignes-1)){
            //droite
            neighbours.add(matrice.get(ligne).get(col+1));
            //dessus
            neighbours.add(matrice.get(ligne-1).get(col-1));
            //dessus droite
            neighbours.add(matrice.get(ligne-1).get(col+1));
        }
        //7eme cas 
        if ((col==NbColonne-1)&&(ligne==NbLignes-1)){
            //gauche
            neighbours.add(matrice.get(ligne).get(col-1));
            //dessus
            neighbours.add(matrice.get(ligne-1).get(col));
            //dessus gauche 
            neighbours.add(matrice.get(ligne-1).get(col-1));
        }
        return neighbours;
    }
		
    public void supprimerballon (int ligne , int col){
     
		for (Bubble b : getNeighbours(ligne, col)){	
				if (b.getColor().equals(matrice.get(ligne).get(col).getColor())){
					matrice[ligne][col]=null; 
				}
			
		}
    }
}