package primenumber;

import java.util.Scanner;

public class SieveOfEratosthenesToFindPrimeNumber {
    private static boolean isPrime(int num){
        if (num<=1)
            return false;
        if (num<=3)
            return true;
        if (num%2==0 || num%3==0)
            return false;
        for (int i=5;i<=Math.sqrt(num);i=i+6){
            if (num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }

//    private static void printPrimes(int num){
////        boolean[] prime=new boolean[num+1];
////        for (int i=2;i<=num;i++){
////            if (!prime[i]){
////                for (int j=i*2;j<=num;j=j+i){
////                    prime[j]=true;
////                }
////            }
////        }
////        for (int i=2;i<=num ;i++){
////            if (!prime[i])
////                System.out.println(i);
////        }
////
////    }


//    //more optimized inner j loop
//    private static void printPrimes(int num){
//        boolean[] prime=new boolean[num+1];
//        for (int i=2;i<=num;i++){
//            if (!prime[i]){
//                for (int j=i*i;j<=num;j=j+i){
//                    prime[j]=true;
//                }
//            }
//        }
//        for (int i=2;i<=num ;i++){
//            if (!prime[i])
//                System.out.println(i);
//        }
//
//    }

    //more extra optimized to first loop
    private static void printPrimes(int num){
        boolean[] prime=new boolean[num+1];
        for (int i=2;i*i<=num;i++){
            if (!prime[i]){
                for (int j=i*i;j<=num;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for (int i=2;i<=num ;i++){
            if (!prime[i])
                System.out.println(i);
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a Number ");
        int num=scanner.nextInt();
        printPrimes(num);
    }
}
