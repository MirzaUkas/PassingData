/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsingdata;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author MirzaUY
 */
public class DataController implements Initializable {

    @FXML
    private TableView<?> tbview;
    @FXML
    private TableColumn<?, ?> NAMA;
    @FXML
    private TableColumn<?, ?> KELAS;
    @FXML
    private TableColumn<?, ?> JUDUL;
    @FXML
    private Label coba;
    @FXML
    private JFXButton exit;
    @FXML
    private Label Nama;
    @FXML
    private Label Kelas;
    @FXML
    private Label Buku;
    @FXML
    private Label Nama1;
    @FXML
    private Label Nama11;
    @FXML
    private Label Nama111;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void keluar(ActionEvent event) {
        System.exit(0);
    }
    public void setData(String name,String kelas,String book){
    Nama.setText(name);
    Kelas.setText(kelas);
    Buku.setText(book);
    }
}
