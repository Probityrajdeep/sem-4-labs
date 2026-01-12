public class StockData {
    public static void main(String[] args) {        String[][] stocks = {
                {"09:00", "120"},
                {"10:00", "125"},
                {"11:00", "130"},
                {"12:00", "128"}
        };

        System.out.println("Stock Prices at Different Times:");
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Time: " + stocks[i][0] +
                               " | Price: $" + stocks[i][1]);
        }
    }
}