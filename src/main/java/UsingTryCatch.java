import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        int topNum =20;
        int baseNum=0;
        int total=0;
        Scanner scan=new Scanner(System.in);

        try
        {
            System.out.println("Please enter a number");
            topNum = scan.nextInt();
            System.out.println("Please enter a  Second number");
            total=topNum/baseNum;
            baseNum = scan.nextInt();
            total = topNum / baseNum;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Please enter values greater then 0" + ae.getMessage());
        }
        finally {
            scan.close();
        }
        System.out.println("The total is " + total);
    }
}
