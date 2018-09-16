package csvProjects.read.exe2.model;

public class StockRecord {
    private double low, high , opening, cliosing;
    private String date;

    public StockRecord(String date, double low, double high, double opening, double cliosing) {
        this.low = low;
        this.high = high;
        this.opening = opening;
        this.cliosing = cliosing;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getOpening() {
        return opening;
    }

    public void setOpening(double opening) {
        this.opening = opening;
    }

    public double getCliosing() {
        return cliosing;
    }

    public void setCliosing(double cliosing) {
        this.cliosing = cliosing;
    }
}
