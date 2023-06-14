package practicePrincy;

public class SubString {
    public static String reverseString(String inputValue) {
        char[] inputCharArray = inputValue.toCharArray();
        String result = "";
        for (int i = inputCharArray.length - 1; i >= 0; i--) {
            result += inputCharArray[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String inputValue = "Welcome";
        System.out.println(SubString.reverseString(inputValue));
    }
}
