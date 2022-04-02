package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private Double batteryCapacity = null;
	private Double displayInches = null;
	private Double memoryRom = null;
	private Double flashMemory = null;
	private String color = null;

    public TabletPC() {}

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public Double getDisplayInches() {
        return displayInches;
    }

    public Double getMemoryRom() {
        return memoryRom;
    }

    public Double getFlashMemory() {
        return flashMemory;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void assignCharacteristic(String cr, Object value) {
        switch(cr) {
            case "BATTERY_CAPACITY":{
                batteryCapacity = (Double) value;
                break;
            }
            case "COLOR": {
                color = (String) value;
                break;
            }
            case "MEMORY_ROM": {
                memoryRom = (Double) value;
                break;
            }
            case "FLASH_MEMORY_CAPACITY": {
                flashMemory = (Double) value;
                break;
            }
            case "DISPLAY_INCHS": {
                displayInches = (Double) value;
                break;
            }
        }
    }
}
