package recusrion;

public class PrintNTimes {
    static void printNTimes(int n){
        System.out.println("the value is "+n);
        while(n>0){
            System.out.println(n);
            n=n-1;
            printNTimes(n);
        }
    }
    public static void main(String[] args) {
        PrintNTimes.printNTimes(5);
    }
}
