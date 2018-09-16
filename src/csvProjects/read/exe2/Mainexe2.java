package csvProjects.read.exe2;

import csvProjects.read.exe2.dao.StockData;

public class Mainexe2 {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        stockData.loadDataFromFile("test.csv");

        System.out.println(stockData.getNumberOfRecords());
    }
}
