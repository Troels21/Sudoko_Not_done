package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {
    Interface aninterface = new Interface();
    Algorimte algorimte = new Algorimte();
    int difficulty = 0;

    public Label TimerID;
    public GridPane GridPaneId;
    public MenuButton DifficultyID;
    public TextField Pane0_0;
    public TextField Pane1_0;
    public TextField Pane2_0;
    public TextField Pane3_0;
    public TextField Pane4_0;
    public TextField Pane5_0;
    public TextField Pane6_0;
    public TextField Pane7_0;
    public TextField Pane8_0;
    public TextField Pane0_1;
    public TextField Pane1_1;
    public TextField Pane2_1;
    public TextField Pane3_1;
    public TextField Pane4_1;
    public TextField Pane5_1;
    public TextField Pane6_1;
    public TextField Pane7_1;
    public TextField Pane8_1;
    public TextField Pane0_2;
    public TextField Pane1_2;
    public TextField Pane2_2;
    public TextField Pane3_2;
    public TextField Pane4_2;
    public TextField Pane5_2;
    public TextField Pane6_2;
    public TextField Pane7_2;
    public TextField Pane8_2;
    public TextField Pane0_3;
    public TextField Pane1_3;
    public TextField Pane2_3;
    public TextField Pane3_3;
    public TextField Pane4_3;
    public TextField Pane5_3;
    public TextField Pane6_3;
    public TextField Pane7_3;
    public TextField Pane8_3;
    public TextField Pane0_4;
    public TextField Pane1_4;
    public TextField Pane2_4;
    public TextField Pane3_4;
    public TextField Pane4_4;
    public TextField Pane5_4;
    public TextField Pane6_4;
    public TextField Pane7_4;
    public TextField Pane8_4;
    public TextField Pane0_5;
    public TextField Pane1_5;
    public TextField Pane2_5;
    public TextField Pane3_5;
    public TextField Pane4_5;
    public TextField Pane5_5;
    public TextField Pane6_5;
    public TextField Pane7_5;
    public TextField Pane8_5;
    public TextField Pane0_6;
    public TextField Pane1_6;
    public TextField Pane2_6;
    public TextField Pane3_6;
    public TextField Pane4_6;
    public TextField Pane5_6;
    public TextField Pane6_6;
    public TextField Pane7_6;
    public TextField Pane8_6;
    public TextField Pane0_7;
    public TextField Pane1_7;
    public TextField Pane2_7;
    public TextField Pane3_7;
    public TextField Pane4_7;
    public TextField Pane5_7;
    public TextField Pane6_7;
    public TextField Pane7_7;
    public TextField Pane8_7;
    public TextField Pane0_8;
    public TextField Pane1_8;
    public TextField Pane2_8;
    public TextField Pane3_8;
    public TextField Pane4_8;
    public TextField Pane5_8;
    public TextField Pane6_8;
    public TextField Pane7_8;
    public TextField Pane8_8;

    public void start() {
        algorimte.makeSudoko();

        if (difficulty == 1) {
            aninterface.easyPicked(Algorimte.board);
        }
        if (difficulty == 2) {
            aninterface.mediumPicked(Algorimte.board);
        }
        if (difficulty == 3) {
            aninterface.hardPicked(Algorimte.board);
        }
        if (difficulty == 4) {
            aninterface.veryHardPicked(Algorimte.board);
        }
        if (difficulty == 5) {
            aninterface.worldClassPicked(Algorimte.board);
        }
        setText(Algorimte.board);
    }

    public void check() {
        try {
            getText();
            if (algorimte.isSudokoSolved()) {
                aninterface.besked("You completed the sudoko");
            } else {
                aninterface.besked("This sudoko is not completed");
            }
        } catch (Exception e) {
            aninterface.besked("Please only writes numbers");
        }
    }

    public void autoSolve() {
        setText(Algorimte.SolvedBoard);
        aninterface.besked("The sudoko is now solved");
    }

    public void easyPicked() {
        DifficultyID.setText("Easy");
        difficulty = 1;
    }

    public void mediumPicked() {
        DifficultyID.setText("Medium");
        difficulty = 2;
    }

    public void hardPicked() {
        DifficultyID.setText("Hard");
        difficulty = 3;
    }

    public void veryHardPicked() {
        DifficultyID.setText("Very Hard");
        difficulty = 4;
    }

    public void worldClassPicked() {
        DifficultyID.setText("World Class");
        difficulty = 5;
    }

    public void setText(int[][] board) {
        String[][] array=new String[9][9];
        for (int x=0; x<9;x++) {
            for (int y=0;y<9;y++) {
                array[x][y]= String.valueOf(board[x][y]);
            }
        }

        for (int x=0; x<9;x++) {
            for (int y=0;y<9;y++) {
                if (array[x][y].equals("0")){
                    array[x][y] = "";
                }
            }
        }

        Pane0_0.setText(array[0][0]);
        Pane1_0.setText(array[1][0]);
        Pane2_0.setText(array[2][0]);
        Pane3_0.setText(array[3][0]);
        Pane4_0.setText(array[4][0]);
        Pane5_0.setText(array[5][0]);
        Pane6_0.setText(array[6][0]);
        Pane7_0.setText(array[7][0]);
        Pane8_0.setText(array[8][0]);
        Pane0_1.setText(array[0][1]);
        Pane1_1.setText(array[1][1]);
        Pane2_1.setText(array[2][1]);
        Pane3_1.setText(array[3][1]);
        Pane4_1.setText(array[4][1]);
        Pane5_1.setText(array[5][1]);
        Pane6_1.setText(array[6][1]);
        Pane7_1.setText(array[7][1]);
        Pane8_1.setText(array[8][1]);
        Pane0_2.setText(array[0][2]);
        Pane1_2.setText(array[1][2]);
        Pane2_2.setText(array[2][2]);
        Pane3_2.setText(array[3][2]);
        Pane4_2.setText(array[4][2]);
        Pane5_2.setText(array[5][2]);
        Pane6_2.setText(array[6][2]);
        Pane7_2.setText(array[7][2]);
        Pane8_2.setText(array[8][2]);
        Pane0_3.setText(array[0][3]);
        Pane1_3.setText(array[1][3]);
        Pane2_3.setText(array[2][3]);
        Pane3_3.setText(array[3][3]);
        Pane4_3.setText(array[4][3]);
        Pane5_3.setText(array[5][3]);
        Pane6_3.setText(array[6][3]);
        Pane7_3.setText(array[7][3]);
        Pane8_3.setText(array[8][3]);
        Pane0_4.setText(array[0][4]);
        Pane1_4.setText(array[1][4]);
        Pane2_4.setText(array[2][4]);
        Pane3_4.setText(array[3][4]);
        Pane4_4.setText(array[4][4]);
        Pane5_4.setText(array[5][4]);
        Pane6_4.setText(array[6][4]);
        Pane7_4.setText(array[7][4]);
        Pane8_4.setText(array[8][4]);
        Pane0_5.setText(array[0][5]);
        Pane1_5.setText(array[1][5]);
        Pane2_5.setText(array[2][5]);
        Pane3_5.setText(array[3][5]);
        Pane4_5.setText(array[4][5]);
        Pane5_5.setText(array[5][5]);
        Pane6_5.setText(array[6][5]);
        Pane7_5.setText(array[7][5]);
        Pane8_5.setText(array[8][5]);
        Pane0_6.setText(array[0][6]);
        Pane1_6.setText(array[1][6]);
        Pane2_6.setText(array[2][6]);
        Pane3_6.setText(array[3][6]);
        Pane4_6.setText(array[4][6]);
        Pane5_6.setText(array[5][6]);
        Pane6_6.setText(array[6][6]);
        Pane7_6.setText(array[7][6]);
        Pane8_6.setText(array[8][6]);
        Pane0_7.setText(array[0][7]);
        Pane1_7.setText(array[1][7]);
        Pane2_7.setText(array[2][7]);
        Pane3_7.setText(array[3][7]);
        Pane4_7.setText(array[4][7]);
        Pane5_7.setText(array[5][7]);
        Pane6_7.setText(array[6][7]);
        Pane7_7.setText(array[7][7]);
        Pane8_7.setText(array[8][7]);
        Pane0_8.setText(array[0][8]);
        Pane1_8.setText(array[1][8]);
        Pane2_8.setText(array[2][8]);
        Pane3_8.setText(array[3][8]);
        Pane4_8.setText(array[4][8]);
        Pane5_8.setText(array[5][8]);
        Pane6_8.setText(array[6][8]);
        Pane7_8.setText(array[7][8]);
        Pane8_8.setText(array[8][8]);
    }

    public void getText() {
        Algorimte.checkBoard[0][0] = Integer.parseInt(Pane0_0.getText());
        Algorimte.checkBoard[1][0] = Integer.parseInt(Pane1_0.getText());
        Algorimte.checkBoard[2][0] = Integer.parseInt(Pane2_0.getText());
        Algorimte.checkBoard[3][0] = Integer.parseInt(Pane3_0.getText());
        Algorimte.checkBoard[4][0] = Integer.parseInt(Pane4_0.getText());
        Algorimte.checkBoard[5][0] = Integer.parseInt(Pane5_0.getText());
        Algorimte.checkBoard[6][0] = Integer.parseInt(Pane6_0.getText());
        Algorimte.checkBoard[7][0] = Integer.parseInt(Pane7_0.getText());
        Algorimte.checkBoard[8][0] = Integer.parseInt(Pane8_0.getText());
        Algorimte.checkBoard[0][1] = Integer.parseInt(Pane0_1.getText());
        Algorimte.checkBoard[1][1] = Integer.parseInt(Pane1_1.getText());
        Algorimte.checkBoard[2][1] = Integer.parseInt(Pane2_1.getText());
        Algorimte.checkBoard[3][1] = Integer.parseInt(Pane3_1.getText());
        Algorimte.checkBoard[4][1] = Integer.parseInt(Pane4_1.getText());
        Algorimte.checkBoard[5][1] = Integer.parseInt(Pane5_1.getText());
        Algorimte.checkBoard[6][1] = Integer.parseInt(Pane6_1.getText());
        Algorimte.checkBoard[7][1] = Integer.parseInt(Pane7_1.getText());
        Algorimte.checkBoard[8][1] = Integer.parseInt(Pane8_1.getText());
        Algorimte.checkBoard[0][2] = Integer.parseInt(Pane0_2.getText());
        Algorimte.checkBoard[1][2] = Integer.parseInt(Pane1_2.getText());
        Algorimte.checkBoard[2][2] = Integer.parseInt(Pane2_2.getText());
        Algorimte.checkBoard[3][2] = Integer.parseInt(Pane3_2.getText());
        Algorimte.checkBoard[4][2] = Integer.parseInt(Pane4_2.getText());
        Algorimte.checkBoard[5][2] = Integer.parseInt(Pane5_2.getText());
        Algorimte.checkBoard[6][2] = Integer.parseInt(Pane6_2.getText());
        Algorimte.checkBoard[7][2] = Integer.parseInt(Pane7_2.getText());
        Algorimte.checkBoard[8][2] = Integer.parseInt(Pane8_2.getText());
        Algorimte.checkBoard[0][3] = Integer.parseInt(Pane0_3.getText());
        Algorimte.checkBoard[1][3] = Integer.parseInt(Pane1_3.getText());
        Algorimte.checkBoard[2][3] = Integer.parseInt(Pane2_3.getText());
        Algorimte.checkBoard[3][3] = Integer.parseInt(Pane3_3.getText());
        Algorimte.checkBoard[4][3] = Integer.parseInt(Pane4_3.getText());
        Algorimte.checkBoard[5][3] = Integer.parseInt(Pane5_3.getText());
        Algorimte.checkBoard[6][3] = Integer.parseInt(Pane6_3.getText());
        Algorimte.checkBoard[7][3] = Integer.parseInt(Pane7_3.getText());
        Algorimte.checkBoard[8][3] = Integer.parseInt(Pane8_3.getText());
        Algorimte.checkBoard[0][4] = Integer.parseInt(Pane0_4.getText());
        Algorimte.checkBoard[1][4] = Integer.parseInt(Pane1_4.getText());
        Algorimte.checkBoard[2][4] = Integer.parseInt(Pane2_4.getText());
        Algorimte.checkBoard[3][4] = Integer.parseInt(Pane3_4.getText());
        Algorimte.checkBoard[4][4] = Integer.parseInt(Pane4_4.getText());
        Algorimte.checkBoard[5][4] = Integer.parseInt(Pane5_4.getText());
        Algorimte.checkBoard[6][4] = Integer.parseInt(Pane6_4.getText());
        Algorimte.checkBoard[7][4] = Integer.parseInt(Pane7_4.getText());
        Algorimte.checkBoard[8][4] = Integer.parseInt(Pane8_4.getText());
        Algorimte.checkBoard[0][5] = Integer.parseInt(Pane0_5.getText());
        Algorimte.checkBoard[1][5] = Integer.parseInt(Pane1_5.getText());
        Algorimte.checkBoard[2][5] = Integer.parseInt(Pane2_5.getText());
        Algorimte.checkBoard[3][5] = Integer.parseInt(Pane3_5.getText());
        Algorimte.checkBoard[4][5] = Integer.parseInt(Pane4_5.getText());
        Algorimte.checkBoard[5][5] = Integer.parseInt(Pane5_5.getText());
        Algorimte.checkBoard[6][5] = Integer.parseInt(Pane6_5.getText());
        Algorimte.checkBoard[7][5] = Integer.parseInt(Pane7_5.getText());
        Algorimte.checkBoard[8][5] = Integer.parseInt(Pane8_5.getText());
        Algorimte.checkBoard[0][6] = Integer.parseInt(Pane0_6.getText());
        Algorimte.checkBoard[1][6] = Integer.parseInt(Pane1_6.getText());
        Algorimte.checkBoard[2][6] = Integer.parseInt(Pane2_6.getText());
        Algorimte.checkBoard[3][6] = Integer.parseInt(Pane3_6.getText());
        Algorimte.checkBoard[4][6] = Integer.parseInt(Pane4_6.getText());
        Algorimte.checkBoard[5][6] = Integer.parseInt(Pane5_6.getText());
        Algorimte.checkBoard[6][6] = Integer.parseInt(Pane6_6.getText());
        Algorimte.checkBoard[7][6] = Integer.parseInt(Pane7_6.getText());
        Algorimte.checkBoard[8][6] = Integer.parseInt(Pane8_6.getText());
        Algorimte.checkBoard[0][7] = Integer.parseInt(Pane0_7.getText());
        Algorimte.checkBoard[1][7] = Integer.parseInt(Pane1_7.getText());
        Algorimte.checkBoard[2][7] = Integer.parseInt(Pane2_7.getText());
        Algorimte.checkBoard[3][7] = Integer.parseInt(Pane3_7.getText());
        Algorimte.checkBoard[4][7] = Integer.parseInt(Pane4_7.getText());
        Algorimte.checkBoard[5][7] = Integer.parseInt(Pane5_7.getText());
        Algorimte.checkBoard[6][7] = Integer.parseInt(Pane6_7.getText());
        Algorimte.checkBoard[7][7] = Integer.parseInt(Pane7_7.getText());
        Algorimte.checkBoard[8][7] = Integer.parseInt(Pane8_7.getText());
        Algorimte.checkBoard[0][8] = Integer.parseInt(Pane0_8.getText());
        Algorimte.checkBoard[1][8] = Integer.parseInt(Pane1_8.getText());
        Algorimte.checkBoard[2][8] = Integer.parseInt(Pane2_8.getText());
        Algorimte.checkBoard[3][8] = Integer.parseInt(Pane3_8.getText());
        Algorimte.checkBoard[4][8] = Integer.parseInt(Pane4_8.getText());
        Algorimte.checkBoard[5][8] = Integer.parseInt(Pane5_8.getText());
        Algorimte.checkBoard[6][8] = Integer.parseInt(Pane6_8.getText());
        Algorimte.checkBoard[7][8] = Integer.parseInt(Pane7_8.getText());
        Algorimte.checkBoard[8][8] = Integer.parseInt(Pane8_8.getText());
    }
}
