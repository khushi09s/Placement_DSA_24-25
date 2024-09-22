package Lec3;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2*n - 3;
        while (row<=n) {
        //star
        int i = 1;
        while (i<=star) {
            System.out.print("* ");
            i++;
        }
        int j = 1;
        //space
        while (j<=space) {
            System.out.print("  ");
            j++;
        }
        int k = 1;
        if (row == n) {
            k=2;
        }
        //star
        while (k<=star) {
            System.out.print("* ");
            k++;
        }
        System.out.println();
        row++;
        star++;
        space = space-2;
        }
    }
}
