package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    // Тесты на переключение станций при количестве станций по умолчанию

    // Проверяем граничные валидные значения при переключении станций вперёд

    @Test
     public void shouldSwitchToTheNextStationIfNowZeroStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.nextStation();
        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowOneStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        station.nextStation();
        int expected = 2;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowEightStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.nextStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheZeroStationIfNowNinthStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем граничные валидные значения при переключении станций назад

    @Test
    public void shouldSwitchToThePrevStationIfNowNinthStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.prevStation();
        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowEighthStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.prevStation();
        int expected = 7;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowOneStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        station.prevStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNinthStationIfNowZeroStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем эквивалентные валидные значения при переключении станций вперёд/назад

    @Test
    public void shouldSwitchToTheNextStationIfNowFourthStation() {
        Radio station = new Radio();
        station.setCurrentStation(4);

        station.nextStation();
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowFixthStation() {
        Radio station = new Radio();
        station.setCurrentStation(6);

        station.prevStation();
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем невалидные значения при переключении станций вперёд/назад

    @Test
    public void notShouldSwitchToTheNextStationIfNowTenthStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSwitchToThePrevStationIfNowNegativeValueStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        station.prevStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты на переключение станций при задающемся количестве станций

    // Проверяем граничные валидные значения при переключении станций вперёд

    @Test
    public void shouldSwitchToTheNextStationIfNowThirtyOneStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(31);

        station.nextStation();
        int expected = 32;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheZeroStationIfNowThirtySecondStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(32);

        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем граничные валидные значения при переключении станций назад

    @Test
    public void shouldSwitchToThePrevStationIfNowThirtySecondStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(32);

        station.prevStation();
        int expected = 31;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowZeroStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(0);

        station.prevStation();
        int expected = 32;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    // Проверяем эквивалентные валидные значения при переключении станций вперёд/назад

    @Test
    public void shouldSwitchToTheNextStationIfNowFifteenthStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(15);

        station.nextStation();
        int expected = 16;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowTwentyNinthStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(29);

        station.prevStation();
        int expected = 28;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем невалидные значения при переключении станций вперёд/назад

    @Test
    public void notShouldSwitchToTheNextStationIfNowThirtyFourthStation() {
        Radio station = new Radio(33);
        station.setCurrentStation(34);

        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты на регулирование звука

    // Проверяем граничные валидные значения при увеличении громкости звука

    @Test
    public void shouldIncreaseIfTheVolumeIsZero() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeIsOne() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.increaseVolume();
        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeIsNine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseIfTheVolumeIsTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем граничные валидные значения при уменьшении громкости звука

    @Test
    public void shouldReduceIfTheVolumeIsTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.reduceVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceIfTheVolumeIsNine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.reduceVolume();
        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceIfTheVolumeIsOne() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldReduceIfTheVolumeIsZero() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем эквивалентные валидные значения при увеличении/уменьшении громкости звука

    @Test
    public void shouldIncreaseIfTheVolumeIsThree() {
        Radio volume = new Radio();
        volume.setCurrentVolume(59);

        volume.increaseVolume();
        int expected = 60;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceIfTheVolumeIsSeven() {
        Radio volume = new Radio();
        volume.setCurrentVolume(74);

        volume.reduceVolume();
        int expected = 73;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Проверяем невалидные значения при увеличении/уменьшении громкости звука

    @Test
    public void notShouldReduceIfTheVolumeIsNegativeValue() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-2);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseIfTheVolumeIsAboveToTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(111);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
