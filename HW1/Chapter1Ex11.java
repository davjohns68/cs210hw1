
// CS210 Assignment #1 "Two Rockets"
// David Johnson
// Prints a pair of rockets to the console

public class Chapter1Ex11 {
    public static void main(String[] args) {
        noseCones();
        boxes();
        usa();
        boxes();
        noseCones();
    }
    
    public static void noseCones() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    
    public static void boxes() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    
    public static void usa() {
        System.out.println("|United| |States|");
        System.out.println("|United| |States|");
    }
}