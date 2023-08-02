package factorial;

import java.util.Scanner;

public class IterativeMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int num=scanner.nextInt();
        int factorialNumber=1;
        if (num==0|| num==1) {
            for (int i = 1; i <= num; i++) {
                factorialNumber = factorialNumber * i;
            }
        }

        System.out.println("Factorial number of given input:"+num+" is:"+factorialNumber);
    }
}
