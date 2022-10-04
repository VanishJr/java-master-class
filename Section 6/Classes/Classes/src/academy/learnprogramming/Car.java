package academy.learnprogramming;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String isValidModel = model.toLowerCase();
        if (isValidModel.equals("carrera") || isValidModel.equals("911")) {
            this.model = model;
        } else {
            this.model = "Unkown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
