package recusrion;

public class PrintNTimes {
    static void printNTimes(int n){
        System.out.println(n);
        if(n>0){
          n--;
            printNTimes(n);
        }else{
            return;

        }
    }
    public static void main(String[] args) {
        PrintNTimes.printNTimes(5);
    }
}
