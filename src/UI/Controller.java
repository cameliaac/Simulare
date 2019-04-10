package UI;

import Domain.Activity;
import Main;
import Service.ActivityService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {


    public TableView tableViewActivitys;
    public TableColumn tableColumnId;
    public TableColumn tableColumnTime;
    public TableColumn tableColumnDescription;
    public TableColumn tableColumnDay;
    public TableColumn tableColumnHour;


    public ActivityService service;


    private ObservableList<Activity> activitys = FXCollections.observableArrayList();


    public void setServices(ActivityService service) {
        this.service = service;
    }

    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            activitys.addAll(service.getAll());
            tableViewActivitys.setItems(activitys);
        });
    }


    public void btnActivityAddClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("activityAdd.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 600, 200);
            Stage stage = new Stage();
            stage.setTitle("Add activity");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            Main.Main.ActivityAddController controller = fxmlLoader.getController();
            controller.setService(service);
            stage.showAndWait();
            activitys.clear();
            activitys.addAll(service.getAll());
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window: Movie uphour.", e);
        }

    }

    public void btnActivitysMaxClick(ActionEvent actionEvent) {
        String a = txtActivityDayMax.getText();

        //get.Day & get.Time - calculeaza Max


}