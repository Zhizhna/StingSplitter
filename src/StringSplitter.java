
import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

    public static List<String> splitString(String str, int partSize) {
        List<String> parts = new ArrayList<>();
        int length = str.length();

        for (int i = 0; i < length; i += partSize) {
            parts.add(str.substring(i, Math.min(length, i + partSize)));
        }

        return parts;
    }

    public static void main(String[] args) {
        String input = "ThisIsAVeryLongStringThatNeedsToBeSplit";
        int partSize = 5;

        List<String> result = splitString(input, partSize);

        for (String part : result) {
            System.out.println(part);
        }
    }
}