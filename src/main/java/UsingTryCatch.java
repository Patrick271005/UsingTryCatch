import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        int topNum =20;
        int baseNum=0;
        int total=0;
        System.out.println("Please enter a number between  0 - 9 : ");
        Scanner scan=new Scanner(System.in);

        //read user input as a String
        String input = scan.nextLine();

        //Parse the input to an integer
        int myNum = Integer.parseInt(input);

        //check if the number is between 0 and 9
        if (myNum >=0 && myNum  <=9)
        {
            System.out.println(" You entered " + myNum);
        }

       /* try
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
        System.out.println("The total is " + total);*/
    }
}
