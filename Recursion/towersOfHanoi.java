/*
    Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. 
    The objective of the puzzle is to move the entire stack to another rod, 
    obeying the following simple rules: 

        - Only one disk can be moved at a time.
        - Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack 
            i.e. a disk can only be moved if it is the uppermost disk on a stack.
        - No disk may be placed on top of a smaller disk.

    Solution :
    The pattern here is :
        - Shift 'n-1' disks from 'A' to 'B', using C.
        - Shift last disk from 'A' to 'C'.
        - Shift 'n-1' disks from 'B' to 'C', using A.

*/

class towersOfHanoi {
    public static void function(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move 1 disk from peg " + from + " to peg " + to);
            return;
        }

        function(n - 1, from, aux, to);

        System.out.println("Move disk from peg " + from + " to peg " + to);

        function(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        function(3, 'a', 'b', 'c');
    }
}

/*
 * Time complexity: O(2^n)
 * Space complexity: O(n)
 */