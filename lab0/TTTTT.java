package lab0;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TTTTT {
    static int getInteger (Scanner sc){
        int userinput;
        while (true) {
            System.out.print("Enter : ");
            try {
                userinput = sc.nextInt();
            } catch (IllegalStateException e) {
                return 0;
            } catch (InputMismatchException e){
                sc.next();
                continue;
                
            } 
            return userinput;
        }
    }
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TTTTT t= new TTTTT();
        System.out.println(t.getInteger(sc));
        sc.close();
    }
}

