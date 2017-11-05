/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsingdata;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MirzaUY
 */
public class MainController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField kelas;
    @FXML
    private JFXTextField buku;
    @FXML
    private JFXDatePicker tanggal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void oke(ActionEvent event) {
        String nm,kls,bku;
            nm = this.nama.getText();
            kls = this.kelas.getText();
            bku = this.buku.getText();
            
            
                    try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("Data.fxml"));
                Parent root = (Parent)fxml.load();
                DataController controller = fxml.<DataController>getController();
                controller.setData(nm,kls,bku);
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Data Peminjam");
               
            stage.show();
            }catch(IOException e){
            System.out.println("Failed to create new window"+e);
            }
    }
    
}
