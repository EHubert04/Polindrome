import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;
public class PolindromChecker{

    Stack stack = new Stack();
    String polindrom; 
    String reverse = "";

    public PolindromChecker(){
        System.out.print("Bitte Wort eingeben: ");
        Scanner scan = new Scanner(System.in);
        polindrom = scan.nextLine();
    }

    public static void main(String[] args){
        PolindromChecker p = new PolindromChecker();
        p.check();
    }


    public void check(){
        for(int i = polindrom.length();i > 0; i--){
            stack.push(polindrom.substring(i-1,i));
            System.out.println((polindrom.substring(i-1,i)));
            reverse = reverse + stack.pop();
        }
        System.out.println(polindrom + " = " + reverse);
        if(reverse.equals(polindrom)){
            System.out.println("True");
            
        } else{
            System.out.println("False");
        }
    }
}