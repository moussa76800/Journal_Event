/**
 * 
 */
package icc.be.poo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;





/**
 * @author Moussa
 *
 */
public class MyUtilities {

	
	private static XStream xstream= new XStream(new DomDriver());
	/*
	 * SERIALISATION
	 */
	 public static String toXMLFile(Concert concert,String fileName) {
		
		 xstream.alias("Concert",Concert.class);
			xstream.alias("Artiste", Artiste.class);
			xstream.aliasField("date", Evenement.class, "dateCreation");
			xstream.useAttributeFor(Concert.class,"dateEvent");
			xstream.useAttributeFor(Concert.class,"designation");
			xstream.addImplicitCollection(Concert.class, "artistes");
			//Convertir en String XML et sauve dans le fichier texte
			try {
				xstream.toXML(concert,new FileWriter(fileName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return fileName;
		}
		/*
		 * Déserialisation
		 */
		public static Concert fromXml(String fileName) {
			//Configuration XStream
			xstream.alias("Concert", Concert.class);
			xstream.alias("Artiste", Artiste.class);
			xstream.aliasField("date", Evenement.class, "dateEvent");
			xstream.useAttributeFor(Concert.class,"dateEvent");
			xstream.useAttributeFor(Concert.class,"designation");
			xstream.addImplicitCollection(Concert.class, "artistes");
			// Récuperer l'objet  
			return (Concert) xstream.fromXML(new File(fileName));
			
		}
	
	 }
	 
	

