
public class Radio {
    private int currentRadioStationNumber ;
    private int currentSoundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber ;
    }


    public void setCurrentRadioStationNumber(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentRadioStationNumber  = currentStation;
    }


    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber  < 9) {
            currentRadioStationNumber  = currentRadioStationNumber  + 1;
        } else {
            currentRadioStationNumber  = 0;
        }
    }

    public void setPervRadioStationNumber() {
        if (currentRadioStationNumber  > 0) {
            currentRadioStationNumber  = currentRadioStationNumber  - 1;
        } else {
            currentRadioStationNumber  = 9;
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

