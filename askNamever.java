import java.util.Random;
import java.util.Scanner;

class askNamever {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = 3;
        int headsCnt = 0;
        int tailsCnt = 0;
        Random rand = new Random();
        System.out.print("Who are you?\n> ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Tossing a coin...");
        for (int i = 0; i < round; i++) {
            System.out.print("Round " + (i + 1) + ": ");
            if ((rand.nextInt(10) + 100) % 2 == 0) {
                headsCnt++;
                System.out.println("Heads");
            } else {
                tailsCnt++;
                System.out.println("Tails");
            }
        }
        System.out.println("Heads: " + headsCnt + ", " + "Tails: " + tailsCnt);
    }
}