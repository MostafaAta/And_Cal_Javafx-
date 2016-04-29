import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane p1=new GridPane();
        
        p1.setStyle("-fx-background-color:#EEE");
        VBox v1=new VBox();
        HBox h1=new HBox();
        p1.setAlignment(Pos.CENTER);
        p1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        p1.setHgap(5.5);
        p1.setVgap(5.5);
        TextArea textarea=new TextArea();
        textarea.setPrefSize(180, 60);
        textarea.setStyle("-fx-border-color:lightblue;border-width:2px");
        Button b0=new Button("0");
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button bDot=new Button(".");
        Button bPlus=new Button("+");
        Button bMinus=new Button("-");
        Button bMult=new Button("x");
        Button bDiv=new Button("/");
        Button bMod=new Button("%");
        Button bRp=new Button("(");
        Button bLp=new Button(")");
        Button bEqual=new Button("=");
        Button bPow=new Button("x^2");
        Button bClear=new Button("?");
        Button bClearall=new Button("?");
        Button bSqrt=new Button("?");
        Button bMod2=new Button("%");
        bs(b7);
        bs(b8);
        bs(b9);
        bs(bDiv);
        bs(bClear);
        bs(bClearall);
        bs(b4);
        bs(b5);
        bs(b6);
        bs(bMult);
        bs(bRp);
        bs(bLp);
        bs(b1);
        bs(b2);
        bs(b3);
        bs(bMinus);
        bs(bPow);
        bs(bSqrt);
        bs(b0);
        bs(bDot);
        bs(bMod2);
        bs(bPlus);
      
        bEqual.setPrefWidth(85);
        bEqual.setPrefHeight(30);
       
        bs(b5);
        v1.getChildren().add(textarea);
        p1.add(b7, 0, 0);
        p1.add(b8, 1, 0);
        p1.add(b9, 2, 0);
        p1.add(bDiv, 3, 0);
        p1.add(bClear, 4, 0);
        p1.add(bClearall, 5, 0);
        p1.add(b4,0,1);
        p1.add(b5,1,1);
        p1.add(b6,2,1);
        p1.add(bMult,3,1);
        p1.add(bRp,4,1);
        p1.add(bLp,5,1);
        p1.add(b1,0,2);
        p1.add(b2,1,2);
        p1.add(b3,2,2);
        p1.add(bMinus,3,2);
        p1.add(bPow,4,2);
        p1.add(bSqrt,5,2);
        p1.add(b0,0,3);
        p1.add(bDot,1,3);
        p1.add(bMod2,2,3);
        p1.add(bPlus,3,3);
        p1.add(bEqual,4,3,5,3);
        p1.setValignment(bEqual, VPos.TOP);
        v1.getChildren().add(p1);
        Scene scene = new Scene(v1, 300, 250);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public void bs(Button b){
    b.setStyle("-fx-padding:5px;font-size:18px");
    b.setPrefSize(50, 30);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}