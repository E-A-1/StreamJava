package array.medium;

public class MooresVotingAlgo {
    /*
     * Interesting algo to find if there is element present in Array that is greater
     * than N/2 length
     * 
     * Time Complexity: O(N) + O(N), where N = size of the given array.
     * Reason: The first O(N) is to calculate the count and find the expected
     * majority element. The second one is to check if the expected element is the
     * majority one or not.
     * 
     * Note: If the question states that the array must contain a majority element,
     * in that case, we do not need the second check. Then the time complexity will
     * boil down to O(N).
     * 
     * Space Complexity: O(1) as we are not using any extra space.
     */

    public static void findMaxElement(int arr[]) {

        Integer element = null;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count++;
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element)
                cnt1++;
        }

        if (cnt1 > ((arr.length) / 2)) {
            System.out.println("the max element that occured greater than n/2 is " + element);

        } else {
            System.out.println("No majority element found");
        }

        // checking if the stored element
        // is the majority element:

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 2, 2 };
        MooresVotingAlgo.findMaxElement(arr);
    }

}
