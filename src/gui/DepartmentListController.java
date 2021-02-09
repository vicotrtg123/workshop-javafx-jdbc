package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable{

	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableCollumId;
	
	@FXML
	private TableColumn<Department, Integer> tableCollumName;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("Ação");
	}
	
	
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializaNodes();
		
	}

	private void initializaNodes() {
		tableCollumId.setCellValueFactory(new PropertyValueFactory<>("ID"));
		tableCollumName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		
		Stage stage =  (Stage) Main.getManScene().getWindow();
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
		
	}

}
