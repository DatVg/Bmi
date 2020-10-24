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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField txtChieuCao;
    @FXML
    private TextField txtCanNang;
    @FXML
    private Label lblKetQua;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void tinhBMIHandler(ActionEvent e) {
        try {
            double chieuCao = Double.parseDouble(this.txtChieuCao.getText());
            double canNang = Double.parseDouble(this.txtCanNang.getText());
        
            double kq = canNang / Math.pow(chieuCao, 2);
            this.lblKetQua.setText(String.valueOf(kq));
        } catch (NumberFormatException ex) {
            this.lblKetQua.setText(ex.getMessage());
        }
    }
}
