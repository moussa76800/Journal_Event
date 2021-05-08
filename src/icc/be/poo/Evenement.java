/**
 * 
 */
package icc.be.poo;

import java.sql.Date;




/**
 * @author Moussa
 *
 */
public class Evenement {
private String texte;
private Date dateEvent;
/**
 * @param texte
 * @param dateEvent
 */
public Evenement(String texte, String dateEvent) {
	super();
	this.texte = texte;
	setDateEvent(dateEvent);;
}

/**
 * @return the texte
 */
public String getTexte() {
	return texte;
}
/**
 * @param texte the texte to set
 */
public void setTexte(String texte) {
	this.texte = texte;
}
/**
 * @return the dateEvent
 */
public Date getDateEvent() {
	return dateEvent;
}
/**
 * @param dateEvent the dateEvent to set
 */
public void setDateEvent(String dateEvent) {
	this.dateEvent=getDateEvent();
}

@Override
public String toString() {
	return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
}



}
