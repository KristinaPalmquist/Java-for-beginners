package tutorials.basic;

public class Conditionals {
    static int x = 1;
    public static void main(String[] args) {

        increaseX();
        increaseX();
        System.out.println("Hello");
        increaseX();
        increaseX();
        System.out.println("Goodbye");

        boolean yes = true;
        boolean no = false;

        if(yes && no) {
            System.out.println("AND");
        } else {
            System.out.println("NOT AND");
        }
            
        if(yes || no) {
            System.out.println("OR");
        } else {
            System.out.println("NEITHER");
        }

        int playerx = 50;

        if (playerx < 0 || playerx > 800) {
            System.out.println("Player is outside screen");
        
        }
    }

    static void increaseX() {
        x += 1;
        moreThanThree();
    }

    static void moreThanThree() {
        if(x > 3) {
            System.out.println("Oj");
        } else {
            System.out.println("JA");
        }
    }
}
