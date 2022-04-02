package by.tc.task01.entity;

public class Speakers extends Appliance{
	private Double powerConsumption = null;
	private Double numberSpeakers = null;
	private Double frequencyRange = null;
	private Double cordLength = null;

    public Speakers() {}

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public Double getNumberSpeakers() {
        return numberSpeakers;
    }

    public Double getFrequencyRange() {
        return frequencyRange;
    }

    public Double getCordLength() {
        return cordLength;
    }

    @Override
    public void assignCharacteristic(String cr, Object value) {
        switch (cr) {
            case "POWER_CONSUMPTION": {
                powerConsumption = (Double) value;
                break;
            }
            case "NUMBER_OF_SPEAKERS": {
                numberSpeakers = (Double) value;
                break;
            }
            case "FREQUENCY_RANGE": {
                frequencyRange = (Double) value;
                break;
            }
            case "CORD_LENGTH": {
                cordLength = (Double) value;
                break;
            }
        }
    }
}
