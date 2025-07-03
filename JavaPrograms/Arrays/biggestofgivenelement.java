 /* 
 * Write a Java program (WAP) to find the: Biggest element Second biggest element Smallest element Second smallest element from the given array.
   In[] n = {5, 8, 6, 4, 7};
   Big = 8   Second Big = 7   Small = 4   Second Small = 5
 * */
package Arrays;
public class biggestofgivenelement {
    public static void main(String[] args) {
        int[] n = {5, 8, 6, 4, 7};

        int big = n[0];
        int secondBig = n[0];
        int small = n[0];
        int secondSmall = n[0];

        // Find biggest and smallest
        for (int i = 1; i < n.length; i++) {
            if (n[i] > big) {
                secondBig = big;
                big = n[i];
            } else if (n[i] > secondBig && n[i] != big) {
                secondBig = n[i];
            }

            if (n[i] < small) {
                secondSmall = small;
                small = n[i];
            } else if (n[i] < secondSmall && n[i] != small) {
                secondSmall = n[i];
            }
        }

        System.out.println("Big = " + big);
        System.out.println("Second Big = " + secondBig);
        System.out.println("Small = " + small);
        System.out.println("Second Small = " + secondSmall);
    }
}

