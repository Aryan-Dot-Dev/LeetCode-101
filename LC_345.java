public class LC_345 {
    String s;

    public LC_345(String s) {
        this.s = s;
    }

    public String reverseString(){
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                char temp = s.charAt(i);
                s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + temp + s.substring(j + 1, s.length());
                i++;
                j--;
            } else if (!isVowel(s.charAt(i))){
                i++;
            } else if (!isVowel(s.charAt(j))){
                j--;
            }
        }

        return s;
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
