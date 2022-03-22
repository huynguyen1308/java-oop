package Lab06;

public class Cau03 {
    public static void main(String[] args) {
        String src = "100 minutes";
        StringBuilder builder = new StringBuilder();
        char [] myFirstChar = src.toCharArray();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }


        System.out.println(builder);
    }
}
