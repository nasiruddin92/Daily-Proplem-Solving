package bitmanipulation;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println("Binary of " + num + " is :");
        String binary=deciamlToBinaryConversion(num);
        System.out.println(binary);
        System.out.println("Decimal of " + binary + " is :");
        System.out.println(binaryToDecimal(binary));
    }

    private static String deciamlToBinaryConversion(int num){
        String binary="";
        while (num>=1){
            int reminder=num%2;
            num=num/2;
            binary=reminder+binary;
        }
        return binary;
    }

    private static int binaryToDecimal(String decimal){
        int result=0;
        int powerOf2=1;
        for (int i=decimal.length()-1;i>=0;i--){
            if (decimal.charAt(i)=='1'){
                result=result+powerOf2;
            }
            powerOf2=powerOf2*2;
        }
        return result;
    }
}
