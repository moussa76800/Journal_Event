/**
 * 
 */
package icc.be.poo;



/**
 * @author Moussa
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			
		Concert festival=new Concert("Brussels Concerts","2021-05-17","Brussels Summer Festival");
			  
             Artiste artiste = new Artiste("Enjoy", "2021/05/2021", true); 
             Artiste artiste1 = new Artiste("Sardou", "2021/05/2021", false); 
             Artiste artiste2 = new Artiste("McGloire", "2021/05/2021", true); 
             Artiste artiste3 = new Artiste("McGregor", "2021/05/2021", false);
             
             
             
             festival.getArtistes().add(artiste);
             festival.getArtistes().add(artiste1);
             festival.getArtistes().add(artiste2);
             festival.getArtistes().add(artiste3);
             
            
            
           System.out.println(MyUtilities.fromXml( "data\\data.xml"));
           }
}



