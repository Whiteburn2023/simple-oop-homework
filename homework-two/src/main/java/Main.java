import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //printStringReverse(“Hello world!”);
        //System.out.println(stringIsPhoneNumber("89172439096")); // "89172439096" "qwe123qwe12"
        //printSubStringReverse("Hello world!", 1 , 4);
        //System.out.println(getWordsReverse("Hello my nice world"));
        //System.out.println(getWordsReverseInColumn("Hello my nice world"));
        System.out.println(maxCharIndex("ddcccabbbb"));

    }

    public static void printStringReverse(String str) {
        if (str == null || str.isBlank()) {
            System.out.println("Wrong string");
            return;
        }
        System.out.println(new StringBuilder(str).reverse());
    }

    public static Boolean stringIsPhoneNumber(String str) {
        if (str == null || str.isBlank()) {
            return null;
        }
        return str.matches("8[0-9]{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (string == null || string.isBlank() || (start > finish) ||
                (string.length() < start) || (string.length() <= finish) ||
                (start < 0) || (finish <= 0)) {
            System.out.println("Wrong args");
            return;
        }
        String subStringFirst = string.substring(0, start);
        String subStringSecond = string.substring(start, finish + 1); // ????? +1
        String subStringThird = string.substring(finish + 1); // ????? +1

        StringBuilder stringBuilder = new StringBuilder(subStringSecond);
        String strReverse = stringBuilder.reverse().toString();

        System.out.println(subStringFirst + strReverse + subStringThird);
    }

    public static String getWordsReverse(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        return String.join(" ", Arrays.asList(string.split(" ")).reversed());
    }

    public static String getWordsReverseInColumn(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
//        String[] split = string.split(" ");
//        List<String> list = new ArrayList<>();
//        for (String str : split) {
//            list.add(new StringBuilder(str).reverse().toString());
//        }
//        return String.join("\n", list);
        return Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public static int maxCharIndex(String string) {
        if (string == null || string.isBlank()) {
            return -1;
        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : string.toCharArray()) {
//            //map.put(c, map.getOrDefault(c, 0) + 1);
//            map.merge(c, 1, Integer::sum);
//        }
//        int max = Collections.max(map.values());
//        char mostChar = ' ';
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == max) {
//                mostChar = entry.getKey();
//                break;
//            }
//        }
//        return string.indexOf(mostChar);
        Map<String, Long> collect = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        return string.indexOf(Collections.max(collect.entrySet(), Map.Entry.comparingByValue()).getKey());

    }

}
