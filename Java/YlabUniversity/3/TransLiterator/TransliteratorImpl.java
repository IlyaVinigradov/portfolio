package TransLiterator;

import java.util.HashMap;
import java.util.Map;

/**
 * TransliteratorImpl
 */
public class TransliteratorImpl implements Transliterator {

    private static final Map<Character, String> alphabet = new HashMap<>(); // инкапсуляция?

    public String transliterate(String source) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chArr = source.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (alphabet.containsKey(chArr[i])) {
                stringBuilder.append(
                        alphabet.get(chArr[i]));
            } else {
                stringBuilder.append(chArr[i]);
            }
        }
        return stringBuilder.toString();
    }

    // public void alphabet() { // инициализация алфавита
    static {
        alphabet.put('А', "A");
        alphabet.put('Б', "B");
        alphabet.put('В', "V");
        alphabet.put('Г', "G");
        alphabet.put('Д', "D");
        alphabet.put('Е', "E");
        alphabet.put('Ё', "E");
        alphabet.put('Ж', "ZH");
        alphabet.put('З', "Z");
        alphabet.put('И', "I");
        alphabet.put('Й', "I");
        alphabet.put('К', "K");
        alphabet.put('Л', "L");
        alphabet.put('М', "M");
        alphabet.put('Н', "N");
        alphabet.put('О', "O");
        alphabet.put('П', "P");
        alphabet.put('Р', "R");
        alphabet.put('С', "S");
        alphabet.put('Т', "T");
        alphabet.put('У', "U");
        alphabet.put('Ф', "F");
        alphabet.put('Х', "KH");
        alphabet.put('Ц', "TS");
        alphabet.put('Ч', "CH");
        alphabet.put('Ш', "SH");
        alphabet.put('Щ', "SHCH");
        alphabet.put('Ы', "Y");
        alphabet.put('Ь', "");
        alphabet.put('Ъ', "IE");
        alphabet.put('Э', "E");
        alphabet.put('Ю', "IU");
        alphabet.put('Я', "IA");
    }

    // public String transliterate(String source) {
    // String[] arr = source.split(" "); // делим строку на слова
    // for (int i = 0; i < arr.length; i++) { // ищем подходящее слово
    // if (cyrillic(arr[i]) == true) {
    // char[] chArr = arr[i].toCharArray(); // колдуем над подходящим словом
    // for (int j = 0; j < chArr.length; j++) {
    // if (alphabet.containsKey(chArr[j])) {
    // stringBuilder.append(alphabet.get(chArr[j]));
    // }
    // }
    // }
    // }
    // return stringBuilder.toString();
    // }

    // public boolean cyrillic(String word) { // проверка первого символа на верхний
    // регистр и на кириллицу
    // char[] chArr = word.toCharArray();
    // if (alphabet.containsKey(chArr[0])) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // что делать в случае ПРИВЕТ! ?
}