import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import static javafx.application.Application.launch;

public class Lab_9 {
    public void start(Stage stage) {
        NumericInput dividendTextField = new NumericInput("Dividend");
        NumericInput divisorTextField = new NumericInput("Divisor");

        Button button = new Button("Do division");

        VBox appContainer = new VBox(20, dividendTextField.initInput(), divisorTextField.initInput(), button);
        appContainer.setPadding(new Insets(20));

        button.setOnMouseClicked(event -> {
            try {
                if(appContainer.getChildren().size() == 4){

                    appContainer.getChildren().remove(3);
                }

                if(dividendTextField.hasError || divisorTextField.hasError){
                    appContainer.getChildren().add(new Label("Fix errors before submitting"));
                    return;
                }

                if(Double.parseDouble(divisorTextField.value) == 0){
                    appContainer.getChildren().add(new Label("Division by 0 is not allowed"));

                    return;
                }


                String result = String.valueOf(Double.parseDouble(dividendTextField.value) / Double.parseDouble(divisorTextField.value));
                appContainer.getChildren().add(new Text(result));
            }
            catch (NullPointerException exception){
                appContainer.getChildren().add(new Label("One or both fields are empty!"));
            }
        });

        Scene scene = new Scene(new StackPane(appContainer), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

class NumericInput{
    Label inputLabel;
    TextField textField;
    VBox inputContainer;
    Boolean hasError;
    String value;

    public NumericInput(String inputLabel) {
        this.inputLabel  = new Label(inputLabel);
        textField = new TextField();
        addValidationListener();
    }

    VBox initInput(){
        inputContainer = new VBox(10, inputLabel, textField);

        return inputContainer;
    }

    void addValidationListener(){
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            Label inputError;
            value = newValue;

            try{
                if(inputLabel.getText().equals("Divisor") && Double.parseDouble(newValue) == 13){
                    throw new UnluckyException();
                }

                Double.parseDouble(newValue);

                if(newValue.contains(" ")|| newValue.contains("d") || newValue.contains("f")){
                    throw new NumberFormatException();
                }

                hasError = false;

                if(inputContainer.getChildren().size()==3){
                    inputContainer.getChildren().remove(2);
                }
            }catch (NumberFormatException exception){
                if(inputContainer.getChildren().size()==3){
                    return;
                }

                hasError = true;

                inputError= new Label("Input accepts only numbers!");

                inputContainer.getChildren().add(inputError);
            }catch (UnluckyException exception){
                if(inputContainer.getChildren().size()==3){
                    return;
                }

                hasError = true;

                inputError= new Label("Unlucky Exception!");

                inputContainer.getChildren().add(inputError);
            }
        });
    }
}

class UnluckyException extends Exception{
}