
/**
 * Beschreiben Sie hier die Klasse Stack.
 * 
 * @author Joerg (Yogi) Kuhle
 * @version 2021_12_13
 */
public class Stack
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Element anchor;

    /**
     * Konstruktor für Objekte der Klasse Stack
     */
    public Stack()
    {
        anchor = null;
    }

    /**
     * push - Einen Text auf den Stack legen
     */
    public void push(String text) {
        Element element = new Element(text);
        element.next = anchor;
        anchor = element;
    }
    
    /**
     * pop - Einen Text aus dem Stack holen
     */
    public String pop() {
        if (anchor != null) {
            Element temp = anchor;
            anchor = anchor.next;
            return temp.value;
        }
        return null;
    }
    
    /**
     * top - Zeigt das obere Element, ohne es zu entnehmen
     */
    public String top() {
        if (anchor != null) {
            return anchor.value;
        }
        return null;        
    }
    
    /**
     * isEmpty - Gibt an, ob der Stack leer ist
     */
    public boolean isEmpty() {
        return (anchor == null);
    }
}
