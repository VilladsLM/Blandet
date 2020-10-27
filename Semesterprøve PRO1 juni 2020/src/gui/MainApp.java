package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Booking;
import model.Bur;
import model.KattePension;
import storage.Storage;

public class MainApp extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("KattePension");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------
	private ListView<KattePension> lvwKattePensioner;
	private ListView<Bur> lvwBure;
	private ListView<Booking> lvwBookinger;
	private TextField txfBurId;
	private TextField txfMaxAntal;
	private Button btnOpret;
	
	private void initContent(GridPane pane) {
		// show or hide grid lines
		pane.setGridLinesVisible(false);

		// set padding of the pane
		pane.setPadding(new Insets(20));
		// set horizontal gap between components
		pane.setHgap(10);
		// set vertical gap between components
		pane.setVgap(10);
		
//		Controller.initStorage();
		
		Label lblKattePensione = new Label("KattePensioner");
		pane.add(lblKattePensione, 0, 0);
		
		lvwKattePensioner = new ListView<>();
		lvwKattePensioner.setPrefHeight(200);
		lvwKattePensioner.getItems().setAll(Controller.getKattePensioner());
		pane.add(lvwKattePensioner, 0, 1);
		
		ChangeListener<KattePension> listener = (ok, oldKonference, newKonference) -> this.selectedKattePensionChanged();
		lvwKattePensioner.getSelectionModel().selectedItemProperty().addListener(listener);
		
		Label lblBure = new Label("Bure");
		pane.add(lblBure, 1, 0);
		
		lvwBure = new ListView<>();
		lvwBure.setPrefHeight(200);
		pane.add(lvwBure, 1, 1);
		
		Label lblBookinger = new Label("Bookinger");
		pane.add(lblBookinger, 2, 0);
		
		lvwBookinger = new ListView<>();
		lvwBookinger.setPrefHeight(200);
		pane.add(lvwBookinger, 2, 1);
		
		
		Label lblBurId = new Label("Bur id:");
		pane.add(lblBurId, 0, 2);
		
		txfBurId = new TextField();
		pane.add(txfBurId, 1, 2);
		
		Label lblMaxAntal = new Label("MaxAntal:");
		pane.add(lblMaxAntal, 2, 2);
		
		txfMaxAntal = new TextField();
		pane.add(txfMaxAntal, 3, 2);
		
		btnOpret = new Button("Opret bur");
		pane.add(btnOpret, 4, 2);
		btnOpret.setOnAction(event -> btnOpret());
		
		
	}

	// -----------------------------------------------------
//	 Button actions
	
	private void selectedKattePensionChanged() {
		KattePension kp = lvwKattePensioner.getSelectionModel().getSelectedItem();
		
		if(kp != null) {
			lvwKattePensioner.getItems().setAll(kp);
		}
	}
	
	private void btnOpret() {
		KattePension ph = lvwKattePensioner.getSelectionModel().getSelectedItem();
		if (ph == null) {
			return;
		}
		lvwKattePensioner.getItems().setAll(ph.getBure());
		int index = lvwKattePensioner.getItems().size() - 1;
		lvwKattePensioner.getSelectionModel().select(index);
		
		selectedKattePensionChanged();

	}
}
