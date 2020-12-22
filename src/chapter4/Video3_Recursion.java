package chapter4;

public class Video3_Recursion {

    public static void countDown(Integer x) {
        if (x < 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x - 1);
    }

    public static void countUp(Integer x) {
        if (x > 10) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x + 1);
    }

    public static void main(String[] args) {
        countDown(10);
        countUp(0);
    }
}
