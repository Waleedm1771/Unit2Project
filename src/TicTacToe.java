import java.util.Scanner;

public class TicTacToe {

    static int playerScore = 0;
    static int gameScore = 0;

    public static int play (int round) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int[] squares = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Ready? Round " + round + ":");
        Thread.sleep(2000);
        String a = "   |   |   \n";
        String b = "   |   |   \n";
        String c = "   |   |   \n";
        String d = "-----------\n";
        System.out.println(a + d + b + d + c);
        Thread.sleep(3000);
        if (round == 1) {
            System.out.println("The bot will always go first, because it's pretty dumb.");
            Thread.sleep(1500);
        }
         // MAKE WHILE TURN LOOP
        
        int rand = (int) (Math.random() * 9);
        int remove = squares[rand];

        if (contains(rand, squares)) {
            int[] newList = new int[squares.length - 1];
            int j = 0;
            for (int i = 0; i < squares.length; i++) {
                if (i != rand) {
                    newList[j] = squares[i];
                    j++;
                }
            }
            squares = newList;
        }


        return 0;
    }

    public static boolean contains (int search, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == search) {
                return true;
            }
        }

        return false;
    }

}
