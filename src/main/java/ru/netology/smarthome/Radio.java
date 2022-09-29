package ru.netology.smarthome;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume = 100;

    public Radio(int amountOfStation) {
        maxStation = amountOfStation - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation < 0) {
            return;
        }
        if(currentStation > maxStation) {
            currentStation = maxStation;
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
        if(currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
       if(currentStation < maxStation) {
           currentStation = currentStation + 1;
       } else {
           currentStation = 0;
       }
    }

    public void prevStation() {
        if(currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if(currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if(currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
