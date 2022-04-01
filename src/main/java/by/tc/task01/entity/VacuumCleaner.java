package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	private String powerConsumption = null;
	private String filterType = null;
	private String bagType = null;
	private String wandType = null;
	private String motorSpeedRegulation = null;
	private String cleaningWidth = null;

    public VacuumCleaner() {}

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public String getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
