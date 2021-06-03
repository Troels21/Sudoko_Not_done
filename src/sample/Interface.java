package sample;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class Interface {
    Algorimte algo = new Algorimte();

    public void printSoduko(int[][] array) {
        for (int y = 0; y < 9; y++) {
            System.out.println();
            for (int x = 0; x < 9; x++) {
                System.out.print(array[x][y] + " ");
            }
        }
    }

    public void easyPicked(int[][] array) {
        // 38 hints
        remover(38, array);
    }

    public void mediumPicked(int[][] array) {
        //  30 hints
        remover(30, array);

    }

    public void hardPicked(int[][] array) {
        // 28 hints
        remover(27, array);
    }

    public void veryHardPicked(int[][] array) {
        // 23 hints
        remover(23, array);

    }

    public void worldClassPicked(int[][] array) {
        // 17 hints
        remover(17, array);

    }

    public void remover(int hints, int[][] array) {

        int number = (hints - 81) * (-1);
        int removedFields = 0;
        while (removedFields < number) {
            int tal1 = algo.randomnumber();
            int tal2 = algo.randomnumber();
            if (array[tal1][tal2] != 0) {
                array[tal1][tal2] = 0;
                removedFields++;
            }
        }
    }

    public void besked(String message) {
        javafx.scene.control.Label alertLabel = new javafx.scene.control.Label();
        StackPane allertLayout = new StackPane();
        Stage allertStage = new Stage();
        javafx.scene.control.Button allertButton = new Button();

        allertButton.setText("OK");
        alertLabel.setText(message);
        allertStage.setTitle("Alert");

        allertButton.setOnAction(p -> allertStage.close());
        allertLayout.getChildren().addAll(allertButton, alertLabel);
        Scene allertScene = new Scene(allertLayout, 200, 100);
        alertLabel.setTranslateY(-25);

        allertStage.setScene(allertScene);
        allertStage.initModality(Modality.APPLICATION_MODAL);
        allertStage.show();
    }

}
