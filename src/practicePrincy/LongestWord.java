package practicePrincy;

public class LongestWord {

    private static String getLongestWord(String input) {
        // 1. convert the string to string array which means split the sentence into
        // word array

        // 2. Loop the word array and find the word with lonest length;

        String[] wordArray = input.split(" ");

        int maxLength = 0;

        String result = "";

        // find the max length of the word

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > maxLength) {
                // if the current word length is greater than maxLength, then update the
                // maxlength and
                // assign the word to the result
                maxLength = Math.max(maxLength, wordArray[i].length());
                result = wordArray[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(LongestWord.getLongestWord("I am running nunning am hello"));
    }
}
