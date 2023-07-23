
public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    private int lowestChannel = 0;

    private int highestChannel = 9;

    public Radio(int highestChannel) {
        // this.lowestChannel = lowestChannel;
       // this.highestChannel = highestChannel;
       // this.currentRadioStationNumber = lowestChannel;
    }

    public Radio() {
        this.highestChannel = highestChannel;
        this.currentRadioStationNumber = lowestChannel;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }


    public void setCurrentRadioStationNumber(int currentStation) {
        if (currentStation > highestChannel) {
            return;
        }
        if (currentStation < lowestChannel) {
            return;
        }
        this.currentRadioStationNumber = currentStation;
    }


    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber < highestChannel) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = lowestChannel;
        }
    }

    public void setPervRadioStationNumber() {
        if (currentRadioStationNumber > lowestChannel) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = highestChannel;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentSoundVolume = currentVolume;
    }

    public void setNextSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void setPervSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}

