import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetWithoutParametersMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(4);
        radio.setNextRadioStationNumber();
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(9);
        radio.setNextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVoidRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(9);
        radio.setNextRadioStationNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPervZeroRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(0);
        radio.setPervRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPervRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setCurrentRadioStationNumber(4);
        radio.setPervRadioStationNumber();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

  /*  @Test
    public void shouldSetNineRadioStationNumber() {
        Radio radio = new Radio( 10);
        radio.setPervRadioStationNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineVoidRadioStationNumber() {
        Radio radio = new Radio( );
        radio.setPervRadioStationNumber();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }*/

    @Test
    public void shouldSetZeroAfterMaxVolume() {
        Radio radio = new Radio( 100);
        radio.setCurrentSoundVolume(101);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroAfterMinVolume() {
        Radio radio = new Radio( 100);
        radio.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSet51Volume() {
        Radio radio = new Radio( 100);
        radio.setCurrentSoundVolume(50);
        radio.setNextSoundVolume();
        int expected = 51;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMaxVolume() {
        Radio radio = new Radio( 100);
        radio.setCurrentSoundVolume(100);
        radio.setNextSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMinVolume() {
        Radio radio = new Radio( 100);
        radio.setCurrentSoundVolume(1);
        radio.setPervSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowZeroBelowLimit() {
        Radio radio = new Radio( 100);
        radio.setPervSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}


