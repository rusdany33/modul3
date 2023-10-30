package Test;

import kalkulator.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Mytest {

    calculator cal = new calculator(2, 3);

    @Test
    public void twoAndThreeIsFive() {
        assertEquals(cal.addFucn(2, 3),5);
    }

    @Test
    public void threeMinusTwoIsOne() {
        assertEquals(cal.subFucn(2, 3),1);
    }

    @Test
    public void threeXThreeIsNine() {
        assertEquals(cal.mulFucn(3, 3), 9);
    }

}