package blog.fibonacci;

public class FibonacciZahlLiefern {

    public static void main(String[] args) {
        int x = getFibonacciNumberAtV3(5); // 8
        System.out.println(x);
    }

    // Iterativer Ansatz (empfohlen)
    public static int getFibonacciNumberAtV3(int n){
        int last = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int old_last = last;
            last = next;
            next = old_last + next;
        }
        return next;
    }

    // Alternative: Rekursiver Ansatz (nicht empfohlen)
    public static int getFibonacciNumberAt(int n) {
        if (n < 2) {
            return n;
        } else
            return getFibonacciNumberAt(n - 1) + getFibonacciNumberAt(n - 2);
    }

}
