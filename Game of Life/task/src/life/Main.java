package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        System.out.println("Enter seed: ");
        long seed = scanner.nextLong();
        System.out.println("Enter generations: ");
        int generations = scanner.nextInt();

        UniverseGenerator universeGenerator = new UniverseGenerator(size, seed, generations);

        universeGenerator.printUniverse(universeGenerator.initialize());
    }
}