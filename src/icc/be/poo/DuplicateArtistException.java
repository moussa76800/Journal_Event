/**
 * 
 */
package icc.be.poo;

/**
 * @author Moussa
 *
 */
public class DuplicateArtistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2777247583970966171L;

	/**
	 * 
	 */
	public DuplicateArtistException() {
		super();
		System.out.println("L'artiste est déja présente dans la liste");
	}

}
