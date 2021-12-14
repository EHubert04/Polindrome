import java.util.Scanner;
public class PolindromChecker{
    public PolindromChecker(){

    }
    Scanner scan= new Scanner(System.in);
    String polindrom = scan.nextLine();
    Stack stack = new Stack();

    public void check(){
        for(int i = 1;i > polindrom.length(); i++ ){
            stack.push(polindrom.substring(i,i));
            
        }
    }
}