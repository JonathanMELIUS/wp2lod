/* CVS $Id: $ */
 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /Users/andra/Downloads/freq.rdf 
 * @author Auto-generated by schemagen on 14 Sep 2012 14:46 
 */
public class Freq {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/cld/freq/";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Resource Irregular = m_model.createResource( "http://purl.org/cld/freq/irregular" );
    
}
