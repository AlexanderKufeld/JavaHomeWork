import org.junit.Test;

import static java.lang.String.valueOf;

public class HomeWork1 {


    // my spim esli ne rab. den' ili vyhodnoy, ostal'noe vremja net

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    //zavodim peremennuju dif; esli n>21 umnozhaem na 2
    public int diff21(int n) {
        int dif;
        dif = 21 - n;
        if (n > 21) {
            dif = (n - 21) * 2;
        }
        return dif;
    }
//Дана строка​ , вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные). Если строка длины меньше 3, перевести это в заглавные.

    public String endUp(String str) {
        if (str.length() >= 3) {
            String Upperstr = str.substring(str.length() - 3, str.length());
            return str.substring(0, str.length() - 3) + Upperstr.toUpperCase();
        } else
            return str.toUpperCase();
    }

    //Даны три целых числы​ a b c, вернуть наибольшее.
    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;

            if (c > a && c > b) {
                max = c;
            }
        }
        return max;
    }


    //Даны два массива целых чисел.​ Вернуть true если у них одинаковый первый или последний элемент. Оба массива длины 1 или более.

    public boolean commonEnd(int[] arrayA, int[] arrayB) {
        return arrayA[0] == arrayB[0] || arrayA[arrayA.length - 1] == arrayB[arrayB.length - 1];
    }


//Дан массив целых чисел.​ Вернуть сумму двух первых элементов массива. Если длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина массива равна нулю.

    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 2)
            return (nums[0] + nums[1]);
        if (nums.length < 1)
            return 0;

        return sum;
    }

//Вернуть количество четных чисел в массиве​ целых чисел. Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.

    public int countEvens(int[] numbers) {
        int count;
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                count++;
        }
        return count;
    }
//Вернуть версию входного массива​ , где каждыое нулевое значение заменено максимальным нечетным значением, справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.

    public int[] zero(int[] numb) {
        int max;
        for (int i = 0; i < numb.length - 1; i++) {
            if (numb[i] == 0) {
                max = 0;
                for (int j = i + 1; numb.length > j; j++) {
                    if (numb[j] > max && numb[j] % 2 == 1)
                        max = numb[j];
                }
                if (max != 0)
                    numb[i] = max;
            }
        }
        return numb;
    }
//Вернуть массив, ​ смещенный влево на один индекс.


    public int[] shiftLeft(int[] nums) {


        if (nums.length <= 1) return nums;

        int tmp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = tmp;
        return nums;

    }

    //Даны две строки,​ вернуть их конкатенацию, но без первого символа в каждой. Строки ненулевой длины.

    public String nonStart(String a, String b) {
        String i = (a.substring(1) + b.substring(1));
        return i;

    }

    //Дана строка четной длины.​ Вернуть строку из двух центральных символов, например строка "string" превратиться в "ri". Длина входной строки минимум 2.
    public String middleTwo(String str) {
        int length;
        length = str.length();
        int middle = length / 2;
        return str.substring(middle - 1, middle + 1);
    }

}