package practicePrincy;

public class AsterickCheck {
    /*
     * Asterisk sum
     */
    public static boolean checkAsterickSameCharCondition(String inputString) {
        boolean isConditionMet = true;
        // Splitting the input based on * (asterisk), getting the wordArray
        String[] wordArray = inputString.split("\\*");

        System.out.println(wordArray.length);
        for (int i = 0; i < wordArray.length - 1; i++) {
            System.out.println(i);
            /*
             * getting the current word , and the next word. Comparing the last character of
             * the current word with the last char of next word , if it's not equal. then
             * assign the result to false.
             * 
             * Note:
             * converting the character to lower case , since its case insensitive
             *
             */
            String currentWord = wordArray[i];
            String nextWordToCompare = wordArray[i + 1];
            char currentWordsLastCharacter = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));
            char nextWordsFirstCharacter = Character
                    .toLowerCase(nextWordToCompare.charAt(0));

            System.out.println("currentWord ->" + currentWord + "last char ->" + currentWordsLastCharacter);
            System.out.println("nextWord->" + nextWordToCompare + "first char -> " + nextWordsFirstCharacter);

            if (currentWordsLastCharacter != nextWordsFirstCharacter) {
                isConditionMet = false;
            }

        }
        return isConditionMet;

    }

    public static void main(String[] args) {
        String inputValue = "WelcomE*elija*avprincy*no";
        System.out.println(AsterickCheck.checkAsterickSameCharCondition(inputValue));
    }
}
