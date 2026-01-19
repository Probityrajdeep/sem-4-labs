class StockArray {
    public static void main(String[] args) {
        String[][] stocks = {
            {"10:00", "TCS", "3500"},
            {"11:00", "INFY", "1450"},
            {"12:00", "WIPRO", "420"},
            {"13:00", "HCL", "1120"}
        };

        System.out.println("Time\tStock\tValue");
        for (int i = 0; i < stocks.length; i++) {
            System.out.println(stocks[i][0] + "\t" + stocks[i][1] + "\t" + stocks[i][2]);
        }
    }
}
