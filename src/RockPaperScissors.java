public class RockPaperScissors {

    private int rounds;

    public RockPaperScissors(int numberRounds){
        rounds = numberRounds;
    }

    public static void play (String answer, int round) throws InterruptedException {
        System.out.println("Rock");
        Thread.sleep(500);
        System.out.println("Paper");
        Thread.sleep(500);
        System.out.println("Scissors");
        Thread.sleep(500);
        System.out.println("Shoot!");

    }
}
