package _08_clean_code_and_refactoring.exercise;

public class TennisGame {

    public static final int ADVANTAGE = 1;
    public static final int WIN_CONDITION = 2;
    public static final int TIEBREAK = 4;

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score = "";
        if (scorePlayer1 == scorePlayer2) {
            score = returnCompare(scorePlayer1);
        } else if (scorePlayer1 >= TIEBREAK || scorePlayer2 >= TIEBREAK) {
            score = winCondition(scorePlayer1, scorePlayer2);
        } else {
            score = winCompare(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }

    private static String winCompare(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String returnCompare(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private static String winCondition(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == ADVANTAGE) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= WIN_CONDITION) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
