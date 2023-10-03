package practise;
public class StringComprension {
    public static String compressString(String str) {
        if (compressedLength(str) >= str.length()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }

        return compressed.toString();
    }

    private static int compressedLength(String str) {
        int compressedLength = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(count).length();
                count = 0;
            }
        }

        return compressedLength;
    }

    public static void main(String[] args) {
        String input = "aaabbbcccccaaa";
        String compressed = compressString(input);
        System.out.println(compressed);
    }
}