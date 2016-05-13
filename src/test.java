  import java.util.Stack;

import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.GridPane;
 import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
 import javafx.scene.text.FontPosture;
 import javafx.scene.text.FontWeight;
 import javafx.stage.Stage;
 public class test extends Application {
     String result=" ";
     Label label = new Label();
     VBox vbox=new VBox();
     @Override
 	public void start(Stage primaryStage) throws Exception {

    	 //grid pane for buttons
    	 GridPane pane=new GridPane();
         pane.setStyle("-fx-backgrond-color:#EEE");
         pane.setAlignment(Pos.CENTER);
         pane.setPadding(new Insets(5, 5, 5, 5));
         pane.setHgap(5);
         pane.setVgap(5);
     	Label label = new Label();
     	label.setPrefSize(220, 120);

     	label.setPadding(new Insets(0, 5, 0, 5));
     	label.setStyle("-fx-border-color:#00F");
     	label .setFont(Font.font("Times New Roman",20));

     	  Button b0=new Button("0"); Button b1=new Button("1"); Button b2=new Button("2");
          Button b3=new Button("3");Button b4=new Button("4"); Button b5=new Button("5");
          Button b6=new Button("6");Button b7=new Button("7");Button b8=new Button("8");
          Button b9=new Button("9"); Button bDot=new Button("."); Button bPlus=new Button("+");
          Button bMinus=new Button("-");  Button bMult=new Button("*"); Button bDiv=new Button("/");
          Button bMod=new Button(" % "); Button bRp=new Button("("); Button bLb=new Button(")");
          Button bEqual = new Button(" = "); Button bMod2=new Button("%");

        //bind
          label.prefHeightProperty().bind(vbox.heightProperty().divide((220/18)/6));
          label.prefWidthProperty().bind(vbox.widthProperty());


          Button bPow=new Button("X^2");
          Button bClear=new Button("C");
          Button bClearall=new Button("AC");
          Button bSqrt=new Button("Sqrt");


          buttonStyle(b7);buttonStyle(b8); buttonStyle(b9); buttonStyleOpr(bDiv);buttonStyleOpr(bClear);
          buttonStyle(b4);buttonStyle(b5); buttonStyle(b6); buttonStyleOpr(bMult); buttonStyleOpr(bRp);buttonStyleOpr(bLb);
          buttonStyle(b1);buttonStyle(b2);buttonStyle(b3);buttonStyleOpr(bMinus);buttonStyleOpr(bPow);buttonStyleOpr(bClearall);
          buttonStyleOpr(bSqrt); buttonStyle(b0); buttonStyle(bDot);buttonStyleOpr(bMod2);buttonStyleOpr(bMod); buttonStyleOpr(bPlus);


          bEqual.setAlignment(Pos.CENTER);
          bEqual.setPrefWidth(106);
          bEqual.setPrefHeight(18);
          bEqual.prefHeightProperty().bind(vbox.heightProperty().divide((220/18)/2));
          bEqual.prefWidthProperty().bind(vbox.widthProperty().divide((220/106)));
          bEqual.setTextFill(Color.WHITE);

          
          pane.add(bRp, 0, 0);
          pane.add(bLb, 1, 0);
          pane.add(bClearall, 2, 0);
          pane.add(bClear, 3, 0);
          pane.add(bSqrt, 0, 1);
          pane.add(bPow, 1, 1);
          pane.add(bMod, 2, 1);
          pane.add(bDiv, 3, 1);
          pane.add(b7, 0, 2);
          pane.add(b8, 1, 2);
          pane.add(b9, 2, 2);
          pane.add(bMult, 3, 2);
          pane.add(b4, 0, 3);
          pane.add(b5, 1, 3);
          pane.add(b6, 2, 3);
          pane.add(bPlus, 3, 3);
          pane.add(b1, 0, 4);
          pane.add(b2, 1, 4);
          pane.add(b3, 2, 4);
          pane.add(bMinus, 3, 4);
          pane.add(b0, 0, 5);
          pane.add(bDot, 1, 5);
          pane.add(bEqual, 2, 5,2,1);  //colspan = 2
          
    

          bEqual.setStyle("-fx-background-color:#0D8511");
          bClear.setStyle("-fx-background-color:#B01A1A");
          
    
          
                                                        //setting actions of the buttons          
          b0.setOnAction(e->{
          	result+=b0.getText();
          	label.setText(result);
          });
          b1.setOnAction(e->{
          	result+=b1.getText();
          	label.setText(result);
          });
          b2.setOnAction(e->{
          	result+=b2.getText();
          	label.setText(result);
          });
          b3.setOnAction(e->{
          	result+=b3.getText();
          	label.setText(result);
          });
          b4.setOnAction(e->{
          	result+=b4.getText();
          	label.setText(result);
          });
          b5.setOnAction(e->{
          	result+=b5.getText();
          	label.setText(result);
          });
          b6.setOnAction(e->{
          	result+=b6.getText();
          	label.setText(result);
          });
          b7.setOnAction(e->{
          	result+=b7.getText();
          	label.setText(result);
          });
          b8.setOnAction(e->{
          	result+=b8.getText();
          	label.setText(result);
          });
          b9.setOnAction(e->{
          	result+=b9.getText();
          	label.setText(result);
          });
          bClearall.setOnAction(e->{
          	result="";
          	label.setText(result);
          });
          bClear.setOnAction(e->{
          	if(result.length()==0)
          		result="";
          	else
          	result=result.substring(0, result.length()-1);
          	label.setText(result);
          });
          bDiv.setOnAction(e->{
          	result+=bDiv.getText();
          	label.setText(result);
          });
          bDot.setOnAction(e->{
          	result+=bDot.getText();
          	label.setText(result);
          });
          bMinus.setOnAction(e->{
          	result+=bMinus.getText();
          	label.setText(result);
          });
          bMod.setOnAction(e->{
          	result+=bMod.getText();
          	label.setText(result);
          });
          bMod2.setOnAction(e->{
          	result+=bMod2.getText();
          	label.setText(result);
          });
          bMult.setOnAction(e->{
          	result+=bMult.getText();
          	label.setText(result);
          });
          bPlus.setOnAction(e->{
          	result+=bPlus.getText();
          	label.setText(result);
          });
          bPow.setOnAction(e->{
          	result+="^2";
          	label.setText(result);
          });
          bRp.setOnAction(e->{
          	result+=bRp.getText();
          	label.setText(result);
          });
          bLb.setOnAction(e->{
          	result+=bLb.getText();
          	label.setText(result);
          });
          bSqrt.setOnAction(e->{
          	result+="sqrt(";
          	label.setText(result);
          });

          vbox.getChildren().add(label);  // add label to the vbox
          vbox.getChildren().add(pane);   // add grid pane to the vbox
          vbox.setStyle("-fx-background:#1c1c1c");

         Scene scene = new Scene(vbox, 220, 220);
         primaryStage.setTitle("Taschenrechner");
         primaryStage.setScene(scene);
        // primaryStage.setResizable(false);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");

         primaryStage.show();
 	}

     public void buttonStyle(Button b){
         b.setStyle("-fx-padding:5px; ");
         b.setFont(Font.font(12));
         b.setTextFill(Color.WHITE);
         
         b.setStyle("-fx-background-color: #464646 ");

         
         b.setPrefSize(50, 18);
         b.prefHeightProperty().bind(vbox.heightProperty().divide((220/18)/2));
         b.prefWidthProperty().bind(vbox.widthProperty().divide((220/50)));

         }

         public void buttonStyleOpr(Button b){
             b.setStyle("-fx-padding:5px; ");
             b.setFont(Font.font(12));
             b.setTextFill(Color.WHITE);
             
             b.setStyle("-fx-background-color: #2e2e2e ");

             
             b.setPrefSize(50, 18);
             b.prefHeightProperty().bind(vbox.heightProperty().divide((220/18)/2));
             b.prefWidthProperty().bind(vbox.widthProperty().divide((220/50)));

             }
     	private void ch() {
    		if (result.length() > 3 && (result.charAt(result.length() - 2) == '+'
    				|| result.charAt(result.length() - 2) == '*' || result.charAt(result.length() - 2) == '/'
    				|| result.charAt(result.length() - 2) == '-' || result.charAt(result.length() - 2) == '%'))
    			result = result.substring(0, result.length() - 3);
    	}

    	private void calculate(String exp) {
    		double cal = 0;
    		@SuppressWarnings("rawtypes")
    		Stack<Comparable> st = new Stack<Comparable>();
    		st.push('(');
    		try {
    			for (int i = 0; i < exp.length(); i++) {
    				if (exp.charAt(i) == ')') {
    					String s = ")";
    					while (!st.peek().equals('('))
    						s = st.pop() + s;
    					
    					    s = st.pop() + s;
    					if (st.peek().equals('t')) // sqrt()
    					{
    						while (!st.peek().equals('s'))
    							st.pop();
    						st.pop();
    						st.push(Math.sqrt(evaluateExp(s)));
    					}

    					else if (exp.charAt(i + 1) == '^') // ()^2
    					{
    						st.push(Math.pow(evaluateExp(s), 2));
    						i += 2;
    					} else if (exp.charAt(i + 1) == '^') // ()^2
    					{
    						st.push(Math.pow(evaluateExp(s), 2));
    						i += 2;
    					} else
    						st.push(evaluateExp(s)); // ( + * - / )
    				} else
    					st.push(exp.charAt(i));
    			}
    			String s = " ) ";
    			while (!st.isEmpty())
    				s = st.pop() + s;
    			cal = evaluateExp(s);
    		} catch (Exception e) {
    			label.setText("Error");
    			return;
    		}
    		if (new Double(cal).isInfinite()) {
    			label.setText(" Infinity");
    		} else {
    			label.setText("" + cal);
    			System.out.println(cal);
    		}
    	}
     private double evaluateExp(String s) {
			// TODO Auto-generated method stub
			return 0;
		}

	public static void main(String[] args) {
         launch(args);
     }
 }
