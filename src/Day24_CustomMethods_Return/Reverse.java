package Day24_CustomMethods_Return;

public class Reverse {
    public static String reverse(String word){
        String result="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            result +=word.charAt(i);
        }
        return result;
    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string
				Ex:
					str = "Java";
					reverse(str) ==> avaJ
 */