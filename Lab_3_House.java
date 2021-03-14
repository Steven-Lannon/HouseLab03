package lab_3_house;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

//main class
public class Lab_3_House extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //set stage
    @Override
    public void start(Stage stage) throws Exception {
        
        //create new group
        Group gp = new Group();
        Rectangle sky = new Rectangle(800, 700, Color.CHARTREUSE); //ceate sky
        Rectangle grass = new Rectangle(800, 250, Color.AZURE); //ceate grass
        Polygon roof = new Polygon(); //create roof, plotting points for triangle
        roof.getPoints().setAll(
                400.0, 0.0,
                75.0, 175.0,
                725.0, 175.0);
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);

        gp.getChildren().add(sky); //add children to group
        gp.getChildren().add(grass);
        gp.getChildren().add(roof);

        Rectangle red = new Rectangle(500, 450, Color.FIREBRICK); //create house base
        red.setX(150);
        red.setY(175);
        red.setStroke(Color.BLACK);
        gp.getChildren().add(red);

        Rectangle horizontalRect = new Rectangle(500, 30, Color.WHITE); //create top white rectangle
        horizontalRect.setX(150);
        horizontalRect.setY(175);
        horizontalRect.setStroke(Color.BLACK);
        gp.getChildren().add(horizontalRect);

        Rectangle grayBlock = new Rectangle(60, 40, Color.GAINSBORO); //create middle grey block
        grayBlock.setX(370);
        grayBlock.setY(240);
        grayBlock.setStroke(Color.BLACK);
        gp.getChildren().add(grayBlock);

//pillars
        int pillarWidth = 50; //dimenions and position variables
        int pillarLength = 330;
        int pillarY = 205;

        Rectangle[] pillar = new Rectangle[4]; 
        for (int i = 0; i < 4; i++) { //loop to display 4 pillar equally
            pillar[i] = new Rectangle(165 + i * 140, pillarY, pillarWidth, pillarLength);
            pillar[i].setStroke(Color.BLACK);
            pillar[i].setFill(Color.WHITE);
            gp.getChildren().add(pillar[i]);
        }

//circles
        //circle left
        int ballRadius = 16;
        int ballY = 221;

        Circle[] ballLeft = new Circle[4];
        for (int i = 0; i < 4; i++) { //loop to display 4 left side circles equally
            ballLeft[i] = new Circle(166 + i * 140, ballY, ballRadius);
            ballLeft[i].setStroke(Color.BLACK);
            ballLeft[i].setFill(Color.WHITE);
            gp.getChildren().add(ballLeft[i]);
        }

        //circle right
        Circle[] ballRight = new Circle[4];
        for (int i = 0; i < 4; i++) { //loop to display 4 right side circles equally
            ballRight[i] = new Circle(214 + i * 140, ballY, ballRadius);
            ballRight[i].setStroke(Color.BLACK);
            ballRight[i].setFill(Color.WHITE);
            gp.getChildren().add(ballRight[i]);
        }

//pillar plates
        int pillarPlateWidth = 65;
        int pillarPlateLength = 15;
        int pillarPlateY = 520;

        Rectangle[] pillarPlate = new Rectangle[4];
        for (int i = 0; i < 4; i++) { //loop to display 4 pillar plates equally
            pillarPlate[i] = new Rectangle(157 + i * 140, pillarPlateY, pillarPlateWidth, pillarPlateLength);
            pillarPlate[i].setStroke(Color.BLACK);
            pillarPlate[i].setFill(Color.WHITE);
            gp.getChildren().add(pillarPlate[i]);
        }

//doors
        //side doors
        int doorWidth = 60; //side door dimensions and position variables
        int doorLength = 200;
        int doorY = 400;
        //left door
        Rectangle sideDoorLeft = new Rectangle(doorWidth, doorLength, Color.WHITE);
        sideDoorLeft.setX(230);
        sideDoorLeft.setY(doorY);
        sideDoorLeft.setStroke(Color.BLACK);
        gp.getChildren().add(sideDoorLeft);
        //right door
        Rectangle sideDoorRight = new Rectangle(doorWidth, doorLength, Color.WHITE);
        sideDoorRight.setX(510);
        sideDoorRight.setY(doorY);
        sideDoorRight.setStroke(Color.BLACK);
        gp.getChildren().add(sideDoorRight);
        //middle door
        Rectangle middleDoor = new Rectangle(doorWidth, doorLength, Color.WHITE);
        middleDoor.setX(370);
        middleDoor.setY(360);
        middleDoor.setStroke(Color.BLACK);
        gp.getChildren().add(middleDoor);

