import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

 /*  @Test
    public void test() {
        Radio rad = new Radio(10, 20);

        Assertions.assertEquals(10, rad.getLowestChannel());
        Assertions.assertEquals(20, rad.getHighestChannel());
    }*/

    @Test
    public void shouldSetRadioStationNumber() {
        Radio cond = new Radio(0,9);

        cond.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStationNumber() {
        Radio cond = new Radio(0,9);

        cond.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStationNumber() {
        Radio cond = new Radio(0,9);

        cond.setCurrentRadioStationNumber(-2);

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {
        Radio cond = new Radio(0,9);
        cond.setCurrentRadioStationNumber(5);

        cond.setNextRadioStationNumber();

        int expected = 6;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStationNumber() {
        Radio cond = new Radio(0,9);
        cond.setCurrentRadioStationNumber(9);

        cond.setNextRadioStationNumber();

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOneRadioStationNumber() {
        Radio cond = new Radio(0,9);
        cond.setCurrentRadioStationNumber(0);

        cond.setNextRadioStationNumber();

        int expected = 1;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPervRadioStationNumber() {
        Radio cond = new Radio(0,9);
        cond.setCurrentRadioStationNumber(2);

        cond.setPervRadioStationNumber();

        int expected = 1;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineRadioStationNumber() {
        Radio cond = new Radio(0,9);
        cond.setCurrentRadioStationNumber(0);

        cond.setPervRadioStationNumber();

        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
/*
    @Test
    public void shouldSet51Volume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(50);

        cond.setNextSoundVolume();


        int expected = 51;
        int actual = cond.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet100Volume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(100);

        cond.setNextSoundVolume();


        int expected = 100;
        int actual = cond.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(0);

        cond.setPervSoundVolume();


        int expected = 0;
        int actual = cond.currentSoundVolume;

        Assertions.assertEquals(expected, actual);
    }*/
}
