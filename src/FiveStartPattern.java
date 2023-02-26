public class FiveStartPattern {
    /*  
    ******
    ******
    ******
    ******
    ******
    */
    public void printFiveStartPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public void printLeftAngledTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    /*
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    public void printLeftAngledTriangleWithIncreasingNumber() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");

        }
    }
    /*
     * 1
     * 22
     * 333
     * 4444
     * 55555
     */

    public void printLeftAngledTriangleWithSameNumber() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");

        }
    }
    /*
    
    *****
    ****
    ***
    **
    *
    
     */

    public void printLeftAngledTriangleInReverse() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
/*
     *     
    ***    
   *****   
  *******  
 *********  
 */
/* 
for printing spaces formula = (5-i-1)
for printing start formula =((2*i)+1)
*/
    public void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= (5 - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) + 1); k++) {
                System.out.print("*");
            }
            for (int z = 0; z <= (5 - i - 1); z++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        FiveStartPattern pat = new FiveStartPattern();
        pat.printTriangle();
    }
}
