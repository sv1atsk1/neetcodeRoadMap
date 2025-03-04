package by.viachaslau;

import java.util.ArrayList;
import java.util.List;

//Сложность:
//Временная сложность:
//
//Кодирование: O(m), где m — общая длина всех строк. Мы проходим по каждой строке один раз.
//
//Декодирование: O(m), поскольку мы проходим закодированную строку один раз.
//
//Пространственная сложность:
//
//Кодирование: O(1) дополнительного пространства (исключая выходную строку).
//
//Декодирование: O(1) дополнительного пространства (исключая выходной список).

public class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiterIndex = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            i = delimiterIndex + 1;
            decodedStrings.add(s.substring(i, i + length));
            i += length;
        }
        return decodedStrings;
    }
}