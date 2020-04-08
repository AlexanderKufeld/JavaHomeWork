import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork1Test {

    // test dlja sleepIn
    @Test
    public void testSleepIn1() {
        HomeWork1 hw = new HomeWork1();
        boolean b = hw.sleepIn(false, false);
        assertTrue(b);
    }

    @Test
    public void testSleepIn2() {
        HomeWork1 hw = new HomeWork1();
        boolean b = hw.sleepIn(true, false);
        assertFalse(b);
    }

    @Test
    public void testSleepIn3() {
        HomeWork1 hw = new HomeWork1();
        boolean b = hw.sleepIn(false, true);
        assertTrue(b);
    }

    //test dlja diff21
    @Test
    public void testDiff21(int n) {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(11);
        assertEquals(dif, t);
    }

    @Test
    public void testDiff21_1(int n) {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(21);
        assertEquals(dif, t);
    }

    @Test
    public void testDiff21_2(int n) {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(31);
        assertEquals(dif, t);
    }

    //test: Дана строка​ , вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные). Если строка длины меньше 3, перевести это в заглавные.
@Test
    public void testEndUp(String str) {
        //   endUp("Hello") → "HeLLO"
        //   endUp("hi there") →"hi thERE"
        //   endUp("hi") →HI"

        HomeWork1 s = new HomeWork1();
        String s1= "Hello";
        String s2="hi there";
        String s3="hi";
        s.endUp(s1);
        s.endUp(s2);
        s.endUp(s3);
        assertEquals(str,s);

    }
}
