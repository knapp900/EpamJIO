package string_builder;

import java.util.Arrays;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

public class Task_7 {
    public static void main(String[] args) {
        String string = "abc cd  e def    ";
        removeAllRepeat(string);

    }


    public static void removeAllRepeat(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.trim().toLowerCase());
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
            for(int k = i + 1;k < stringBuilder.length();k++) {
                if (stringBuilder.charAt(k) == stringBuilder.charAt(i)){
                    stringBuilder.deleteCharAt(k);
                    k--;
                }
            }
        }
        String tmpString = stringBuilder.toString();
        char [] ch = tmpString.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }

}
