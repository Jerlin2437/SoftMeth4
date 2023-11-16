package com.example.softmeth4;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SpecialtyPizzaController {
    @FXML
    private RadioButton alfredo;
    @FXML
    private RadioButton tomato;

    @FXML
    private CheckBox extraCheese;
    @FXML
    private CheckBox extraSauce;

    @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;

    @FXML
    private ComboBox<?> chooseSpecialty;
    @FXML
    private ListView<?> toppings;
    @FXML
    private TextField price;
    @FXML
    private Button addToOrder;

    @FXML
    private ToggleGroup specialtySauceButtonGroup;

}
