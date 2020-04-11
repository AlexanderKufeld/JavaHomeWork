import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWork1Test {

    // test dlja sleepIn
    //sleepIn(false, false) → true sleepIn(true, false) → false sleepIn(false, true) → true
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


    //diff21(11) → 2 diff21(10) → 11 diff21(21) → 0 diff21(25) → 8

    @Test
    public void testDiff21() {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(10);
        int expected = 11;
        assertEquals(expected, dif);
    }

    @Test
    public void testDiff21_1() {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(0);
        int expected = 21;
        assertEquals(expected, dif);
    }

    @Test
    public void testDiff21_2() {
        HomeWork1 t = new HomeWork1();
        int dif = t.diff21(31);
        int expected = 20;
        assertEquals(expected, dif);
    }

    @Test
    public void testEndUp() {
        //   endUp("Hello") → "HeLLO"
        HomeWork1 s = new HomeWork1();
        String s1 = "Hello";
        String expected = "HeLLO";
        String actual = s.endUp(s1);
        assertEquals(expected, actual);
    }

    @Test
    public void testEndUp1() {
        //   endUp("Hello") → "HeLLO" endUp("hi there") → "hi thERE" endUp("hi") → "HI"

        HomeWork1 s = new HomeWork1();
        String s1 = "hi there";
        String expected = "hi thERE";
        String actual = s.endUp(s1);
        assertEquals(expected, actual);
    }

    @Test //  ("hi") → "HI"
    public void testEndUp2() {
        HomeWork1 s = new HomeWork1();
        String s1 = "hi";
        String expected = "HI";
        String actual = s.endUp(s1);
        assertEquals(expected, actual);
    }

    @Test //Даны три целых числы​ a b c, вернуть наибольшее. intMax(1, 2, 3) → 3 intMax(1, 3, 2) → 3 intMax(3, 2, 1) → 3

    public void testIntMax() {
        HomeWork1 s = new HomeWork1();
        int actual = s.intMax(1, 2, 3);
        int exp = 3;
        assertEquals(exp, actual);
    }

    @Test
    public void testIntMax1() {
        HomeWork1 s = new HomeWork1();
        int actual = s.intMax(1, 3, 2);
        int exp = 3;
        assertEquals(exp, actual);
    }

    @Test
    public void testIntMax2() {
        HomeWork1 s = new HomeWork1();
        int actual = s.intMax(3, 2, 1);
        int exp = 3;
        assertEquals(exp, actual);
    }
    //Даны два массива целых чисел.​
    // Вернуть true если у них одинаковый первый или последний элемент.
    // Оба массива длины 1 или более.
    // commonEnd([1, 2, 3], [7, 3]) → true commonEnd([1, 2, 3], [7, 3, 2]) → false commonEnd([1, 2, 3], [1, 3]) → true

    @Test
    public void testCommonEnd() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 2, 3};
        int[] Bactual = {7, 3};
        boolean b = hw.commonEnd(Aactual, Bactual);
        assertTrue(b);
    }

    @Test
    public void testCommonEnd1() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 2, 3};
        int[] Bactual = {7, 3, 2};
        boolean b = hw.commonEnd(Aactual, Bactual);
        assertFalse(b);
    }

    @Test
    public void testCommonEnd2() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 2, 3};
        int[] Bactual = {1, 3,};
        boolean b = hw.commonEnd(Aactual, Bactual);
        assertTrue(b);
    }

