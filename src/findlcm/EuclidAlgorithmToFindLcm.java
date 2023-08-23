package findlcm;

import java.util.Scanner;

public class EuclidAlgorithmToFindLcm {


    private static int findLcm(int num1, int num2){
        return (num1*num2)/findGcd(num1,num2);
    }

    private static int findGcd(int num1,int num2){
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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("Least Common Multiple is: "+findLcm(num1,num2));
    }
}
