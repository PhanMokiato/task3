package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	private Double powerConsumption = null;
	private Double weight = null;
	private Double freezerCapacity = null;
	private Double overallCapacity = null;
	private Double height = null;
	private Double width = null;

    public Refrigerator() {}

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getFreezerCapacity() {
        return freezerCapacity;
    }

    public Double getOverallCapacity() {
        return overallCapacity;
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
            case "FREEZER_CAPACITY": {
                freezerCapacity = (Double) value;
                break;
            }
            case "OVERALL_CAPACITY": {
                overallCapacity = (Double) value;
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
