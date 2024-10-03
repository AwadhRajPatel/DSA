package String;

public class ToUppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        
        // Convert the first character to uppercase and append it
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Iterate through the rest of the string
        for (int i = 1; i < str.length(); i++) {

            // Check if the current character is a space
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Append the space

                i++;  // Move to  the next character

                // Convert the next character to uppercase and append it
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Append the character as is
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am awadhraj";
        System.out.println(toUpperCase(str));
    }
}
