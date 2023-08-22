package findgcdorhcf;

import java.util.Scanner;

public class EuclidAlgorithmToFindGcdOrHcf {

    private static int findGcdOrHcf(int num1, int num2){

        while (num1!=num2){
            if (num1>num2) {
                num1 = num1 - num2;
            }else {
                num2=num2-num1;
            }
        }
        return num1;


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two Number ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println();
        System.out.println("Greatest Common Divisor or Highest Common Factor is: "+findGcdOrHcf(num1,num2));
    }
}
