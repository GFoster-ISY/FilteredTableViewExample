package application;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class FTVExampleController {
	@FXML TableView<Student> tblStudentList;
	@FXML TableColumn<Student, String> tcolFName;
	@FXML TableColumn<Student, String> tcolSName;
	@FXML TableColumn<Student, Boolean> tcolAAHL;
	@FXML TableColumn<Student, Boolean> tcolCSHL;
	
	private ObservableList<Student> allStudents;
	
	@FXML void initialize() {
		allStudents = FXCollections.observableArrayList();
		filterStudents("All");
		initStudentDetails();
		tcolFName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		tcolSName.setCellValueFactory(new PropertyValueFactory<>("familyName"));
		tcolAAHL.setCellValueFactory(new PropertyValueFactory<>("AAHL"));
		tcolCSHL.setCellValueFactory(new PropertyValueFactory<>("CSHL"));
	}
	
	@FXML private void onClickAll() {
		filterStudents("All");
	}
	@FXML private void onClickMaths() {
		filterStudents("A&A");
	}
	@FXML private void onClickCompSci() {
		filterStudents("CS");
	}

	private void filterStudents(String subject) {
		FilteredList<Student> filteredData = new FilteredList<>(allStudents, t -> t.isEnrolled(subject));
		tblStudentList.setItems(filteredData);
	}
	
	private void initStudentDetails() {
		allStudents.clear();
		allStudents.add(new Student("Lin Htet", "Aung", true, true));
		allStudents.add(new Student("Jun", "Baek", true, true));
		allStudents.add(new Student("Zheng Yu", "Cao", true, true));
		allStudents.add(new Student("Piyawan", "Chaiprasit", true, true));
		allStudents.add(new Student("Cola", "Htet", true, false));
		allStudents.add(new Student("Min", "Hwang", true, false));
		allStudents.add(new Student("Kangmin", "Kim", true, false));
		allStudents.add(new Student("Isaac", "Koo", true, false));
		allStudents.add(new Student("Ethan", "Min Khant", true, true));
		allStudents.add(new Student("Ben", "Naing", true, true));
		allStudents.add(new Student("Alvin", "Oo", true, true));
		allStudents.add(new Student("Aarush", "Saharan", true, false));
		allStudents.add(new Student("Isabel", "Tan", true, true));
		allStudents.add(new Student("Tim", "Thant Sin", true, true));
		allStudents.add(new Student("Tony", "Thant Sin", true, true));
		allStudents.add(new Student("Cyrus", "Thant", true, true));
	}
}
