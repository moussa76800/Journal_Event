/**
 * 
 */
package testUnitaireClasseConcert;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Main.Participant;
import icc.be.poo.Artiste;
import icc.be.poo.Concert;

/**
 * @author Moussa
 *
 */
class TestClasseConcert {

	@Test
	void testConstructeur() {
	System.out.println("test du constructeur");	
	
	//----PREPARATION----
	
	 
	Concert festival=new Concert("Brussels Concerts","2021-05-17","Brussels Summer Festival");
	  
    Artiste artiste = new Artiste("Enjoy", "2021/05/2021", true); 
    Artiste artiste1 = new Artiste("Sardou", "2021/05/2021", false); 
    Artiste artiste2 = new Artiste("McGloire", "2021/05/2021", true); 
    Artiste artiste3 = new Artiste("McGregor", "2021/05/2021", false);
    
    festival.getArtistes().add(artiste);
    festival.getArtistes().add(artiste1);
    festival.getArtistes().add(artiste2);
    festival.getArtistes().add(artiste3);
		 
  //----VERIFICATION SUCCES----
	
	 assertEquals("Brussels Summer Festival", festival.getDesignation());
     assertEquals("Enjoy",festival.getVIPs(true));
     

//----VERIFICATION FAIL----
    assertNotNull(festival.getArtistes());
    assertNotEquals("Souchon",festival.getArtistes()); 
    assertEquals("Europa League", festival.getTexte());
	 assertEquals("Lemonnier",festival.getDesignation());
}	
	
	
	
	
	}


