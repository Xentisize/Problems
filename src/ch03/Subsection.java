package ch03;

public class Subsection {
    public static void main(String[] args) {
        String originalString = "This is the original String";
        System.out.println(originalString.substring(0, originalString.length()));
        // substring(start: include, end: exclude)
        System.out.println(originalString.substring(5, 27));
        // substring(
        System.out.println(originalString.substring(12));
    }
}
