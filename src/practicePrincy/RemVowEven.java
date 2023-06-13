package practicePrincy;

import java.util.List;

public class RemVowEven {

    private static String removeVowelsFromEvenIndex(String inputValue) {
        // converting string to char array
        char[] inputStrArray = inputValue.toCharArray();

        String resultStr = "";

        for (int i = 0; i < inputStrArray.length; i++) {
            // 1. check if it's a even index
            // 2. check if it's vowel
            // 3. if above two condition satisfies , remove that character from the string

            if (!((i % 2 == 0) && ((inputStrArray[i] == 'a' || inputStrArray[i] == 'e' || inputStrArray[i] == 'i'
                    || inputStrArray[i] == 'o' || inputStrArray[i] == 'u')))) {
                resultStr += inputStrArray[i];
            }
        }

        return resultStr;

    }

    public static void main(String[] args) {
        System.out.println(RemVowEven.removeVowelsFromEvenIndex(""));
    }

}
