package Lec3;

public class Pattern25 {
    public static void main(String[] args) {
        int n =5;
        int row = 1;
        int space = n-1;
        int star = 1;
        int count = 1;
        while (row<=n) {
            //space
            int i = 1;
            while (i<=space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while (j<=star) {
                System.out.print(count+"\t");
                count++;
                j++;
            }
            System.out.println();
            row++;
            star = star + 2;
            space--;
        }
    }
}
