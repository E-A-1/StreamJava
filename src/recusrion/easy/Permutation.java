package recusrion.easy;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private static void recursePermute(int index, int numArray[], List<List<Integer>> ans) {
        System.out.println("the index during recursion is " + index);

        if (index == numArray.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < numArray.length; i++) {
                ds.add(numArray[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < numArray.length; i++) {
            Permutation.swap(index, i, numArray);
            recursePermute(index + 1, numArray, ans);
            Permutation.swap(index, i, numArray);

        }
    }

    private static List<List<Integer>> permute(int numArray[]) {
        List<List<Integer>> answerList = new ArrayList<>();

        Permutation.recursePermute(0, numArray, answerList);

        return answerList;
    }

    private static void swap(int index, int currentIndex, int numArray[]) {
        int temp = numArray[index];
        numArray[index] = numArray[currentIndex];
        numArray[currentIndex] = temp;
    }

    public static void main(String[] args) {
        int numsArray[] = { 1, 2, 3 };
        System.out.println(Permutation.permute(numsArray));
    }
}
