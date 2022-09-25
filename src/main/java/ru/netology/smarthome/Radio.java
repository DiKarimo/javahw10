package ru.netology.smarthome;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation < 0) {
            return;
        }
        if(currentStation > 9) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume < 0) {
            return;
        }
        if(currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
       if(currentStation < 9) {
           currentStation = currentStation + 1;
       } else {
           currentStation = 0;
       }
    }

    public void prevStation() {
        if(currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if(currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if(currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
