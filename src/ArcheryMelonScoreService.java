public class ArcheryMelonScoreService {

    private static final int MAX_POINT_PER_CHANCE = 10;
    private String[] arrowPoints;

    public int score(String[] arrowPoints) {
        this.arrowPoints = arrowPoints;
        int score = 0;
        int chance = 0;

        for (int i = 0; i < 10; i++) {
            if (isStrike(chance)) {
                score += MAX_POINT_PER_CHANCE + strikeBonus(chance);
                if (arrowPoints[chance+1].equals("X")){
                    chance++;
                }
                chance++;
            } else if (isSpare(chance)) {
                if (Integer.valueOf(arrowPoints[chance])==0){
                    score = score+spareBonus(chance+1);
                }
                score += MAX_POINT_PER_CHANCE + spareBonus(chance);
                chance += 2;
            } else {
                score += sumOfChance(chance);
                chance += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int chance) {
        return Integer.valueOf(arrowPoints[chance]) == MAX_POINT_PER_CHANCE;
    }

    private boolean isSpare(int chance) {
        return sumOfChance(chance) == MAX_POINT_PER_CHANCE;
    }

    private int strikeBonus(int chance) {
        return sumOfChance(chance+1);
    }

    private int spareBonus(int chance) {
        return Integer.valueOf(arrowPoints[chance+2]);
    }

    private int sumOfChance(int chance) {
        if (arrowPoints[chance].equals("X")){
            chance++;
        }
        return Integer.valueOf(arrowPoints[chance]) + Integer.valueOf(arrowPoints[chance+1]);
    }

}
