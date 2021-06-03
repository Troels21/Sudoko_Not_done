package sample;

import org.junit.jupiter.api.BeforeEach;

class Test {
    Algorimte algorimte;
    Interface anInterface;

    @BeforeEach
    void setup() {
        algorimte = new Algorimte();
        anInterface = new Interface();
    }

    @org.junit.jupiter.api.Test
    void createSodukoTest() {
        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
    }

    @org.junit.jupiter.api.Test
    void Randomnumbertest() {
    }

    @org.junit.jupiter.api.Test
    void test() {
        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
        anInterface.easyPicked(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();

        algorimte.clear();

        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
        anInterface.mediumPicked(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();

        algorimte.clear();

        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
        anInterface.hardPicked(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();

        algorimte.clear();

        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
        anInterface.veryHardPicked(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();

        algorimte.clear();

        algorimte.makeSudokodiagonal();
        algorimte.solve(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
        anInterface.worldClassPicked(algorimte.board);
        anInterface.printSoduko(algorimte.board);
        System.out.println();
    }
}