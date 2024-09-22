package Lec3;

import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2 +1;
        int space = -1;
        while (row<=n) {
            //star
            int i = 1;
            while (i<= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            //space
            while (j<= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if (row == 1 || row == n) {
                k = 2;
            }
            //star
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            //mirror
            if (row<= n/2) {
                star--;
                space=space+2;
            } else{
                star++;
                space=space-2;
            }
            System.out.println();
            row++;
        }
    }
}
