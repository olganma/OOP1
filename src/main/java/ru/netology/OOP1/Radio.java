package ru.netology.OOP1;
public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
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