//black squares
        //small squares variables
        int sqWidth = 15;
        int sqLength = 13;
        int sqX = 28;
        int sqY = 405;

        //long black rectangles variables
        int rectWidth = 15;
        int rectLength = 21;
        int rectY = 425;
        int rectDis = 30;

        //left door black boxes
        Rectangle[] sqLeft = new Rectangle[2];
        for (int i = 0; i < 2; i++) { //loop for squares
            sqLeft[i] = new Rectangle(sqX * i + 238, sqY, sqWidth, sqLength);
            sqLeft[i].setFill(Color.BLACK);
            gp.getChildren().add(sqLeft[i]);
        }

        Rectangle[] rectLeft = new Rectangle[4];
        for (int i = 0; i < 4; i++) { //loop for rectangles
            rectLeft[i] = new Rectangle(238, rectDis * i + rectY, rectWidth, rectLength);
            rectLeft[i].setFill(Color.BLACK);
            gp.getChildren().add(rectLeft[i]);
        }
        for (int i = 0; i < 4; i++) {
            rectLeft[i] = new Rectangle(266, rectDis * i + rectY, rectWidth, rectLength);
            rectLeft[i].setFill(Color.BLACK);
            gp.getChildren().add(rectLeft[i]);
        }

        //right door black boxes
        Rectangle[] sqRight = new Rectangle[2];
        for (int i = 0; i < 2; i++) { //loop for squares
            sqRight[i] = new Rectangle(sqX * i + 517, sqY, sqWidth, sqLength);
            sqRight[i].setFill(Color.BLACK);
            gp.getChildren().add(sqRight[i]);
        }
        Rectangle[] rectRight = new Rectangle[4];
        for (int i = 0; i < 4; i++) { //loop for rectnagles
            rectRight[i] = new Rectangle(517, rectDis * i + rectY, rectWidth, rectLength);
            rectRight[i].setFill(Color.BLACK);
            gp.getChildren().add(rectRight[i]);
        }
        for (int i = 0; i < 4; i++) {
            rectRight[i] = new Rectangle(545, rectDis * i + rectY, rectWidth, rectLength);
            rectRight[i].setFill(Color.BLACK);
            gp.getChildren().add(rectRight[i]);
        }
        //middle door black boxes
        Rectangle[] sqMiddle = new Rectangle[2];
        for (int i = 0; i < 2; i++) { //loop for squares
            sqMiddle[i] = new Rectangle(sqX * i + 378, sqY, sqWidth, sqLength);
            sqMiddle[i].setFill(Color.BLACK);
            gp.getChildren().add(sqMiddle[i]);
        }

        Rectangle[] rectMiddle = new Rectangle[4];
        for (int i = 0; i < 4; i++) { //loop for rectangles
            rectMiddle[i] = new Rectangle(378, rectDis * i + rectY, rectWidth, rectLength);
            rectMiddle[i].setFill(Color.BLACK);
            gp.getChildren().add(rectMiddle[i]);
        }
        for (int i = 0; i < 4; i++) {
            rectMiddle[i] = new Rectangle(406, rectDis * i + rectY, rectWidth, rectLength);
            rectMiddle[i].setFill(Color.BLACK);
            gp.getChildren().add(rectMiddle[i]);
        }
//gray plates
        Rectangle greyPlate1 = new Rectangle(80, 7, Color.GAINSBORO); //create plates and set positions/dimentions
        greyPlate1.setX(150);
        greyPlate1.setY(535);
        greyPlate1.setStroke(Color.BLACK);
        gp.getChildren().add(greyPlate1);

        Rectangle greyPlate2 = new Rectangle(80, 7, Color.GAINSBORO);
        greyPlate2.setX(570);
        greyPlate2.setY(535);
        greyPlate2.setStroke(Color.BLACK);
        gp.getChildren().add(greyPlate2);

        //Stairs
        int stairHeight = 12;
        Rectangle[] stairs = new Rectangle[stairHeight];
        for (int i = 0; i < stairHeight; i++) { //loop that creates steps and gradually makes rectangle longer, 12 iteration for 12 steps 
            stairs[i] = new Rectangle(215 - i * stairHeight, 535 + i * stairHeight, 370 + 2 * i * stairHeight, stairHeight);
            stairs[i].setFill(Color.GAINSBORO);
            stairs[i].setStroke(Color.BLACK);
            gp.getChildren().add(stairs[i]);
        }

        Scene sn = new Scene(gp, 800, 700); //set scene dimensions
        stage.setScene(sn);
        stage.show();
    }
}
