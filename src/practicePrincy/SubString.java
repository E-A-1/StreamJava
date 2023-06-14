package practicePrincy;

public class SubString {
    public static String reverseString(String inputValue) {
        // Converting a string to charArray
        char[] inputCharArray = inputValue.toCharArray();
        String result = "";
        for (int i = inputCharArray.length - 1; i >= 0; i--) {
            result += inputCharArray[i];
        }

        return result;
    }

    public static String subString(String inputValue) {
        // Converting a string to charArray
        char[] inputCharArray = inputValue.toCharArray();
        String result = "";
        for (int i = inputCharArray.length - 1; i >= 0; i--) {
            result += inputCharArray[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String inputValue = "Princy";
        System.out.println(SubString.reverseString(inputValue));

        System.out.println(inputValue.substring(0, 6));
    }
}
