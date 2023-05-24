package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setStatInLimitZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStatInMidLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStatAfterAnother() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationNegativeNum() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStatOverLimitAfterLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStatInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStatInLimitBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStatOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStatLowBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStatInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStationLowBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStatOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStatInLimitOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeInLimitMid() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeInLimitUpBound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeInLimitLowBound() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeDownNegative() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setVolumeUpNegative() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeInLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increase();

        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increase();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeAboveUpLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increase();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increase();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeInLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decrease();

        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decrease();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeBelowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decrease();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeUpLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decrease();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStatConstNewInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewInLimitZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUpLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(30);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(31);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStatConstNewUnderHiLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(29);

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUnderLowLimit() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStatInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(27);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 28;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStatInLimitBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(28);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStationOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(29);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStatLowBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStatInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStationLowBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStatOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStatInLimitOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(29);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 28;
        Assertions.assertEquals(actual, expected);
    }

}

