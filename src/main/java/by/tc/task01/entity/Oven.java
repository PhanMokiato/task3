package by.tc.task01.entity;

public class Oven extends Appliance{
    private Double powerConsumption = null;
    private Double weight = null;
    private Double capacity = null;
    private Double depth = null;
    private Double height = null;
    private Double width = null;

    public Oven() {}

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getCapacity() {
        return capacity;
    }

    public Double getDepth() {
        return depth;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public void assignCharacteristic(String cr, Object value) {
        switch (cr) {
            case "POWER_CONSUMPTION": {
                powerConsumption = (Double) value;
                break;
            }
            case "WEIGHT": {
                weight = (Double) value;
                break;
            }
            case "CAPACITY": {
                capacity = (Double) value;
                break;
            }
            case "DEPTH": {
                depth = (Double) value;
                break;
            }
            case "HEIGHT": {
                height = (Double) value;
                break;
            }
            case "WIDTH": {
                width = (Double) value;
                break;
            }
        }
    }
}
