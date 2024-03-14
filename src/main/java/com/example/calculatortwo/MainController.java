package com.example.calculatortwo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDeleteAll;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnLeftParenthesis;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiple;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnRightParenthesis;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private Label outText;
    @FXML
    ArrayList<Float> calc = new ArrayList<Float>();
    ArrayList<Character> symbl = new ArrayList<Character>();

    @FXML
    void initialize() {
        PressOnBtn();


    }

    public void PressOnBtn() {
        AtomicInteger counter = new AtomicInteger();
        counter.set(0);


        outText.setText("0");


        btnZero.setOnAction(event -> {

            int number = 0;
            if (outText.getText().equals("0")) {
                outText.setText("0");
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }

        });

        btnOne.setOnAction(event -> {
            int number = 1;
            if (outText.getText().equals("0")) {
                outText.setText("1");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }
            System.out.println(outText.getText());

        });

        btnTwo.setOnAction(event -> {
            int number = 2;
            if (outText.getText().equals("0")) {
                outText.setText("2");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);

            }

        });

        btnThree.setOnAction(event -> {
            int number = 3;
            if (outText.getText().equals("0")) {
                outText.setText("3");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);

            }

        });

        btnFour.setOnAction(event -> {
            int number = 4;
            if (outText.getText().equals("0")) {
                outText.setText("4");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);

            }

        });

        btnFive.setOnAction(event -> {
            int number = 5;
            if (outText.getText().equals("0")) {
                outText.setText("5");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);

            }

        });

        btnSix.setOnAction(event -> {
            int number = 6;
            if (outText.getText().equals("0")) {
                outText.setText("6");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }

        });

        btnSeven.setOnAction(event -> {
            int number = 7;
            if (outText.getText().equals("0")) {
                outText.setText("7");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }

        });

        btnEight.setOnAction(event -> {
            int number = 8;
            if (outText.getText().equals("0")) {
                outText.setText("8");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }

        });

        btnNine.setOnAction(event -> {
            int number = 9;
            if (outText.getText().equals("0")) {
                outText.setText("9");
                counter.set(counter.get() + 1);
            } else if (!outText.getText().equals("0")) {
                outText.setText(outText.getText() + number);
                counter.set(counter.get() + 1);
            }


        });

        btnPlus.setOnAction(event -> {
            if (outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                addNumber(counter.get());
                counter.set(0);
                String symbol = "+";
                addSymbl('+');
                outText.setText(outText.getText() + symbol);
            } else {
                outText.setText(outText.getText());
            }
        });

        btnMinus.setOnAction(event -> {
            if (outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                addNumber(counter.get());
                counter.set(0);
                String symbol = "-";
                addSymbl('-');
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else {
                outText.setText(outText.getText());
            }
        });

        btnMultiple.setOnAction(event -> {
            if (outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                addNumber(counter.get());
                counter.set(0);
                String symbol = "x";
                addSymbl('*');
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else {
                outText.setText(outText.getText());
            }
        });

        btnDivide.setOnAction(event -> {
            if (outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                addNumber(counter.get());
                counter.set(0);
                String symbol = "÷";
                addSymbl('/');
                outText.setText(outText.getText() + symbol);
            } else {
                outText.setText(outText.getText());
            }
        });

        btnLeftParenthesis.setOnAction(event -> {
            if (outText.getText().charAt(outText.getText().length() - 1) == '-' && outText.getText().length() != '(') {
                String symbol = "(";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) == '+' && outText.getText().length() != '(') {
                String symbol = "(";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) == '÷' && outText.getText().length() - 1 != '(') {
                String symbol = "(";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) == 'x' && outText.getText().length() - 1 != '(') {
                String symbol = "(";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else {
                outText.setText(outText.getText());
            }
        });

        btnRightParenthesis.setOnAction(event -> {

            System.out.println(outText.getText().length());

            if (outText.getText().charAt(outText.getText().length() - 1) != '+' && outText.getText().length() != ')') {
                String symbol = ")";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) != '-' && outText.getText().length() != ')') {
                String symbol = ")";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) != 'x' && outText.getText().length() != ')') {
                String symbol = ")";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else if (outText.getText().charAt(outText.getText().length() - 1) != '÷' && outText.getText().length() != ')') {
                String symbol = ")";
                outText.setText(outText.getText() + symbol);
                System.out.printf(outText.getText());
            } else {
                outText.setText(outText.getText());
            }
        });

        btnDot.setOnAction(event -> {
            if (outText.getText().length() - 1 != '.' && outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                String symbol = ".";
                outText.setText(outText.getText() + symbol);
                counter.set(counter.get() + 1);
            } else
                outText.setText(outText.getText());
        });

        btnDeleteAll.setOnAction(event -> {
            outText.setText("0");
            counter.set(0);
            calc.clear();
            symbl.clear();
        });

        btnEquals.setOnAction(event -> {
            if (outText.getText().length() - 1 != '.' && outText.getText().length() - 1 != '-' && outText.getText().length() - 1 != '+' && outText.getText().length() - 1 != 'x' && outText.getText().length() - 1 != '/') {
                addNumber(counter.get());
                counter.set(0);
            }
            System.out.println(calc);
            System.out.println(symbl);
            doCalc();

        });


    }

    public void addNumber(int counter) {
        char tempChar;
        String tempString = "";
        float tempInt = 0;
        int counterCalc = 0;
        for(int i = 1; i <= counter; i++) {
            tempChar = outText.getText().charAt(outText.getText().length() - i);
            tempString = tempChar + tempString;
        }
        tempInt = Float.valueOf(tempString);
        System.out.println(tempInt);
        calc.add(tempInt);
        System.out.println(calc);


    }

    public void addSymbl(char symb) {
        symbl.add(symb);

    }

    public void doCalc() {

        float res = 0;
        float tempres = 0;

        for(int i = 0; i < symbl.size(); i++) {

            switch (symbl.get(i)) {

                case '+':
                    tempres = calc.get(i) + calc.get(i + 1);
                    break;
                case '-':
                    tempres = calc.get(i) - calc.get(i + 1);
                    break;
                case '*':
                    tempres = calc.get(i) * calc.get(i + 1);
                    break;
                case '/':
                    tempres = calc.get(i) / calc.get(i + 1);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            res = res + tempres;

            outText.setText("" + res);


        }
        System.out.println(res);

    }
}


