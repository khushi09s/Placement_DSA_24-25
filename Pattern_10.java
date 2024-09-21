public class Pattern_10 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 2*n - 1;
        int space= 0;
        while (row<=n) {
            int i = 1;
            //space
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            //star
            while (j<=star) {
                System.out.print("  * ");
                j++;
            }
            System.out.println();
        row++;
        star=star-2;
        space= space+2;       
        }
    }
}
