import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void setStationInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationInLimitZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationInMidLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationAfterAnother() {
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
    void setStationOverLimitAfterLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStationInLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStationInLimitBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStationOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStationLowBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStationInLimit() {
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
    void prevRadioStationOverBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStationInLimitOverBorder() {
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
    void setStationConstNewInLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewInLimitZero() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUpLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(30);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUpperLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(31);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUnderHiLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setStationConstNewUnderLowLimit() {
        Radio radio = new Radio(30);


        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStationInLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(27);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 28;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStationInLimitBorder() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(28);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStationOverBorder() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioConstStationLowBound() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStationInLimit() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStationLowBound() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStationOverBorder() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioConstStationInLimitOverBorder() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 28;
        Assertions.assertEquals(actual, expected);
    }

}

