package printallthedivisorsofagivennumber;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEfficientPrintAllTheDivisorsOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=scanner.nextInt();
        System.out.println("Divisors of " + num + " are :");
        List<Integer> divisors=findDivisorsOfNumber(num);
        Collections.sort(divisors);
        for (int divisor: divisors){
            System.out.print(divisor+" ");
        }
    }

    private static List<Integer> findDivisorsOfNumber(int num){
        List<Integer> divisors=new ArrayList<>();
        for (int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                divisors.add(i);
                if (num/i!=i){
                    divisors.add(num/i);
                }
            }
        }
        return divisors;
    }
}
