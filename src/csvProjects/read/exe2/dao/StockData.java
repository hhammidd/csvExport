package csvProjects.read.exe2.dao;

import csvProjects.read.exe2.model.StockRecord;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockData {
    private List<StockRecord> records;
    public StockData() {
        records = new ArrayList<>();
    }

    public StockRecord getRecordNumber(int i){
        return records.get(i);
    }
    public int getNumberOfRecords(){
        return records.size();
    }

    // reads the file in filepath. Create stockRecord objects and add the to record
    //
    public void loadDataFromFile(String filepath){


        try{
            FileReader fr = new FileReader(filepath);
            Scanner scanner = new Scanner(fr);

            String line;
            StockRecord record;
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] results = line.split(",");

                double opening = Double.parseDouble(results[1]);     // pars the results
                double high = Double.parseDouble(results[2]);
                double low = Double.parseDouble(results[3]);
                double closing = Double.parseDouble(results[4]);

                record = new StockRecord(results[0], low, high ,opening,closing );
                records.add(record);
            }
            scanner.close();
        }catch (Exception e ){
            System.out.println("Error :"+ e.getMessage());
        }


    }
}
