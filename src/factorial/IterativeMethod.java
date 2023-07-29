package factorial;

public class IterativeMethod {
    public static void main(String[] args) {
        int num=10;
        int factorialNumber=1;
        if (num==0|| num==1) {
            for (int i = 1; i <= num; i++) {
                factorialNumber = factorialNumber * i;
            }
        }

        System.out.println("Factorial number of given input:"+num+" is:"+factorialNumber);
    }
}
