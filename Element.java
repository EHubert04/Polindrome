
/**
 * Beschreiben Sie hier die Klasse Element.
 * 
 * @author Joerg (Yogi) Kuhle 
 * @version 2021_12_13
 */
public class Element
{
    public String value;
    public Element next; 

    /**
     * Konstruktor für Objekte der Klasse Element
     */
    public Element(String value)
    {
        this.value = value;
        next = null;
    }

}
