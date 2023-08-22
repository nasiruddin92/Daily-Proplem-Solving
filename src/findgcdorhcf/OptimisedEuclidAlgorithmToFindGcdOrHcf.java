package findgcdorhcf;

import java.util.Scanner;

public class OptimisedEuclidAlgorithmToFindGcdOrHcf {

    private static int findGcdOrHcf(int num1, int num2){

        while (num1!=0 && num2!=0){
            if (num1>num2){
                num1=num1%num2;
            }else {
                num2=num2%num1;
            }
        }
        if (num1!=0){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter two number ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("Greatest Common Divisor or Highest Common Factor is: "+findGcdOrHcf(num1,num2));
    }
}
