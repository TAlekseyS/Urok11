public class Cadio {

    private int highestChannel = 9;
    private int lowestChannel = 0;
    private int currentRadioStationNumber = lowestChannel;

    public Cadio(){

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    public int getHighestChannel() {
        return highestChannel;
    }

    public int getLowestChannel() {
        return lowestChannel;

    }
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < lowestChannel) {
            return;
        }
        if (newCurrentRadioStationNumber > highestChannel) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }


    public void setNextRadioStationNumber() {
        int actualStationNumber = currentRadioStationNumber;
        setCurrentRadioStationNumber(actualStationNumber);
        if (currentRadioStationNumber < highestChannel) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void setPervRadioStationNumber() {
        int actualStationNumber = currentRadioStationNumber;
        setCurrentRadioStationNumber(actualStationNumber);
        if (currentRadioStationNumber > lowestChannel) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int currentSoundVolume;


    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setNextSoundVolume() {
        int actualCurrentSoundVolume = currentSoundVolume;
        setCurrentSoundVolume(actualCurrentSoundVolume);
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = 100;
        }

    }

    public void setPervSoundVolume() {
        int actualCurrentSoundVolume = currentSoundVolume;
        setCurrentSoundVolume(actualCurrentSoundVolume);
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = 0;
        }

    }


}
