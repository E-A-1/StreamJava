 class Palindrome {
    
public static void main(String[] args) {
   boolean result= checkPalindrome("HelleH");
   System.out.println("the result is "+result);
}
    public static boolean checkPalindrome(String variable){
        String inputString=variable;
        String reversedString="";
        char[] charArray=inputString.toCharArray();
        for(int i=inputString.length()-1;i>=0;i--){
            reversedString=reversedString+charArray[i];
        }
        System.out.println(reversedString.toLowerCase());
        System.out.println(inputString.toLowerCase());
        if(reversedString.toLowerCase().equals(inputString.toLowerCase())){
            return true;
        }
        return false;
    }
}

