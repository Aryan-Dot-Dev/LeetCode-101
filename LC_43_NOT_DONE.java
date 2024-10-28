public class LC_43_NOT_DONE {
    String num1;
    String num2;

    public LC_43_NOT_DONE(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int stringToInteger(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
    }

    public String multiplyString(){
        int result = stringToInteger(num1) * stringToInteger(num2);
        return String.valueOf(result);
    }

}
