package recusrion;

public class FactorialRecursion {

    // Parameterized
    static int factorial(int num, int fact) {
        int factorialValue = fact;
        if (num <= 0) {
            return fact;
        }
        factorialValue = factorialValue * num;
        return factorial(num - 1, factorialValue);
    }

    static int factorialParameterized(int num){
        if(num==0){
            return 1;
        }

        return num*factorialParameterized(num-1);
    }

    public static void main(String[] args) {
        System.out.println(FactorialRecursion.factorialParameterized(6));
    }
}
