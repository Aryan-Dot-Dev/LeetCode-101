import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        LC_344 LeetCode = new LC_344();
        char[] result = LeetCode.reverseString(new char[] {'h','e','l','l','o'});
        System.out.println(Arrays.toString(result));
    }
}