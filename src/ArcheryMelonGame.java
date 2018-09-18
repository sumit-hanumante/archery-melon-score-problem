public class ArcheryMelonGame implements Game {

    private String[] arrowPoints;
    private int currentArrow;
    private ArcheryMelonScoreService archeryMelonScoreService = new ArcheryMelonScoreService();

    public ArcheryMelonGame() {
        this.arrowPoints = new String[21];
    }

    public void addPoint(String point) {
        arrowPoints[currentArrow++] = point;
    }


    @Override
    public int score() {
        return archeryMelonScoreService.score(arrowPoints);
    }
}
