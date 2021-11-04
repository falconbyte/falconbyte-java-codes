package blog;

public class Zufallszahl {

    public static void main(String[] args) {

        double zufallszahl = Math.random();      // Zufall zwischen 0.00000 ... < 1.00000
        zufallszahl = zufallszahl * 10;          // Zwischen 0.00000 ... < 10.00000
        int zufallszahlGanz = (int) zufallszahl; // Ganze Zahl zwischen 0 ... < 10
        zufallszahlGanz = zufallszahlGanz + 1;   // 1 ... 10

        // Alles in einer Anweisung:
        int zufall = (int) ((Math.random() * 10) + 1); // 1 ... 10
        System.out.println(zufall);

    }

}
