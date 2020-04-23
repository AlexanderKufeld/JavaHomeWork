import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KeyboardGuess source = new KeyboardGuess();
        ConsoleOutput output = new ConsoleOutput();
        int secretNumber = 15;
        int attemptsCount = 3;

        GuessNumberGame game = new GuessNumberGame(secretNumber, attemptsCount, source, output);
        game.play();
    }
}

/*
    // public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int guess=-1;
        int number = random.nextInt(10);
        while (count < 3 && guess != number) {
            System.out.print("Guess the number (0..9): ");
            guess = scanner.nextInt();
            if (number != guess) {
                System.out.println("Your number is " +
                        ((guess > number)? "greater" : "less"));
                count++;
            }
        }
        System.out.println("You " + ((guess == number)? "WIN!" : "Lose: " + number));
    }
}
*/