package Week2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        //int b1 = a.nextInt();
        naopakoZvijezda(a1);
    }

    public static void first() {
        Scanner UserInput = new Scanner(System.in);
        String password = "carrot";

        while (true) {
            String str = UserInput.nextLine();
            if (str.equals(password)) {
                System.out.println("Right!\n");
                System.out.println("The secret is : jryy qbar");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void second() {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int sum = 0;
        sum = a + b + c;
        System.out.println("Sum is : " + sum);
    }

    public static void third() {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now : " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

    public static void fourth() {
        Scanner Nums = new Scanner(System.in);
        int first = Nums.nextInt();
        int second = Nums.nextInt();
        if (first > second) {
            System.out.println("");
        } else {
            for (int i = first; i <= second; i++) {
                System.out.println(i);
            }
        }
    }

    public static void fifth() {
        Scanner power = new Scanner(System.in);
        int num = power.nextInt();
        int result = 0;
        for (int i = 0; i <= num; i++) {
            int term = (int) Math.pow(2, i);
            result += term;
        }
        System.out.println(result);
    }

    public static void sixth() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void seventh(int amount) {
        for (int i = 0; i <= amount; i++) {
            System.out.print("*");
        }
    }

    public static void eight() {
        Scanner a = new Scanner(System.in);
        int numberOfRows = a.nextInt();
        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void nineth() {
        Scanner a = new Scanner(System.in);
        int numberOfRows = a.nextInt();
        for (int i = 1; i <= numberOfRows + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void tenth() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //*boolean guess = false;
        int counter = 1;
        while (true) {
            int guessTry = sc.nextInt();

            if (number == guessTry) {
                System.out.println("Congratulations, your guess is correct! ");
                break;
            } else if (number > guessTry) {
                System.out.println("The number is greater, guess made : " + counter);
                counter++;
            } else if (number < guessTry) {
                System.out.println("The number is lesser, guess made : " + counter);
                counter++;
            }
        }
    }

    public static void palindrome() {
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length(); j > i; j--) {
                if (str1.charAt(i) == str1.charAt(j - i - 1)) {
                    isPalindrome = true;
                } else
                    isPalindrome = false;
            }
        }
    if(isPalindrome == true)
    {
        System.out.println("Palindrome");
    }
    else
        System.out.println("Not");
    }
    public static void num3()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i + "* 3 = " + i*3);
        }
    }
    public static int baza(int baza, int eksponent)
    {
        int result = 1;
        for(int i=0; i<eksponent;i++)
        {
            result *= baza;
        }
        return result;
    }
    public static void zvijezda1(int number)
    {
        for(int i=number; i>0;i--)
        {
            for(int j=i; j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void trougao(int number){
        for(int i = 1; i <= number ;i++)
        {
            for(int j = 1 ; j <= number - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int fibonacci(int num)
    {
        if(num == 0 )
        {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(num - 1) + fibonacci(num-2);
        }
    }
    public static void zvijezdaOpet(int num)
    {
        for(int i=0; i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void naopakoZvijezda(int num)
    {
        for(int i = 1;i<=num;i++)
        {
            for(int j = num;j>=i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


