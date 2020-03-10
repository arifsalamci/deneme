public class Anagram {

    public static void main(String[] args) {
    Anagram("silent", "listenn");
    }

    public static void Anagram(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int counter = 0;

        if (str1.length() == str2.length()){
            for (int i = 0; i < str1.length() ; i++) {
                char c = str1.charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                    if(c == str2.charAt(j)){
                        counter++;
                        str2.replaceFirst(c + "", " ");
                        break;
                    }
                }
            }
            if(counter == str1.length()){
                System.out.println("They are ANAGRAM");
            }else{
                System.out.println("They are NOT ANAGRAM");
            }
        }else{
            System.out.println("They are not anagram");
        }
    }
}
