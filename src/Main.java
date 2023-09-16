/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0 && getDigitSum(i) < 10) {
                System.out.println(i);
            }
        }
    }

    public static int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        String string1 = "stringerse";
        String string2 = "code";
        String string3 = "Practice";

        System.out.println(getMiddleChars(string1));
        System.out.println(getMiddleChars(string2));
        System.out.println(getMiddleChars(string3));
    }

    public static String getMiddleChars(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 1);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        String input = "fffff ab f 1234 jkjk";
        String result = findMinDistinctCharsWord(input);
        System.out.println(result);
    }

    public static String findMinDistinctCharsWord(String input) {
        String[] words = input.split("\\s");
        String minDistinctCharsWord = words[0];
        int minDistinctChars = countDistinctChars(words[0]);

        for (int i = 1; i < words.length; i++) {
            int distinctChars = countDistinctChars(words[i]);
            if (distinctChars < minDistinctChars) {
                minDistinctChars = distinctChars;
                minDistinctCharsWord = words[i];
            }
        }

        return minDistinctCharsWord;
    }

    public static int countDistinctChars(String word) {
        int count = 0;
        char[] chars = word.toCharArray();
        boolean[] seen = new boolean[256];

        for (char ch : chars) {
            if (!seen[ch]) {
                count++;
                seen[ch] = true;
            }
        }

        return count;
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        String sentence = "One two three раз два три one1 two2 123";
        int count = countLatinWords(sentence);
        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + count);
    }

    public static int countLatinWords(String sentence) {
        String[] words = sentence.split("\\s+"); // Разделение предложения на слова по пробелам
        int count = 0;

        for (String word : words) {
            if (word.matches("^[a-zA-Z]+")) { // Проверка, состоит ли слово только из латинских букв
                count++;
            }
        }

        return count;
    }
}*/

