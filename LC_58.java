public class LC_58 {
    String s;

    public LC_58(String s) {
        this.s = s;
    }

    public int LC58() {
        s = s.trim();
        System.out.println("'" + s + "'");
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len = 0;
            } else {
                len++;
            };
    }
    return len;
}
};