//Дан массив целых чисел.​
// Вернуть сумму двух первых элементов массива.
// Если длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина массива равна нулю.
//sum2([1, 2, 3]) → 3 sum2([1, 1]) → 2 sum2([1, 1, 1, 1]) → 2

    @Test
    public void testSum2() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 2, 3};
        int expected = 3;
        int a = hw.sum2(Aactual);
        assertEquals(expected, a);
    }

    @Test
    public void testSum2_1() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 1};
        int expected = 2;
        int a = hw.sum2(Aactual);
        assertEquals(expected, a);
    }

    @Test
    public void testSum2_2() {
        HomeWork1 hw = new HomeWork1();
        int[] Aactual = {1, 1};
        int expected = 2;
        int a = hw.sum2(Aactual);
        assertEquals(expected, a);
    }

    //Вернуть количество четных чисел в массиве​ целых чисел.
    // Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
    //countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    @Test
    public void testCountEvents() {
        HomeWork1 hw = new HomeWork1();
        int[] countE = {2, 1, 2, 3, 4};
        int expected = 3;
        int a = hw.countEvens(countE);
        assertEquals(expected, a);
    }

    @Test
    public void testCountEvents1() {
        HomeWork1 hw = new HomeWork1();
        int[] countE = {2, 2, 0};
        int expected = 3;
        int a = hw.countEvens(countE);
        assertEquals(expected, a);
    }

    @Test
    public void testCountEvents2() {
        HomeWork1 hw = new HomeWork1();
        int[] countE = {1, 3, 5};
        int expected = 0;
        int a = hw.countEvens(countE);
        assertEquals(expected, a);
    }

    //Вернуть версию входного массива​ , где каждыое нулевое значение заменено максимальным нечетным значением,
    // справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.
    //zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3] zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3] zeroMax([0, 1, 0]) → [1, 1, 0]
    @Test
    public void testZero() {
        HomeWork1 hw = new HomeWork1();
        int[] zeroMax = {0, 5, 0, 3};
        int[] expected = {5, 5, 3, 3};
        int[] a = hw.zero(zeroMax);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testZero1() {
        HomeWork1 hw = new HomeWork1();
        int[] zeroMax = {0, 4, 0, 3};
        int[] expected = {3, 4, 3, 3};
        int[] a = hw.zero(zeroMax);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testZero2() {
        HomeWork1 hw = new HomeWork1();
        int[] zeroMax = {0, 1, 0};
        int[] expected = {1, 1, 0};
        int[] a = hw.zero(zeroMax);
        assertArrayEquals(expected, a);
    }

    //Вернуть массив, ​ смещенный влево на один индекс.
    // То ест для  {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
    // Можно вернуть измененный данный массив, а можно вернуть новый.
    //shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6] shiftLeft([1, 2]) → [2, 1] shiftLeft([1]) → [1]

    @Test
    public void testShiftLeft() {
        HomeWork1 hw = new HomeWork1();
        int[] sl = {1};
        int[] expected = {1};
        int[] a = hw.shiftLeft(sl);
        assertArrayEquals(expected, a);

    }

    @Test
    public void testShiftLeft1() {
        HomeWork1 hw = new HomeWork1();
        int[] sl = {6, 2, 5, 3};
        int[] expected = {2, 5, 3, 6};
        int[] a = hw.shiftLeft(sl);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testShiftLeft2() {
        HomeWork1 hw = new HomeWork1();
        int[] sl = {1, 2};
        int[] expected = {2, 1};
        int[] a = hw.shiftLeft(sl);
        assertArrayEquals(expected, a);
    }


    //Даны две строки,​ вернуть их конкатенацию, но без первого символа в каждой. Строки ненулевой длины.
    //nonStart("Hello", "There") → "ellohere" nonStart("java", "code") → "avaode" nonStart("shotl", "java") → "hotlava"

    @Test
    public void testNonStart() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "Hello";
        String s2 = "There";
        String expected = "ellohere";
        String actual = hw.nonStart(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNonStart1() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "java";
        String s2 = "code";
        String expected = "avaode";
        String actual = hw.nonStart(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNonStart2() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "shotL";
        String s2 = "java";
        String expected = "hotLava";
        String actual = hw.nonStart(s1, s2);
        assertEquals(expected, actual);
    }

    //Дана строка четной длины.​
// Вернуть строку из двух центральных символов, например строка "string" превратиться в "ri".
// Длина входной строки минимум 2.
//middleTwo("string") → "ri" middleTwo("code") → "od" middleTwo("Practice") → "ct"
    @Test
    public void testMiddleTwo() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "string";
        String expected = "ri";
        String actual = hw.middleTwo(s1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMiddleTwo_1() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "code";
        String expected = "od";
        String actual = hw.middleTwo(s1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMiddleTwo_2() {
        HomeWork1 hw = new HomeWork1();
        String s1 = "code";
        String expected = "od";
        String actual = hw.middleTwo(s1);
        assertEquals(expected, actual);
    }

}





