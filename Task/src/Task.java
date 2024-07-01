public class Task {

    public static String makeStarGrid(final int HEIGHT, final int WIDTH) {
        StringBuilder starGrid = new StringBuilder();
        for (int i = 0; i < HEIGHT; i++) {
            startLine(starGrid);
            for (int j = 1; j < WIDTH; j++) {   
                appendStarsInLine(starGrid);
            }
            if (nextLineIsNeed(i, HEIGHT)) {
                goToNextLine(starGrid);
            }
        }
        return starGrid.toString();
    }

    private static void startLine(StringBuilder starGrid) {
        starGrid.append('*');
    }

    private static void appendStarsInLine(StringBuilder starGrid) {
        starGrid.append(" *");
    }

    private static boolean nextLineIsNeed(int i, int HEIGHT) {
        return i < HEIGHT - 1;
    }

    private static void goToNextLine(StringBuilder starGrid) {
        starGrid.append("\n");
    }

    public static void main(String[] args) {
        final int HEIGHT = 3, WIDTH = 5;
        System.out.println(makeStarGrid(HEIGHT, WIDTH));
    }
}
