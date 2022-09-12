public class JavaRecursion {

    static int count=0;

    public static void printNumber(){
        count++;
        System.out.println("the count value is "+count);
        if(count<5){
            System.out.println("Inside the if condition of count"+count);
printNumber();
        }
    }
    public static void main(String[] args) {
        printNumber();
    }
    
}
