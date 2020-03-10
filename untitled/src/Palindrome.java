public class Palindrome {


    public static void main(String[] args) {


        String str = "gala";
        boolean isPalindroome = true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)){
                    isPalindroome = false;
                    break;
                }
            }
        }else{
            isPalindroome = false;
        }
        if (isPalindroome){
            System.out.println("it is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }

    }
}
