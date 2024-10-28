public class LC_1015_NOT_DONE {
    public int smallestRepunitDivByK(int k) {
        String num = "";

        for (int i = 0; i <= k; i++){
            num += "1";
            System.out.println(num);
            
            if (Integer.parseInt(num) % k == 0){
                return i+1;
            }
        }

        return -1;
    }
}
