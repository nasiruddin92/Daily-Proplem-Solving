package findgcdorhcf;

import java.util.Scanner;

public class GcdOrHcf {

     private static int gcdOrLcf(int num1, int num2){
        int min=0;
        if (num1<num2){
            min=num1;
        }else {
            min=num2;
        }

        for (int i=min;i>=1;i--){
            if (num1%i==0 && num2%i==0){
                return i;
            }
        }
        return 1;
     }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Number: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Greatest Common Divisor or Highest Common Factor is: "+gcdOrLcf(num1,num2));
    }
}
