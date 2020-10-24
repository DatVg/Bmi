/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLPieChartController implements Initializable {
    @FXML
    private VBox vControls;
    @FXML
    private StackPane sPieChart;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void themHandler(ActionEvent e) {
        TextField txt = new TextField();
        this.vControls.getChildren().add(txt);
    }
    
    public void veHandler(ActionEvent e) {
        PieChart pie = new PieChart();
        pie.setTitle("Biểu đồ tròn");
        
        this.vControls.getChildren().forEach(ev -> {
            TextField t = (TextField) ev;
            String va = t.getText();
            pie.getData().add(new PieChart.Data(va, Double.parseDouble(va)));
        });
        
        this.sPieChart.getChildren().add(pie);
    }
}
