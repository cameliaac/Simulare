package UI;

import Service.ActivityService;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ActivityAddController {
    public Spinner spnId;
    public TextField txtActivityTime;
    public TextField txtActivityDescription;
    public TextField txtActivityDay;
    public TextField txtActivityHour;
    public Button btnAddActivity;
    public Button btnCancel;
    private ActivityService service;

    public void setService(ActivityService service) {
        this.service = service;
    }

    public void btnAddClick(ActionEvent actionEvent) {
        try {
            String id = String.valueOf(spnId.getValue());
            int time = Integer.parseInt(txtActivityTime.getText());
            String description = txtActivityDescription.getText();
            String day = txtActivityDay.getText();
            String hour = txtActivityHour.getText();
            service.insert(id, time, description, day, hour);
            btnCancelClick(actionEvent);
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }

    }


    public void btnCancelClick(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
}

        activityAdd.fxml

<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.VBox?>

<?import javafx.scene.control.TextField?>
<?import javafx.scene.control.CheckBox?>
<?import javafx.scene.control.Spinner?>

<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.control.Label?>
<VBox alignment="center" xmlns="http://javafx.com/javafx/8.0.172-ea" xmlns:fx="http://javafx.com/fxml/1"
        fx:controller="UI.ActivityAddController">
<HBox alignment="TOP_CENTER">
<Label text="Activity ID"/>
<Spinner fx:id="spnId" editable="true" initialValue="0" max="2000000000" min="0"/>
</HBox>
<Pane prefHeight="5.0" prefWidth="330.0"/>
<HBox alignment="TOP_CENTER">
<TextField fx:id="txtActivityTime" prefHeight="25.0" prefWidth="110.0" promptText="Time"/>
<TextField fx:id="txtActivityDescription" prefHeight="25.0" prefWidth="110.0" promptText="Description"/>
<TextField fx:id="txtActivityHour" prefHeight="25.0" prefWidth="110.0" promptText="Day"/>
<TextField fx:id="txtActivityHour" prefHeight="25.0" prefWidth="110.0" promptText="Hour"/>
</HBox>

<HBox alignment="TOP_CENTER">
<Button text="Add" fx:id="btnAddActivity" onAction="#btnAddClick"/>
<Button text="Cancel" fx:id="btnCancel" onAction="#btnCancelClick"/>
</HBox>
</VBox>

        sample.fxml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.control.cell.PropertyValueFactory?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.layout.VBox?>

<HBox alignment="center" xmlns="http://javafx.com/javafx/8.0.172-ea" xmlns:fx="http://javafx.com/fxml/1" fx:controller="UI.Controller">

<VBox>
<Label text="Activitys:" />
<TableView fx:id="tableViewActivitys">
<columns>
<TableColumn fx:id="tableColumnId" text="id">
<cellValueFactory>
<PropertyValueFactory property="id" />
</cellValueFactory>
</TableColumn>
<TableColumn fx:id="tableColumnTime" text="Time">
<cellValueFactory>
<PropertyValueFactory property="time" />
</cellValueFactory>

</TableColumn>
<TableColumn fx:id="tableColumnDescription" text="Description">
<cellValueFactory>
<PropertyValueFactory property="description" />
</cellValueFactory>

</TableColumn>
<TableColumn fx:id="tableColumnDay" text="Day">
<cellValueFactory>
<PropertyValueFactory property="day" />
</cellValueFactory>

</TableColumn>
<TableColumn fx:id="tableColumnHour" text="Hour">
<cellValueFactory>
<PropertyValueFactory property="hour" />
</cellValueFactory>
</TableColumn>
</columns>
</TableView>
<Button fx:id="btnActivityAdd" onAction="#btnActivityAddClick" text="Add Activity" />
<HBox alignment="BOTTOM_RIGHT">
<TextField fx:id="txtActivityHourForSum" prefHeight="25.0" prefWidth="110.0" promptText="Hour" />
<Button fx:id="btnSumOfActivitys" onAction="#btnActivitysSumClick" text="Sum of activitys" />
<Pane prefHeight="0.0" prefWidth="11.0" />
<Label fx:id="sum" prefHeight="26.0" prefWidth="100.0" />
</HBox>
</VBox>

</HBox>
        */



        }
