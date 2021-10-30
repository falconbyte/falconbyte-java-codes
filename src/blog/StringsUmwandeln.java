// Visit https://falconbyte.net
package blog;

public class StringsUmwandeln {

    public static void main(String[] args){

        // String in primitiven Wert umwandeln
        String s = "42";
        int i = Integer.parseInt(s); // 42
        double d = Double.parseDouble(s); // 42.0
        float f = Float.parseFloat(s); // 42.0
        byte b = Byte.parseByte(s); // 42
        long l = Long.parseLong(s); // 42
        short sh = Short.parseShort(s); // 42

        // Primitiven Wert in String umwandeln
        String strI = Integer.toString(42); // "42"
        String strD = Double.toString(42.0); // "42.0"

    }
}
