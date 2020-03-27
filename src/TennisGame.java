public class TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String MINUS = "-";

    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfPlayer2) {

        String score = "";
        int tempScore;
        final boolean isFirstEqualSecond = scoreOfPlayer1 == scoreOfPlayer2;
        final boolean isScoreOfPlayer1 = scoreOfPlayer1 >= 4;
        final boolean isScoreOfPlayer2 = scoreOfPlayer2 >= 4;

        if (isFirstEqualSecond) {
            switch (scoreOfPlayer1) {
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
        } else if (isScoreOfPlayer1 || isScoreOfPlayer2) {

            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            final boolean isMinusResultEqualOne = minusResult == 1;
            final boolean isMinusResultEqualNegativeOne = minusResult == -1;
            final boolean isMinusResultOverOrEqualTwo = minusResult >= 2;

            if (isMinusResultEqualOne) {
                score = "Advantage player1";
            } else if (isMinusResultEqualNegativeOne) {
                score = "Advantage player2";
            } else if (isMinusResultOverOrEqualTwo) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scoreOfPlayer1;
                } else {
                    score += MINUS;
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}