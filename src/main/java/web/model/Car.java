package web.model;

public class Car {
    private String model;
    private int series;
    private String complect;


    public Car(String model, int series, String complect) {
        this.model = model;
        this.series = series;
        this.complect = complect;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getComplect() {
        return complect;
    }

    public void setModel(String model) {
        this.model = model;
    }}
