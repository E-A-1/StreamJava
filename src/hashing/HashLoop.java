package hashing;

public class HashLoop {
    public static void main(String[] args) {

        int hashArray[] = { 1, 2, 3, 3, 4, 5, 6, 4 };
        int[] hash = new int[hashArray.length];
        for (int i = 0; i < hashArray.length; i++) {
            hash[hashArray[i]] += 1;
        }
        System.out.println(hash);

        for (int i = 0; i < hashArray.length; i++) {
            System.out.println(hash[i]);
        }
    }
}
