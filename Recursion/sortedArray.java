/*
    Problem-2 
    Given an array, check whether the array is in sorted order with recursion.
*/

public class sortedArray {
    public static boolean function(int[] array, int n) {
        if (n == 0 || n == 1)
            return true;

        if (array[n - 1] < array[n - 2])
            return false;

        return function(array, n - 1);

    }

    public static void main(String[] args) {
        System.out.println(function(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 7));
        System.out.println(function(new int[] { 1, 3, 2, 4, 5, 6, 7 }, 7));
    }
}


/*
 * Time : O(n)
 * Space : O(n) for recursive stack 
 */