import java.util.Scanner;
public class PolindromChecker{

    Scanner scan= new Scanner(System.in);
    String polindrom = scan.nextLine();
    Stack stack = new Stack();
    String reverse = "";

    public PolindromChecker(){
        // leerer Konstruktor
    }

    public static void main(String[] args){
        PolindromChecker p = new PolindromChecker();
        p.check();
    }


    

    public void check(){
        for(int i = 1;i > polindrom.length(); i++ ){
            stack.push(polindrom.substring(i,i));
            String reverse = "" + stack.pop();
        }
       
        
    }
}