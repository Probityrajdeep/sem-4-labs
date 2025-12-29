//q2
//A B C D
//E G I K
//L M N O
//P R T V
class Pattern2 {
    public static void main(String[] args) {

        char ch = 'A';

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch + " ");
                ch = (char)(ch + 2);
            }
            System.out.println();
        }
    }
}
