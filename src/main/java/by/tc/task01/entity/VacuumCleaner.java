package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	private Double powerConsumption = null;
	private String filterType = null;
	private String bagType = null;
	private String wandType = null;
	private Double motorSpeedRegulation = null;
	private Double cleaningWidth = null;

    public VacuumCleaner() {}

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public Double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public Double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public void assignCharacteristic(String cr, Object value) {
        switch (cr) {
            case "POWER_CONSUMPTION": {
                powerConsumption = (Double) value;
                break;
            }
            case "FILTER_TYPE": {
                filterType = (String) value;
                break;
            }
            case "BAG_TYPE": {
                bagType = (String) value;
                break;
            }
            case "WAND_TYPE": {
                wandType = (String) value;
                break;
            }
            case "MOTOR_SPEED_REGULATION": {
                motorSpeedRegulation = (Double) value;
                break;
            }
            case "CLEANING_WIDTH": {
                cleaningWidth = (Double) value;
                break;
            }
         }
    }
}
