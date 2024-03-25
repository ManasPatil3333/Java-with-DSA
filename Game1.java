import java.util.Random;
import java.util.Scanner;
class Game
{
    int number;
    int inputNum;
    int noOfGuesses;
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int n)
    {
        noOfGuesses = n;
    }
    Game()
    {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        this.inputNum = sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(inputNum==number)
        {
            System.out.format("Well Done! You guessed it correct , the number was %d and you guessed in %d attempts",number,noOfGuesses);
            return true;
        }
        if(inputNum>number)
        {
            System.out.println("Guess it a little-bit lower");
        }
        if(inputNum<number)
        {
            System.out.println("Guess it a little-bit higher");
        }
        return false;
    }
}
public class Game1
{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b)
        {
            g.takeUserInput();
            b=g.isCorrectNumber();
        }   
    }
}
