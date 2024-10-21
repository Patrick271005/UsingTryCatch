import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        System.out.println("Please enter a number between  0 - 9 : ");


        try(Scanner scan=new Scanner(System.in))
        {
            int myNum = -1;
            while (myNum <0 || myNum > 9)
            {
                String input = scan.nextLine();

                try
                {
                    //Parse the input to an integer
                    myNum = Integer.parseInt(input);
                    //check if the number is between 0 and 9
                    if (myNum >=0 && myNum  <=9)
                    {
                        System.out.println(" You entered " + myNum);
                    }
                    else
                    {
                        System.out.println("Not a valid number");
                    }
                }
                catch(NumberFormatException ae)
                {
                    System.out.println("retry not a valid number " + ae.getMessage());
                }
            }
            //read user input as a String


        }


    }
}

