package CountTheNumberOfDigitsInANumber;

import java.util.Scanner;

public class CountNumberOfDigitsInANumber {

   private static int countDigits(int num){
        int count=0;

        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println(countDigits(num)+" Digit present in "+num+ " number");
    }
}
