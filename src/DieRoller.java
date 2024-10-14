import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        int rollTotal = 0;
        String playAgain = "";

        System.out.println("Roll #\tDie1\tDie2\tDie3");
        do
        {
            do
            {
                die1 = gen.nextInt(6) +1;
                die2 = gen.nextInt(6) +1;
                die3 = gen.nextInt(6) +1;
                dieRoll ++;
                rollTotal = die1+die2+die3;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", dieRoll, die1, die2, die3, rollTotal);

            }while(!(die1==die2 && die2==die3));
            System.out.println("Do you want to play again? [Y/N]: ");
            playAgain = in.next();
        }while (playAgain.equalsIgnoreCase("Y"));


    }
}