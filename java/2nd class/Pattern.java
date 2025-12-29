//Pattern printing
//q1
//*
//1 2
//* * *
//1 2 3 4
//* * * * *

class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
