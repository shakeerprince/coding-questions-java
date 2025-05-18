public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        if(s.length() != t.length()){
            System.out.println("false");
        }
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++ ){
                if(s.charAt(i) != t.charAt(i)){
                    System.out.println("false");
                }
            }
        }
        System.out.println("true");
    }
}
