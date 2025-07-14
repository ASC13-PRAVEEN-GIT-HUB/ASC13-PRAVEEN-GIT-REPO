package lab1;

public class StringMethodDem {

    public static void testCharAt(String input) {
        System.out.println("charAt(2): " + input.charAt(2));
    }

    public static void testContains(String input) {
        System.out.println("contains(\"test\"): " + input.contains("test"));
    }

    public static void testLength(String input) {
        System.out.println("length(): " + input.length());
    }

    public static void testIndexOf(String input) {
        System.out.println("indexOf(\"a\"): " + input.indexOf("a"));
    }

    public static void testEquals(String input) {
        System.out.println("equals(\"Test String\"): " + input.equals("Test String"));
    }

    public static void testEqualsIgnoreCase(String input) {
        System.out.println("equalsIgnoreCase(\"test string\"): " + input.equalsIgnoreCase("test string"));
    }

    public static void testJoin() {
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("join(): " + joined);
    }

    public static void testLastIndexOf(String input) {
        System.out.println("lastIndexOf(\"a\"): " + input.lastIndexOf("a"));
    }

    public static void testSubstring(String input) {
        System.out.println("substring(5, 11): " + input.substring(5, 11));
    }

    public static void testToLowerCase(String input) {
        System.out.println("toLowerCase(): " + input.toLowerCase());
    }

    public static void testToUpperCase(String input) {
        System.out.println("toUpperCase(): " + input.toUpperCase());
    }

    public static void testTrim(String input) {
        System.out.println("trim(): '" + input.trim() + "'");
    }

    public static void main(String[] args) {
        String testString = "  This is a Test String  ";

        System.out.println("Original String: '" + testString + "'\n");

        testCharAt(testString.trim());
        testContains(testString);
        testLength(testString);
        testIndexOf(testString);
        testEquals(testString.trim());
        testEqualsIgnoreCase(testString.trim());
        testJoin();
        testLastIndexOf(testString);
        testSubstring(testString);
        testToLowerCase(testString);
        testToUpperCase(testString);
        testTrim(testString);
    }
}
