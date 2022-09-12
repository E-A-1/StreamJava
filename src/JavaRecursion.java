public class JavaRecursion implements RecursionPractice {

    static int count=0;

    public static void printNumber(){
        count++;
        System.out.println("the count value is "+count);
        if(count<5){
            System.out.println("Inside the if condition of count"+count);
printNumber();
        }
    }
    static int factorial(int n){     
        System.out.println("the factorial function called"); 
        System.out.println("the input number is "+n); 
        System.out.println("the calculated value till now is "+count);
        if (n == 1)   
        {
            return 1;      

        }   
        else      {
            System.out.println("before"+count);

            count= (n * factorial(n-1));    
            System.out.println("after"+count);
            return count;  

        }
  }      

    public static void main(String[] args) {
        JavaRecursion javaRecursion=new JavaRecursion();
        javaRecursion.getFactorialNumberWithoutRecursion(6);
        int factorialValue=factorial(5);
        System.out.println("the factorial value is "+factorialValue);
    }
    /*

    Find the factorial of a number using recursion
     * 
     */
    @Override
    public  void getFactorialNumberWithoutRecursion(int number) {
        int inputNumber=number;
        int factorialValue=1;
        if(number>0){

for(int factNumber=number;factNumber>0;factNumber--){
    factorialValue=factorialValue*factNumber;
    number--;
}
System.out.println("the factorial of the number "+inputNumber+" is "+factorialValue);
        }
    }
    @Override
    public void getFactorialNumberWithRecursion(int number) {
        // TODO Auto-generated method stub
        
    }
    

    



    
}
