public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            setCurrentStation(0);
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            setCurrentStation(9);
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        else {
            setCurrentVolume(currentVolume);
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        else {
            setCurrentVolume(currentVolume);
        }
    }
}
