package Lec3;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        while (row<=n) {
            //space
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            //line change
            System.out.println();
            row++;
            space++;
            star--;
           
        }
    }
}
