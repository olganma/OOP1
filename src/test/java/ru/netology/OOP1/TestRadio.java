package ru.netology.OOP1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    //Работа с радиостанциями

    @Test
    public void ShouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationBellowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotIncreaseStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotReduceStationBellowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation() ;
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

//Работа с уровнем громкости звука

    @Test
    public void ShouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeBellowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldLowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.lowerVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotLowerVolumeBellowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lowerVolume() ;
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



}
