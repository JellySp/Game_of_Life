package life;

public class NeighbourChecker {
    boolean[][] gameGrid;
    int count = 0;

    public NeighbourChecker(boolean[][] gameGrid) {
        this.gameGrid = gameGrid;
    }

    public int checkNorthWest(int i, int j) {
        count = 0;
        if (i == 0 && j == 0) {
            if (gameGrid[gameGrid.length - 1][gameGrid.length -1]) {
                count++;
            }
        } else if (i == 0) {
            if (gameGrid[gameGrid.length - 1][j - 1]) {
                count++;
            }
        } else if (j == 0) {
            if (gameGrid[i - 1][gameGrid.length - 1]) {
                count++;
            }
        } else {
            if (gameGrid[i - 1][j - 1]){
                count++;
            }
        }
        return count;
    }
    public int checkNorth(int i, int j) {
        count = 0;

        if (j == 0) {
            if (gameGrid[i][gameGrid.length - 1]) {
                count++;
            }
        } else {
            if (gameGrid[i][j-1]) {
                count++;
            }
        }

        return count;
    }
    public int checkNorthEast(int i, int j) {
        count = 0;
        return count;
    }
    public int checkWest(int i, int j) {
        count = 0;
        return count;
    }
    public int checkEast(int i, int j) {
        count = 0;
        return count;
    }
    public int checkSouthWest(int i, int j) {
        count = 0;
        return count;
    }
    public int checkSouth(int i, int j) {
        count = 0;
        return count;
    }
    public int checkSouthEast(int i, int j) {
        count = 0;
        return count;
    }

}
