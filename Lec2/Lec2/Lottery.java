package Lec2;

public class Lottery {
    public static void main(String[] args) {
        int m = 350;
        if (m >= 10 && m <= 15) {
            System.out.println("Mac");
            if (m >= 13 && m <= 15) {
                System.out.println("Mac1");
            } else {
                System.out.println("Mac2");
            }
        }

        if (m >= 16 && m <= 25) {
            System.out.println("Cycle");
        } else if (m >= 40 && m <= 50) {
            System.out.println("Mirchi");
        } else if (m >= 300 && m <= 400) {
            System.out.println("Car");
            if (m >= 401 && m <= 500) {
                System.out.println("BMW");
            } else {
                System.out.println("Audi");
            }
        }

        if (m >= 1000 && m <= 1100) {
            System.out.println("Chips");
        } else if (m >= 1100 && m <= 1200) {
            System.out.println("Red Chips");
        }
    }
}
