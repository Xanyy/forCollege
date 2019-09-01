
package View;


import java.sql.Connection;
import java.sql.DriverManager;

import Controller.connectDB;
import Controller.DeleteHandler;
import Controller.DisplayHandler;
import Controller.InsertHandler;
import Model.Player;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class PlayerView  extends Tab {
	
	
	public Tab view;
	
	
	private Player P1;
	
	connectDB Connection = new connectDB();
	
	Connection conn = Connection.getConnection();

	private TextField tfFName = new TextField();
	
	private TextField tfMName = new TextField();
	
	private TextField tfLName = new TextField();
	
	private TextField tfEmail = new TextField();
	
	private TextField tfPhoneNumber = new TextField();
	
	private TextField tfGoals = new TextField();

	private Button btnAdd = new Button("Add Player");
	
	private Button btnRemove = new Button("Remove Player");
	
	private Button btnList = new Button("List Player");
	
	private Button btnQuit = new Button("Quit System");
	
	
	public PlayerView ( Player P1) {
		
		this.P1 = P1;
		makeTab();
		
	}

	
	
	public Tab asParent() {

		return view;
	}

	
	
	private void makeTab () {

		view = new Tab();

		//HBoxes for layout.
		HBox hbTitle = new HBox(); 
		HBox hbDetailOne = new HBox();
		HBox hbDetailTwo = new HBox();
		HBox hbDetailThree = new HBox();
		HBox hbDetailFour = new HBox ();
		HBox hbDetailFive = new HBox ();
		HBox hbDetailSix = new HBox ();
		HBox hbBtns = new HBox();

		//Labels for Labeling.
		Label lbSpace = new Label ("");
		Label lbSpace2 = new Label ("");
		Label lbTitle = new Label("Welcome to the Student Database.");

		Label lbFName = new Label("First Name:  \t\t\t");
		Label lbMName = new Label("Middle Name: \t\t\t");
		Label lbLName = new Label("Last Name:   \t\t\t");
		Label lbEMail = new Label("Email: \t\t\t\t");
		Label lbTNum = new Label("Phone Number: \t\t");
		Label lbGoals = new Label ("Goals: \t\t\t");


		//Adding to HBox's.
		hbTitle.getChildren().addAll(lbTitle);
		hbDetailOne.getChildren().addAll(lbFName, tfFName);
		hbDetailTwo.getChildren().addAll(lbMName, tfMName  );
		hbDetailThree.getChildren().addAll(lbLName, tfLName);
		hbDetailFour.getChildren().addAll(lbEMail, tfEmail);
		hbDetailFive.getChildren().addAll(lbTNum, tfPhoneNumber);
		hbDetailSix.getChildren().addAll(lbGoals, tfGoals);

		hbBtns.getChildren().addAll(btnAdd, btnRemove, btnList, btnQuit);
		hbBtns.setPrefWidth(100);
		hbBtns.setSpacing(10);



		//Making the VBox and adding it all to it.
		VBox vbPlayerMain = new VBox ();
		vbPlayerMain.getChildren().addAll(hbTitle, lbSpace, hbDetailOne,hbDetailTwo,hbDetailThree, 
				hbDetailFour,hbDetailFive,hbDetailSix, lbSpace2, hbBtns);
		
		setText("Player Database");
		setContent(vbPlayerMain);
		
		
		btnQuit.setOnAction(e->{
			Platform.exit();                                              
		});
		
		btnAdd.setOnAction(e->{
			InsertHandler.savePlayer(conn, getFName(), getMName(), getLName(), getEMail(), getNumber(), getGoals());
			clearTextFields();
		});
		
		btnList.setOnAction(e->{
			settaText(DisplayHandler.showPlayers(conn));		
			});
		
		btnRemove.setOnAction(e->{
			DeleteHandler.removePlayer(conn,getFName(),getEMail());
			clearTextFields();
			});
	}
	
	
	public String getFName() {
		
		return tfFName.getText();
	}
	
	
	public String getMName() {
	
		return tfMName.getText();
	}
	
	
	public String getLName() {
		
		return tfLName.getText();
	}
	
	
	public String getEMail() {
	
		return tfEmail.getText();
	}
	
	
	public String getNumber() {
		
		return tfPhoneNumber.getText();
	}

	
	public String getGoals() {
		return tfGoals.getText();
	}
	
	public void settaText(String st) {
		taPlayerDetails.setText(st);
	}
	
	
	public void clearTextFields() {
		
		//Clearing the TextFields.
		tfFName.setText("");
		tfMName.setText("");
		tfLName.setText("");
		tfEmail.setText("");
		tfPhoneNumber.setText("");
		tfGoals.setText("");
		
		//Letting the TextFields be changed for next Input.
		tfFName.setEditable(true);
		tfMName.setEditable(true);
		tfLName.setEditable(true);
		tfEmail.setEditable(true);
		tfPhoneNumber.setEditable(true);
		tfGoals.setEditable(true);
	
	}
}