package Lec4;

public class Dec_To_Bin {
    public static void main(String[] args) {
        int n = 47;
        int sum = 0;
        int mul = 1;
        while (n>0) {
            int rem = n%2;
            sum = sum+rem * mul;
            mul = mul*10;
            n= n /2;
        }
        System.out.println(sum);
    }
}
