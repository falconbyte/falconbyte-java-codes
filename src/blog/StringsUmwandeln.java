// Visit https://falconbyte.net
package blog;

public class StringsUmwandeln {

    public static void main(String[] args){

        //Statische MEthoden der Wrapper-Klassen

        // String in primitiven Wert umwandeln
        int i = Integer.parseInt("42");
        double d = Double.parseDouble("42");

        // String in korrespondierende Wrapper-Objekte umwalden
        Integer iW = Integer.valueOf("42");
        Double dW = Double.valueOf("42");

        // 1. If the string is not an integer, NumberFormatException will be thrown.
        // 2. NAtürlich geht das mit den anderen primitiven Typen auch (Byte, Long, Float)

        // Primitiven Wert in String umwa
        String strI = Integer.toString(42);
        String strD = Double.toString(42.0);
        // NAtürlich durch Autounboxing auch korrespondierende Wrapper-Objekte einsetzen:
        String strIW = Integer.toString(iW);


    }

}
