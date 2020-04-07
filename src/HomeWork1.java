

public class HomeWork1 {


    // my spim esli ne rab. den' ili vyhodnoy, ostal'noe vremja net
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

    }

    //zavodim peremennuju dif; esli n>21 umnozhaem na 2
    public int diff21(int n) {
        int dif = 21 - n;
        if (n > 21) {
            dif = Math.abs(n) * 2; // dif=(n-21)*2;
        }
        return dif;
    }
//Дана строка​ , вернуть новую строку, где последние 3 символа в верхнем регистре (заглавные). Если строка длины меньше 3, перевести это в заглавные.

    public String endUp(String str) {
        int beginUpper = str.length() - 3;
        int length = str.length();
        if (str.length() < 3)
            return str.toUpperCase();
        String upper = str.substring(beginUpper).toUpperCase();
        return upper;

    }


    //Даны три целых числы​ a b c, вернуть наибольшее.
    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;

            if (c > a && c > b)
                max = c;
            return max;

            //return (a>b&& a>c)? a: (b>a&& b>c)? b : c;
        }


    //Даны два массива целых чисел.​ Вернуть true если у них одинаковый первый или последний элемент. Оба массива длины 1 или более.
    public boolean commonEnd (int[] a,  int [] b) {
           if  (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
            return true;
    }
//Дан массив целых чисел.​ Вернуть сумму двух первых элементов массива. Если длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина массива равна нулю.

    public int sum2(int[] nums) {
        int sum = nums[0] + nums[nums.length - 1];
        return sum;
        // ne ponjal gde oshibka:
        // return (nums.length < 2) ? (nums[0] + nums.length - 1) : (nums[0] + (nums[nums.length - 1]));
    }
//Вернуть количество четных чисел в массиве​ целых чисел. Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
        }
        return count;
    }
//Вернуть версию входного массива​ , где каждыое нулевое значение заменено максимальным нечетным значением, справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.

    public int[] zeroMax(int[] nums) {
            int max;
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] == 0) {
                    max = 0;
                    for(int j = i + 1; j < nums.length; j--) {
                        if(nums[j] > max && nums[j] % 2 == 1)
                            max = nums[j];
                    }
                    if(max != 0)
                        nums[i] = max;
                }
            }
            return nums;

        }
//Вернуть массив, ​ смещенный влево на один индекс.

    public int[] shiftLeft(int[] nums){
            int temp = nums[0];
            if(nums.length <= 1)
                return  nums;

            for(int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = temp;
            return nums;
    }

    //Даны две строки,​ вернуть их конкатенацию, но без первого символа в каждой. Строки ненулевой длины.

    public String nonStart(String a;  String  b) {
            int i = a + b.charAt(1, 1);
            return i;

    }
//Дана строка четной длины.​ Вернуть строку из двух центральных символов, например строка "string" превратиться в "ri". Длина входной строки минимум 2.
public String middleTwo (String str) {
        int length = str.length();
        int middle = length / 2;
        return str.substring(middle -1, middle + 1);
    }

}


