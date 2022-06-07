import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        String ready = scan.nextLine();
        if (!ready.equals("")) {
            System.out.println("\n• There are two players, you and the computer.");
            System.out.println("• The dealer will give each player one card.");
            System.out.println("• Then, the dealer will draw five cards (the river).");
            System.out.println("• The player with the most river matches wins!");
            System.out.println("• If the matches are equal, everyone's a winner!");
            System.out.println("\n• Ready? Type anything if you are.");
        } else {
            System.out.println("Dang, maybe next time.");
            System.exit(0);
        }
        String ready2 = scan.nextLine();

        String yourCard = randomCard();
        String compCard = randomCard();
        if (!ready2.equals("")) {
            System.out.println("\nHere's your card:\n");
            System.out.println(yourCard);
            System.out.println("Here's the computer's card:\n");
            System.out.println(compCard);
            System.out.println("\nPlease press enter to continue.");

        } else {
            System.out.println("Dang, maybe next time.");
            System.exit(0);
        }

        int yourMatches = 0;
        int computerMatches = 0;
        String ready3 = scan.nextLine();
        if (ready3.equals("")) {
            int counter = 1;
            System.out.println("• The dealer will draw when the user types: hit me! + presses enter.");
            String hitMe = scan.nextLine();
            while (hitMe.equals("hit me!") && counter <= 5) {
                System.out.println("Card " + counter + "\n");
                String randoDraw = randomCard();
                System.out.println(randoDraw);
                if (randoDraw.equals(yourCard)) {
                    yourMatches++;
                }
                if (randoDraw.equals(compCard)) {
                    computerMatches++;
                }
                counter++;
            }
        }

        if (yourMatches > computerMatches) {
            System.out.println("•Your number of matches: " + yourMatches);
            System.out.println("•Computer's number of matches: " + computerMatches);
            System.out.println("\n-->You win! YAY!\n");
        } else if (computerMatches > yourMatches) {
            System.out.println("•Your number of matches: " + yourMatches);
            System.out.println("•Computer's number of matches: " + computerMatches);
            System.out.println("\n-->You lose! SORRY!\n");
        } else if (computerMatches == yourMatches) {
            System.out.println("•Your number of matches: " + yourMatches);
            System.out.println("•Computer's number of matches: " + computerMatches);
            System.out.println("\n-->It's a tie! WOW!\n");
        } else {
            System.out.println("\nWe have encountered an error. Try again!\n");
        }

        scan.close();
    }

    public static String randomCard() {
        int rando = (int) (Math.random() * 13) + 1;
        String finalStr = "";

        switch (rando) {
            case 1:
                finalStr =

                        "   _____\n" +
                                "  |A _  |\n" +
                                "  | ( ) |\n" +
                                "  |(_'_)|\n" +
                                "  |  |  |\n" +
                                "  |____V|\n";
                break;

            case 2:
                finalStr =

                        "   _____\n" +
                                "  |2    |\n" +
                                "  |  o  |\n" +
                                "  |     |\n" +
                                "  |  o  |\n" +
                                "  |____Z|\n";
                break;

            case 3:
                finalStr = "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
                break;

            case 4:
                finalStr = "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
                break;

            case 5:
                finalStr = "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
                break;

            case 6:
                finalStr = "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
                break;

            case 7:
                finalStr =

                        "   _____ \n" +
                                "  |7    |\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |____7|\n";
                break;

            case 8:
                finalStr =

                        "   _____ \n" +
                                "  |8    |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  |____8|\n";
                break;

            case 9:
                finalStr = "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
                break;

            case 10:
                finalStr = "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                break;

            case 11:
                finalStr =

                        "   _____\n" +
                                "  |J  ww|\n" +
                                "  | o {)|\n" +
                                "  |o o% |\n" +
                                "  | | % |\n" +
                                "  |__%%[|\n";
                break;

            case 12:
                finalStr =

                        "   _____\n" +
                                "  |Q  ww|\n" +
                                "  | o {(|\n" +
                                "  |o o%%|\n" +
                                "  | |%%%|\n" +
                                "  |_%%%O|\n";
                break;

            case 13:
                finalStr = "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
                break;
            default:
                System.out.println("Mistake was made");

        }
        return finalStr;
    }
}
