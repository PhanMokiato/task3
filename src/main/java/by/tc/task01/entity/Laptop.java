package by.tc.task01.entity;

public class Laptop extends Appliance{
	private Double batteryCapacity;
    private String os = null;
    private Double memoryRom;
    private Double systemMemory;
    private Double cpu;
    private Double displayInches;

    public Laptop() {}

    public Double getDisplayInches() {
        return displayInches;
    }

    public Double getCpu() {
        return cpu;
    }

    public Double getSystemMemory() {
        return systemMemory;
    }

    public Double getMemoryRom() {
        return memoryRom;
    }

    public String getOs() {
        return os;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void assignCharacteristic(String cr, Object value) {
        switch(cr) {
            case "BATTERY_CAPACITY":{
                batteryCapacity = (Double) value;
                break;
            }
            case "OS": {
                os = (String) value;
                break;
            }
            case "MEMORY_ROM": {
                memoryRom = (Double) value;
                break;
            }
            case "SYSTEM_MEMORY": {
                systemMemory = (Double) value;
                break;
            }
            case "CPU": {
                cpu = (Double) value;
                break;
            }
            case "DISPLAY_INCHS": {
                displayInches = (Double) value;
                break;
            }
        }
    }
}
