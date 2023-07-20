import java.util.*;

public class GenerateSubsets {
    static void subsets(int arr[], ArrayList<Integer> al, int n, int i) {
        if (i == n) {
            if (al.size() == 0) {
                System.out.println("{}");
                return;
            }
            for (int x : al) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }
        al.add(arr[i]);
        subsets(arr, al, n, i + 1);
        al.remove(al.size() - 1);
        subsets(arr, al, n, i + 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int arr[] = { 1, 2, 3 };
        int n = 3;
        subsets(arr, al, n, 0);
    }
}
