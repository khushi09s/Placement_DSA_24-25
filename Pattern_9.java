public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space= n-1;
        while (row<=n) {
            int i = 1;
            //space
            while (i<=space) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            //star
            while (j<=star) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
        row++;
        star=star+2;
        space--;       
        }
    }
}
