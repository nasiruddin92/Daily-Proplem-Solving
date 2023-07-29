package factorial;

public class RecursiveMethod {
    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial number of given input:"+num+" is:"+factorial(num));

    }

    private static int factorial(int num){
        if (num==0 || num==1){
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
}
