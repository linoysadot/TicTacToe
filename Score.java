public class Score {
    private int scoreX = 0;
    private int scoreO = 0;

    public void addWin(char player) {
        if (player == 'X') scoreX++;
        else if (player == 'O') scoreO++;
    }

    public String getScore() {
        return "X: " + scoreX + " | O: " + scoreO;
    }
}