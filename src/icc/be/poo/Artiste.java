/**
 * 
 */
package icc.be.poo;

import java.sql.Date;

/**
 * @author Moussa
 *
 */
public class Artiste {
	



private String nomArtiste;
private Date dateCreation;
private boolean isVIP;
/**
 * @param nomAriste
 * @param dateCreation
 * @param isVIP
 */
public Artiste(String nomArtiste, String dateCreation, boolean isVIP) {
	super();
	this.nomArtiste = nomArtiste;
	setDateCreation( dateCreation);
	this.isVIP = isVIP;	
}

/**
 * @return the nomArtiste
 */
public String getNomArtiste() {
	return nomArtiste;
}
/**
 * @param nomAriste the nomAriste to set
 */
public void setNomArtiste(String nomArtiste) {
	this.nomArtiste = nomArtiste;
}
/**
 * @return the dateCreation
 */
public Date getDateCreation() {
	return dateCreation;
}
/**
 * @param dateCreation the dateCreation to set
 */
public void setDateCreation(String dateCreation) {
	this.dateCreation=getDateCreation();;
}


/**
 * @return the isVIP
 */
public boolean isVIP(boolean b) {
	return isVIP;
}

/**
 * @param isVIP the isVIP to set
 */
public void setVIP(boolean isVIP) {
	this.isVIP = isVIP;
}


@Override
public String toString() {
	return "\n Artiste [nomArtiste= " + nomArtiste + ", dateCreation= " + dateCreation + ", isVIP= " + isVIP + "]" ;
}






}
