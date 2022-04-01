package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private String batteryCapacity = null;
	private String displayInches = null;
	private String memoryRom = null;
	private String flashMemory = null;
	private String color = null;

    public TabletPC() {}

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getFlashMemory() {
        return flashMemory;
    }

    public void setFlashMemory(String flashMemory) {
        this.flashMemory = flashMemory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
