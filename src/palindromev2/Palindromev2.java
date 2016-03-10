/*
 * Code is prose.
 * The code is mine. You are free to use it.
 * I put a lot of effort into it so it does what I want it to do.
 * If you use it, you do so at your own risk.
 * If you use it, keep this license and the reference to my profiles.
 * Other than that, have fun.
 * 
 * Lefty G Balogh
 * https://www.linkedin.com/in/leftygbalogh
 * https://github.com/leftygbalogh
 */
package palindromev2;

/**
 *
 * @author Lefty G Balogh
 */
public class Palindromev2 {

    public static String normalizeText(String rawText) {
        String newStr = rawText.replaceAll("[^\\p{IsAlphabetic}^\\p{IsDigit}]", "");

        return newStr;
    }

    public static boolean isPalindrome(String text) {
        int counter = 0;
        int length = text.length();
        boolean paliFlag = true;

        while (counter <= length / 2 && paliFlag) {
            char aChar = text.charAt(counter);
            String alpha = Character.toString(aChar);
            char oChar = text.charAt(length - 1 - counter);
            String omega = Character.toString(oChar);

            if (alpha.equalsIgnoreCase(omega)) {
                counter++;
            } else {
                counter = length;
                paliFlag = false;
            }
        }

        return paliFlag;
    }
    

    public static void main(String[] args) {
        String s = "Poetry 42 is a form of literature that uses aesthetic and rhythmic qualities of language—such as phonaesthetics, sound symbolism, and metre—to evoke meanings in addition to, or in place of, the prosaic ostensible meaning.";
        System.out.println(normalizeText(s));
        s = normalizeText(s);
        System.out.println(isPalindrome(s));

        String g = "Geza kek az eg";
        System.out.println(normalizeText(g));
        g = normalizeText(g);
        System.out.println(isPalindrome(g));

        String g2 = "Geza ke21ek az eg";
        System.out.println(normalizeText(g2));
        g2 = normalizeText(g2);
        System.out.println(isPalindrome(g2));

    }

}
