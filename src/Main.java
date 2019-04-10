

public class Main {

    import Domain.Activity;
	import Domain.ActivityValidator
	import Repository.IRepository;
	import Service.ActivityService;
	import UI.Controller;
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
    import javafx.scene.Scene;
	import javafx.stage.Stage;

    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UI/sample.fxml"));
            Parent root = fxmlLoader.load();
            Controller controller = fxmlLoader.getController();*/

            ActivityValidator validator = new ActivityValidator();
            IRepository repository = new IRepository(validator);
            ActivityService service = new ActivityService(repository);

            service.insert("1",60,"Gym", "21.04.2019", "06.00");
            service.insert("2",480,"Work","21.04.2019","08.00");
            service.insert("3",480,"Work","22.04.2019","08.00");
            service.insert("4",120,"Drink with friends","22.04.2019","19.00");
            service.insert("5",20,"Shop","22.04.2019","21.30");
            service.insert("6",60,"Gym","23.04.2019","06.00");

            controller.setServices(service);


            primaryStage.setTitle("Activity manager");
            primaryStage.setScene(new Scene(root, 650, 500));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }















