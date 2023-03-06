package basicMaths;

public class AmstrongNumber {
    public static boolean checkAmstrongNumber(int num){
        int giveNumber=num;
        int sum=0;
        while(giveNumber>0){
int value=giveNumber%10;
sum=(value*value*value)+sum;
giveNumber=giveNumber/10;
        }
        System.out.println("the given number is "+num);
        System.out.println("the amstrong number value is "+sum);
        if(num==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
      AmstrongNumber.checkAmstrongNumber(454);  
    }
}
