package com.github.danlangford.dicefx;

import com.bernardomg.tabletop.dice.parser.DefaultDiceNotationExpressionParser;
import com.bernardomg.tabletop.dice.parser.DiceNotationExpressionParser;
import com.bernardomg.tabletop.dice.roller.DefaultRoller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.text.MessageFormat.format;

public class SceneController {

    private final DiceNotationExpressionParser diceNotation = new DefaultDiceNotationExpressionParser(new DefaultRoller());

    @FXML
    private TextField expressionField;

    @FXML
    private TextField resultsField;

    @FXML
    private Label versionLabel;

    @FXML
    public void parseExpression(){
        String expression = expressionField.getText();
        try {
            Integer rollResults = diceNotation.parse(expression).roll();
            resultsField.setText(rollResults.toString());
        } catch (Exception e) {
            resultsField.setText(e.getMessage());
        }
    }

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        versionLabel.setText(format("JavaFX {0} Running on Java {1}.", javafxVersion, javaVersion));
    }

}
