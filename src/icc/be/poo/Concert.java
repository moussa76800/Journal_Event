/**
 * 
 */
package icc.be.poo;


import java.util.ArrayList;

/**
 * @author Moussa
 *
 */
public class Concert extends Evenement implements Manageable {

	private String designation;
	private ArrayList<Artiste>artistes;
	
	
	
	

	/**
	 * @param texte
	 * @param string
	 * @param designation
	 * @param artistes
	 */
	public Concert(String texte, String dateEvent, String designation) {
		super(texte, dateEvent);
		this.designation = designation;
		artistes = new ArrayList<Artiste>();
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	/**
	 * @return the artistes
	 */
	public ArrayList<Artiste> getArtistes() {
		return artistes;
		
	}
	/**
	 * @param artistes the artistes to set
	 */
	public void setArtistes(ArrayList<Artiste> artistes) {
		this.artistes = artistes;
	}
	
	@Override
	public boolean dropArtist(Artiste a) {
		ArrayList<Artiste> list = getArtistes();
		for(Artiste artiste : list) {
			if(artiste.equals(a)) {
		    list.remove(a);
		    return true;
			}
		}
		return false;
	}
	
	
	@Override
	public boolean hadArtist(Artiste a) {
		ArrayList<Artiste> list = getArtistes();
		for(Artiste artiste : list) {
			if(artiste.equals(a)) {
			 throw  new DuplicateArtistException () ;
			}else  {
				list.add(a);
				return true;
			}
		}
		return false;
	}
	 public ArrayList<Artiste> getVIPs(boolean b) {
		 ArrayList<Artiste> list = new ArrayList<>();
		 for (Artiste art : getArtistes()) {
			if (art.isVIP(true)){
			list.add(art);
			}
		 }
		return list;
	 }
	
	@Override
	public String toString() {
		return "Concert [designation=" + designation + ", Artistes=" + artistes + "]";
	}
	
	
	
	
	
	
	
}
