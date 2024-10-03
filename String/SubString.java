package String;

public class SubString {

    public static String subString(String str, int StartingIndex, int EndingIndex){
        String substr ="";
        for(int i= StartingIndex; i<EndingIndex; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println(str.substring(0,5));
        // System.out.println(subString(str, 0,5));
    }
 
}
