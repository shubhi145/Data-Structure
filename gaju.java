public class gaju {

    public static void main(String args[]) {
        int n = 10;
        String result = "";

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result += (i + 1);
            } else {
                result += (i - 1);
            }
        }

        System.out.println(result);

    }
}
