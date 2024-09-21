public class Pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2*n - 1;
        while (row<=n) {
            //space
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            //star
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space--;
            star++;
            row++;
        }
    }
}
