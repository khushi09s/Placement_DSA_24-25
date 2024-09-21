public class Pattern_11 {
    public static void main(String[] args) {
        int n = 5;
        int space = 2*n -1;
        int row = 1;
        int star = 1;
        while (row<=n) {
            int i =1;
            //space
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j =1;
            //star
            while (j<=star) {
                System.out.print(" *  ");
                j++;
            }
            System.out.println();
            row++;
            star++;
            space--;
        }
    }
}
