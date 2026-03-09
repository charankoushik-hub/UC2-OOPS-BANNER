public class OOPSBannerStatic {

    static String[] O() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    static String[] P() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    static String[] S() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = O();
        String[] P = P();
        String[] S = S();

        for(int i = 0; i < 5; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}