import java.util.Random;

// backend
public class RockPaperScissor {
    // alll of the choices that computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    // store the computer chocie so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    // store the scores so that we can retrieve the values and display it to the frontend
    private int computerScore, playerScore;

    // use to generate random number to randomly choose an option for the computer
    private Random random;

    // constructor to initialize random obj
    public RockPaperScissor() {
        random = new Random();
    }

    // call this method to begin playing rock paper scissor
    // playerChoice - is the choice made by the player (rock, paper, scissor)
    // this method will return the result of the game (cumputer win player win, draw)
    public String playRockPaperScissor(String playerChoice){
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluate the winner
        if (computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player win";
                playerScore++;
            }else if(playerChoice.equals("Scissors")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player win";
                playerScore++;
            }else if(playerChoice.equals("Rock")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        } else {
            // computer chooses scissors
            if(playerChoice.equals("Rock")){
                result = "Player win";
                playerScore++;
            }else if(playerChoice.equals("Paper")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }

        return result;
    }


}
