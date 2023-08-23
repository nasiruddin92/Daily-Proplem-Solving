package findlcm;

import java.util.Scanner;

public class Lcm {

    private static int findLcm(int num1, int num2){
        int lcmNumber=Math.max(num1,num2);
        while (lcmNumber % num1 != 0 || lcmNumber % num2 != 0) {
            lcmNumber++;
        }
        return lcmNumber;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("Least Common Multiple is: "+findLcm(num1,num2));

    }
}
