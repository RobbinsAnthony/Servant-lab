package Robbins.Anthony.servant;

public class Robot {
    private String name;
    private String modelNumber;



    public Robot(String name, String modelNumber) {
        this.name = name;
        this.modelNumber = modelNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }


}





