package task1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(points(13, 12));
        System.out.println(footballPoints(3, 4, 2));
        System.out.println(divisibleByFive(5));
        System.out.println(and(true, false));
        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(squared(5));
        System.out.println(profitableGamble(0.2D, 50, 9));
        System.out.println(frames(1, 1));
        System.out.println(mod(5, 2));
    }

    public static int convert(int x) {
        return x * 60;
    }

    public static int points(int p2, int p3) {
        return p2 * 2 + p3 * 3;
    }

    public static int footballPoints(int p1, int p2, int p3) {
        return 3 * p1 + 2 * p2 + 0 * p3;
    }

    public static boolean divisibleByFive(int x) {
        return x % 5 == 0;
    }

    public static boolean and(boolean b1, boolean b2) {
        return b1 && b2;
    }

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    public static int squared(int b) {
        return b * b;
    }

    public static boolean profitableGamble(double prod, int prize, int pay) {
        return prod * (double)prize - (double)pay > 0.0D;
    }

    public static int frames(int f, int t) {
        return t * f * 60;
    }

    public static int mod(int a, int b) {
        return a - a / b * b;
    }
}