package life;


import java.util.ArrayList;
import java.util.Random;

//An alive cell survives if has two or three alive neighbors;
// otherwise, it dies of boredom (<2) or overpopulation (>3)
public class UniverseGenerator {
    int universeSize;
    long seed;
    int generations;

    public UniverseGenerator(int universeSize, long seed, int generations) {
        this.universeSize = universeSize;
        this.seed = seed;
        this.generations = generations;
    }

    public boolean[][] initialize() {
        boolean[][] gameGrid = new boolean[universeSize][universeSize];
        Random random = new Random(seed);
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid.length; j++) {
                gameGrid[i][j] = random.nextBoolean();
            }
        }
        return gameGrid;
    }

    public void printUniverse(boolean[][] gameGrid) {
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid.length; j++) {
                if (gameGrid[i][j]) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
