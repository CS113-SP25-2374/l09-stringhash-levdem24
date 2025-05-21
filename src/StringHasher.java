public class StringHasher {

    public static int badHash(String s) {
        return s.length(); // Not great – lots of collisions!
    }

    public static int betterHash(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash += s.charAt(i); // Still not great – order doesn't matter
        }
        return hash;
    }

    public static int javaHashCode(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = 31 * hash + s.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "hello", "olleh", "world", "dlrow", "java", "avaj",
                "hash", "shah", "code", "decode"
        };

        System.out.println("String\t\tbadHash\t\tbetterHash\t\thashCode");
        for (String s : testStrings) {
            System.out.printf("%-10s\t%-10d\t%-12d\t%-10d\n",
                    s, badHash(s), betterHash(s), javaHashCode(s));
        }
    }
}
