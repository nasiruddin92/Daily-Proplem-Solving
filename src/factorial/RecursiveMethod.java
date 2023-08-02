package factorial;

import java.util.Scanner;

public class RecursiveMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int num=scanner.nextInt();
        System.out.println("Factorial number of given input:"+num+" is:"+factorial(num));

    }

    private static int factorial(int num){
        if (num==0 || num==1){
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
}
