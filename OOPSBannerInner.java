public class OOPSBannerInner {

    static class CharacterPattern {
        String[] pattern;

        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        CharacterPattern P = new CharacterPattern(new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        CharacterPattern S = new CharacterPattern(new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        for(int i = 0; i < 5; i++) {
            System.out.println(O.pattern[i] + "  " + O.pattern[i] + "  " + P.pattern[i] + "  " + S.pattern[i]);
        }
    }
}