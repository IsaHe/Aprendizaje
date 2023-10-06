package OOP;

public class Coche {
    //Es recomendable encaplsular el codigo y usar setters y getterers
    private String make;
    private String model;
    private int year;

    Coche(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }
    Coche(Coche x) {        //Este es el constructor para copiar
        this.copy(x);
    }

    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Coche x) {     //Este seria el metodo para copiar
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
