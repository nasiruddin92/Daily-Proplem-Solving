package findgcdorhcf;

import java.util.Scanner;

public class EuclideanAlgorithmUsingRecursion {

    private static int findGcdOrHcf(int num1, int num2){
        while (num2==0){
            return num1;
        }
        return findGcdOrHcf(num2,num1%num2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two number ");
        int num1=scanner.nextInt();
        int  num2=scanner.nextInt();

        System.out.println("Greatest Common Divisor or Highest Common Factor is: "+findGcdOrHcf(num1,num2));
    }
}
