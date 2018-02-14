package Start;

import Interfaces.Impl.CollectionSubjects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/sample.fxml"));
        primaryStage.setTitle("Справочник предметов");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        testData();

    }


    private void testData() {
        CollectionSubjects subject = new CollectionSubjects();
        //subject.findAll();
        //subject.print();
        subject.loadDataFromDatabase();
        subject.print2();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
