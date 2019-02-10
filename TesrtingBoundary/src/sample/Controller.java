package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {

    Calculate calculate;

    float minX, minY, maxX, maxY;

    //private  Text[] arrayText  = new Text[49];
    ArrayList<Text> arrayText = new ArrayList<Text>();

    private int type = 1;
    @FXML
    ChoiceBox typeChoiceBox;
    @FXML
    TextField xMax, xMin, yMax, yMin;

    @FXML
    Text t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24,
            t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40, t41, t42, t43, t44, t45, t46, t47, t48, t49;


    public void initialize() {
        setTypesChoiceBox();
        setTextStart();
    }

    public void parseTextTofloat() {
        minX = Float.valueOf(xMin.getText());
        minY = Float.valueOf(yMin.getText());
        maxX = Float.valueOf(xMax.getText());
        maxY = Float.valueOf(yMax.getText());
    }

    private void setTypesChoiceBox() {
        ObservableList<String> types = FXCollections.observableArrayList();
        types.add("Boundary Value testing of n inputs : 4n+1");
        types.add("Robustness testing of n inputs : 6n+1");
        types.add("Worst case for boundary value : 5^n");
        types.add("Worst case for robustness : 7^n");
        typeChoiceBox.setStyle("-fx-font-size:16");
        typeChoiceBox.setItems(types);
        typeChoiceBox.getSelectionModel().selectFirst();
        typeChoiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue typeObservable, Object typeOldValue, Object typeNewValue) {
                if (typeObservable.getValue().toString().equals("Boundary Value testing of n inputs: 4n+1")) {
                    type = 1;
                } else if (typeObservable.getValue().toString().equals("Robustness testing of n inputs : 6n+1")) {
                    type = 2;
                } else if (typeObservable.getValue().toString().equals("Worst case for boundary value : 5^n")) {
                    type = 3;
                } else if (typeObservable.getValue().toString().equals("Worst case for robustness : 7^n")) {
                    type = 4;

                }
                setTextStart();
            }
        });
    }


    @FXML
    public void calButton(ActionEvent e) {
        parseTextTofloat();
        calculate = new Calculate(minX, minY, maxX, maxY);
        cal();
//        calculate.getAnsX();
//        calculate.getAnsY();
//       System.out.println(calculate.pos(10,10));

    }


    @FXML
    public void clearButton(ActionEvent e) {
        setTextStart();
        xMax.setText("");
        xMin.setText("");
        yMax.setText("");
        yMin.setText("");
        typeChoiceBox.getSelectionModel().selectFirst();

    }

    public void setTextStart() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
        t15.setText("");
        t16.setText("");
        t17.setText("");
        t18.setText("");
        t19.setText("");
        t20.setText("");
        t21.setText("");
        t22.setText("");
        t23.setText("");
        t24.setText("");
        t25.setText("");
        t26.setText("");
        t27.setText("");
        t28.setText("");
        t29.setText("");
        t30.setText("");
        t31.setText("");
        t32.setText("");
        t33.setText("");
        t34.setText("");
        t35.setText("");
        t36.setText("");
        t37.setText("");
        t38.setText("");
        t39.setText("");
        t40.setText("");
        t41.setText("");
        t42.setText("");
        t43.setText("");
        t44.setText("");
        t45.setText("");
        t46.setText("");
        t47.setText("");
        t48.setText("");
        t49.setText("");


    }


    private void cal() {

        if (type == 1) {
            t11.setText(calculate.pos(10));
            t18.setText(calculate.pos(11));
            t23.setText(calculate.pos(22));
            t24.setText(calculate.pos(23));
            t25.setText(calculate.pos(24));
            t26.setText(calculate.pos(25));
            t27.setText(calculate.pos(26));
            t32.setText(calculate.pos(37));
            t39.setText(calculate.pos(38));


        }
        else if (type == 2) {
            t4.setText(calculate.pos(9));
            t11.setText(calculate.pos(10));
            t18.setText(calculate.pos(11));

            t22.setText(calculate.pos(21));
            t23.setText(calculate.pos(22));
            t24.setText(calculate.pos(23));

            t25.setText(calculate.pos(24));

            t26.setText(calculate.pos(25));
            t27.setText(calculate.pos(26));
            t28.setText(calculate.pos(27));

            t32.setText(calculate.pos(37));
            t39.setText(calculate.pos(38));
            t46.setText(calculate.pos(39));


        }



        else if(type == 3){
            t11.setText(calculate.pos(10));
            t18.setText(calculate.pos(11));
            t23.setText(calculate.pos(22));
            t24.setText(calculate.pos(23));
            t25.setText(calculate.pos(24));
            t26.setText(calculate.pos(25));
            t27.setText(calculate.pos(26));
            t32.setText(calculate.pos(37));
            t39.setText(calculate.pos(38));


            t9.setText(calculate.pos(4));
            t10.setText(calculate.pos(5));
            t16.setText(calculate.pos(7));
            t17.setText(calculate.pos(8));


            t12.setText(calculate.pos(15));
            t13.setText(calculate.pos(16));
            t19.setText(calculate.pos(18));
            t20.setText(calculate.pos(19));

            t30.setText(calculate.pos(29));
            t31.setText(calculate.pos(30));
            t37.setText(calculate.pos(32));
            t38.setText(calculate.pos(33));

            t33.setText(calculate.pos(40));
            t34.setText(calculate.pos(41));
            t40.setText(calculate.pos(43));
            t41.setText(calculate.pos(44));


        }

        else if(type == 4){


            t1.setText(calculate.pos(0));
            t2.setText(calculate.pos(1));
            t3.setText(calculate.pos(2));
            t8.setText(calculate.pos(3));
            t15.setText(calculate.pos(6));

            t5.setText(calculate.pos(12));
            t6.setText(calculate.pos(13));
            t7.setText(calculate.pos(14));
            t14.setText(calculate.pos(18));
            t21.setText(calculate.pos(20));

            t4.setText(calculate.pos(9));
            t11.setText(calculate.pos(10));
            t18.setText(calculate.pos(11));

            t22.setText(calculate.pos(21));
            t23.setText(calculate.pos(22));
            t24.setText(calculate.pos(23));
            t25.setText(calculate.pos(24));
            t26.setText(calculate.pos(25));
            t27.setText(calculate.pos(26));
            t28.setText(calculate.pos(27));
            t32.setText(calculate.pos(37));
            t39.setText(calculate.pos(38));


            t9.setText(calculate.pos(4));
            t10.setText(calculate.pos(5));
            t16.setText(calculate.pos(7));
            t17.setText(calculate.pos(8));


            t12.setText(calculate.pos(15));
            t13.setText(calculate.pos(16));
            t19.setText(calculate.pos(18));
            t20.setText(calculate.pos(19));


            t29.setText(calculate.pos(28));
            t36.setText(calculate.pos(31));
            t43.setText(calculate.pos(34));
            t44.setText(calculate.pos(32));
            t45.setText(calculate.pos(35));

            t30.setText(calculate.pos(29));
            t31.setText(calculate.pos(30));
            t37.setText(calculate.pos(32));
            t38.setText(calculate.pos(33));
            t46.setText(calculate.pos(39));


            t33.setText(calculate.pos(40));
            t34.setText(calculate.pos(41));
            t40.setText(calculate.pos(43));
            t41.setText(calculate.pos(44));

            t35.setText(calculate.pos(42));
            t42.setText(calculate.pos(45));
            t49.setText(calculate.pos(48));
            t47.setText(calculate.pos(46));
            t48.setText(calculate.pos(47));


        }


    }
}
