package by.tc.task01.entity;

public class Laptop extends Appliance{
	private String batteryCapacity = null;
    private String os = null;
    private String memoryRom = null;
    private String systemMemory = null;
    private String cpu = null;
    private String displayInches = null;

    public Laptop() {}

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }
}
