package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	private String powerConsumption = null;
	private String weight = null;
	private String freezerCapacity = null;
	private String overallCapacity = null;
	private String height = null;
	private String width = null;

    public Refrigerator() {}

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public String getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(String overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
