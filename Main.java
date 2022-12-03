import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));

        System.out.println("Задание 2");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.println("Задание 3");
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));

        System.out.println("Задание 4");
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));

        System.out.println("Задание 5");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));

        System.out.println("Задание 6");
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));

        System.out.println("Задание 7");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));

        System.out.println("Задание 8");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println("Задание 9");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println("Задание 10");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(4));
        System.out.println(boxSeq(5));
    }

    // задание 1
    public static StringBuilder repeat(String s, int num) {
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int newNum = num;
                while (newNum != 0) {
                    result.append(s.charAt(i));
                    newNum--;
                }
            }
        return result;
    }

    // задание 2
    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
            if (nums[i] <= min) {
                min = nums[i];
            }
        }
        return max - min;
    }

    // задание 3
    public static boolean isAvgWhole(int[] nums) {
        double sum = 0;
        for (int j : nums) {
            sum += j;
        }

        double average = sum / nums.length;
        return average % 2 == 0 || average == 1;
    }

    // задание 4
    public static int[] cumulativeSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    // задание 5
    public static int getDecimalPlaces(String s) {
        char[] array = s.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.') {
                i++;
                count = array.length - i;
            }
        }
        return count;
    }

    // задание 6
    public static int fibonacci(int num) {
        int a = 1;
        int b = 1;
        for (int i = 2; i <= num; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    // задание 7
    public static boolean isValid(String s) {
        char[] array = s.toCharArray();
        for (char c : array) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return s.length() == 5;
    }

    // задание 8
    public static boolean isStrangePair(String s1, String s2) {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        if (array1.length == 0 && array2.length == 0) {
            return true;
        }

        return array1[0] == array2[array2.length - 1] && array1[array1.length - 1] == array2[0];
    }

    // задание 9
    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.replace("-", "");
        return word.startsWith(prefix);
    }

    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.replace("-", "");
        return word.endsWith(suffix);
    }

    // задание 10
    public static int boxSeq(int num) {
        int n = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                n += 3;
            } else {
                n -= 1;

            }
        }
        return n;
    }
}
