package String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

    }

    public Stringbuilder append(char currentChar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }
}
 