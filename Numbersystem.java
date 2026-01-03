public class Numbersystem {
    public static void main(String[] args) {
        int n=12654;
        System.out.println("Decimal: "+n);
        System.out.println("Binary Equivalent: "+Integer.toBinaryString(n));
        System.out.println("Octal Equivalent: "+Integer.toOctalString(n));
        System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(n));
    }
}
