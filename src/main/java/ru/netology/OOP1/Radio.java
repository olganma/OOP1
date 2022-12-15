package ru.netology.OOP1;

public class Radio {

    private final int minCurrentStation = 0;
    private final int maxCurrentStation;

    private final int minCurrentVolume = 0;
    private final int maxCurrentVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        int amountStations = 10;
        maxCurrentStation = amountStations - 1;
    }

    public Radio(int amountStations) {
        maxCurrentStation = amountStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentStation() {
        return minCurrentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minCurrentStation) {
            return;
        }
        if (currentStation > maxCurrentStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            setCurrentStation(minCurrentStation);
        }
    }

    public void prevStation() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            setCurrentStation(maxCurrentStation);
        }
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        }
    }
}
