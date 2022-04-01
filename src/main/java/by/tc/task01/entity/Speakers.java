package by.tc.task01.entity;

public class Speakers extends Appliance{
	private String powerConsumption = null;
	private String numberSpeakers = null;
	private String frequencyRange = null;
	private String cordLength = null;

    public Speakers() {}

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getNumberSpeakers() {
        return numberSpeakers;
    }

    public void setNumberSpeakers(String numberSpeakers) {
        this.numberSpeakers = numberSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getCordLength() {
        return cordLength;
    }

    public void setCordLength(String cordLength) {
        this.cordLength = cordLength;
    }
}
