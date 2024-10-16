package RECURSION;

public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base-case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currentChar), map);
        }
    } 

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
