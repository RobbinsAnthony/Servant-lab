package Robbins.Anthony.servant;

public class Food {

    private String name;
    private Boolean isSafe;

    public Food(String name, Boolean isSafe) {
        this.name = name;
        this.isSafe = isSafe;
    }

    public String getName() {
        return name;
    }

    public Boolean getSafe() {
        return isSafe;
    }
}
