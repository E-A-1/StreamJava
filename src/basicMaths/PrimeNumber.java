package basicMaths;

public class PrimeNumber {
    public static boolean checkPrimeNumber(int num){
        int count=0;
        if(num==1){
            return true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.println(num+" is not a prime number");
            return true;
        }else{
            System.out.println(num+" is  a prime number");
            return false;
        }

    }
    public static void main(String[] args) {
        PrimeNumber.checkPrimeNumber(30);
    }
}
