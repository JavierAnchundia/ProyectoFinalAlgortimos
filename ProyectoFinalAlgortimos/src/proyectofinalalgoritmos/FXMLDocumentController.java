/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalalgoritmos;

import java.awt.Font;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    TableView<Estudiante> Globaltab;
    @FXML
    TableColumn<Estudiante, String> Nombre0;
    @FXML
    TableColumn<Estudiante, String> Apellido0;
    @FXML
    TableColumn<Estudiante, String> Matricula0;
    @FXML
    TableColumn<Estudiante, Double> Prioridad0;

    ObservableList<Estudiante> listG = FXCollections.observableArrayList();

    @FXML
    TableView<Estudiante> tableView1;
    @FXML
    TableColumn<Estudiante, String> Nombre1;
    @FXML
    TableColumn<Estudiante, String> Apellido1;
    @FXML
    TableColumn<Estudiante, String> Matricula1;
    @FXML
    TableColumn<Estudiante, Double> Prioridad1;

    ObservableList<Estudiante> list = FXCollections.observableArrayList();

    @FXML
    TableView<Estudiante> tableView2;
    @FXML
    TableColumn<Estudiante, String> Nombre2;
    @FXML
    TableColumn<Estudiante, String> Apellido2;
    @FXML
    TableColumn<Estudiante, String> Matricula2;
    @FXML
    TableColumn<Estudiante, Double> Prioridad2;

    ObservableList<Estudiante> list2 = FXCollections.observableArrayList();

    @FXML
    TableView<Estudiante> tableView3;
    @FXML
    TableColumn<Estudiante, String> Nombre3;
    @FXML
    TableColumn<Estudiante, String> Apellido3;
    @FXML
    TableColumn<Estudiante, String> Matricula3;
    @FXML
    TableColumn<Estudiante, Double> Prioridad3;

    ObservableList<Estudiante> list3 = FXCollections.observableArrayList();

    @FXML
    TableView<Estudiante> tableView4;
    @FXML
    TableColumn<Estudiante, String> Nombre4;
    @FXML
    TableColumn<Estudiante, String> Apellido4;
    @FXML
    TableColumn<Estudiante, String> Matricula4;
    @FXML
    TableColumn<Estudiante, Double> Prioridad4;

    ObservableList<Estudiante> list4 = FXCollections.observableArrayList();

    @FXML
    AnchorPane Global;
    @FXML
    AnchorPane Economica;
    @FXML
    AnchorPane Laboral;
    @FXML
    AnchorPane Familia;
    @FXML
    AnchorPane Medica;
    @FXML
    AnchorPane paneBotones;

    LinkedListMergeSort li;

    @FXML
    public void mostrarMedica() {
        Global.setVisible(false);
        Economica.setVisible(false);
        Laboral.setVisible(false);
        Medica.setVisible(true);
        Familia.setVisible(false);

        Medica.setOpacity(1);
        li.setOrdenamiento("Salud");
        li.head = li.mergeSort(li.head);

        Estudiante header = li.head;
        if (list4.isEmpty()) {
            while (header != null) {
                list4.add(new Estudiante(header.nombre, header.apellido, header.matricula, header.promSalud));

                header = header.next;
                tableView4.setItems(list4);

            }
        }
    }

    @FXML
    public void mostrarFamilia() {
        Global.setVisible(false);
        Economica.setVisible(false);
        Laboral.setVisible(false);
        Medica.setVisible(false);
        Familia.setVisible(true);

        li.setOrdenamiento("Familiar");
        li.head = li.mergeSort(li.head);

        Familia.setOpacity(1);
        Estudiante header = li.head;
        if (list3.isEmpty()) {
            while (header != null) {
                list3.add(new Estudiante(header.nombre, header.apellido, header.matricula, header.promFamilia));

                header = header.next;
                tableView3.setItems(list3);

            }
        }
    }

    @FXML
    public void mostrarLaboral() {
        Global.setVisible(false);
        Economica.setVisible(false);
        Laboral.setVisible(true);
        Medica.setVisible(false);
        Familia.setVisible(false);

        li.setOrdenamiento("Laboral");
        li.head = li.mergeSort(li.head);

        Laboral.setOpacity(1);

        Estudiante header = li.head;
        if (list2.isEmpty()) {
            while (header != null) {
                list2.add(new Estudiante(header.nombre, header.apellido, header.matricula, header.promLaboral));

                header = header.next;
                tableView2.setItems(list2);

            }
        }
    }

    @FXML
    public void mostrarEconomica() {
        Global.setVisible(false);
        Economica.setVisible(true);
        Laboral.setVisible(false);
        Medica.setVisible(false);
        Familia.setVisible(false);

        Economica.setOpacity(1);

        li.setOrdenamiento("Economia");
        li.head = li.mergeSort(li.head);

        Estudiante header = li.head;
        if (list.isEmpty()) {
            while (header != null) {
                list.add(new Estudiante(header.nombre, header.apellido, header.matricula, header.promEconomia));

                header = header.next;
                tableView1.setItems(list);

            }
        }
    }

    @FXML
    public void mostrarGlobal() {
        Global.setVisible(true);
        Economica.setVisible(false);
        Laboral.setVisible(false);
        Medica.setVisible(false);
        Familia.setVisible(false);

        Global.setOpacity(1);

        li.setOrdenamiento("Global");
        li.head = li.mergeSort(li.head);

        Estudiante header = li.head;
        if (listG.isEmpty()) {
            while (header != null) {
                listG.add(new Estudiante(header.nombre, header.apellido, header.matricula, header.promGlobal));
                System.out.println(header.promGlobal);
                header = header.next;
                Globaltab.setItems(listG);

            }
        }
    }

    public void mostrarInfoEcon() {
        tableView1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Estudiante>() {
            @Override
            public void changed(ObservableValue<? extends Estudiante> arg0,
                    Estudiante valorAnterior, Estudiante valorSeleccionado) {
                if (valorSeleccionado != null) {
                    System.out.println("sel: " + valorSeleccionado.getPromEconomia());
                    final Stage myDialog = new Stage();
                    myDialog.initModality(Modality.WINDOW_MODAL);

                    Button okButton = new Button("Aceptar");
                    VBox vbox = new VBox();
                    if (valorSeleccionado.getPromEconomia() >= 8.0) {
                        Text econMsg = new Text("Se recomienda que el alumno visite\n el Dpto. de Trabajo Social\n");
                        Text ubepinfo = new Text("Correo: egjarami@espol.edu.ec\n" + "\t\tpmpizarr@espol.edu.ec\n" + " Número telefónico: 2269269 Ext.1238\n");
                        econMsg.setTextAlignment(TextAlignment.CENTER);
                        ubepinfo.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().addAll(econMsg, ubepinfo);

                    } else {
                        Text genMsg = new Text("El alumno no necesita de atención especial.\n");
                        genMsg.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().add(genMsg);

                    }
                    Scene myDialogScene = new Scene(vbox);

                    vbox.getChildren().add(okButton);
                    vbox.setAlignment(Pos.CENTER);
                    myDialog.setScene(myDialogScene);
                    myDialog.show();

                    okButton.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent arg0) {
                            myDialog.close();
                        }

                    });

                }

            }

        });
    }
    
    public void mostrarInfoLab() {
        tableView2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Estudiante>() {
            @Override
            public void changed(ObservableValue<? extends Estudiante> arg0,
                    Estudiante valorAnterior, Estudiante valorSeleccionado) {
                if (valorSeleccionado != null) {
                    System.out.println("sel: " + valorSeleccionado.getPromEconomia());
                    final Stage myDialog = new Stage();
                    myDialog.initModality(Modality.WINDOW_MODAL);

                    Button okButton = new Button("Aceptar");
                    VBox vbox = new VBox();
                    if (valorSeleccionado.getPromLaboral() >= 8.0) {
                        Text labMsg = new Text("Se recomienda que el alumno visite\n el Dpto. de Trabajo Social\n");
                        Text ubepinfo = new Text("Correo: egjarami@espol.edu.ec\n" + "\t\tpmpizarr@espol.edu.ec\n" + " Número telefónico: 2269269 Ext.1238\n");
                        labMsg.setTextAlignment(TextAlignment.CENTER);
                        ubepinfo.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().addAll(labMsg, ubepinfo);

                    } else {
                        Text genMsg = new Text("El alumno no necesita de atención especial.\n");
                        genMsg.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().add(genMsg);

                    }
                    Scene myDialogScene = new Scene(vbox);

                    vbox.getChildren().add(okButton);
                    vbox.setAlignment(Pos.CENTER);
                    myDialog.setScene(myDialogScene);
                    myDialog.show();

                    okButton.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent arg0) {
                            myDialog.close();
                        }

                    });

                }

            }

        });
    }

    public void mostrarInfoSalud() {
        tableView4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Estudiante>() {
            @Override
            public void changed(ObservableValue<? extends Estudiante> arg0,
                    Estudiante valorAnterior, Estudiante valorSeleccionado) {
                if (valorSeleccionado != null) {
                    System.out.println("sel: " + valorSeleccionado.getPromEconomia());
                    final Stage myDialog = new Stage();
                    myDialog.initModality(Modality.WINDOW_MODAL);

                    Button okButton = new Button("Aceptar");
                    VBox vbox = new VBox();
                    if (valorSeleccionado.getPromSalud() >= 8.0) {
                        Text saludMsg = new Text("Se recomienda que el alumno visite\n el Dpto. Médico - Enfermería\n");
                        Text depMed = new Text("Personal Médico: \n"+ "Correo: jdobando@espol.edu.ec,\n \t\tvmarcill@espol.edu.ec\n"+ "\n"+"Teléfono: 2269269 Ext. 1235, 1236\n"
                        + "\nHorario de atención: 08:00 a 16:30\n \t\t10:00 a 18.00");
                        saludMsg.setTextAlignment(TextAlignment.CENTER);
                        depMed.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().addAll(saludMsg,depMed);

                    } else {
                        Text genMsg = new Text("El alumno no necesita de atención especial.\n");
                        genMsg.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().add(genMsg);

                    }
                    Scene myDialogScene = new Scene(vbox);

                    vbox.getChildren().add(okButton);
                    vbox.setAlignment(Pos.CENTER);
                    myDialog.setScene(myDialogScene);
                    myDialog.show();

                    okButton.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent arg0) {
                            myDialog.close();
                        }

                    });

                }

            }

        });
    }
    
    public void mostrarInfoFamiliar() {
        tableView3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Estudiante>() {
            @Override
            public void changed(ObservableValue<? extends Estudiante> arg0,
                    Estudiante valorAnterior, Estudiante valorSeleccionado) {
                if (valorSeleccionado != null) {
                    System.out.println("sel: " + valorSeleccionado.getPromEconomia());
                    final Stage myDialog = new Stage();
                    myDialog.initModality(Modality.WINDOW_MODAL);

                    Button okButton = new Button("Aceptar");
                    VBox vbox = new VBox();
                    if (valorSeleccionado.getPromFamilia() >= 8.0) {
                        Text saludMsg = new Text("Se recomienda que el alumno visite\n el Dpto. de Psicología\n");
                        Text depFam = new Text("Personal Médico: \n"+ "Correo: dcnarvae@espol.edu.ec,\n \t\tjpingel@espol.edu.ec\n"+ "\nTeléfono: 2269269Ext. 2012, 1230\n"
                        + "\nHorario de atención: 08:00 a 16:30\n");
                        saludMsg.setTextAlignment(TextAlignment.CENTER);
                        depFam.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().addAll(saludMsg,depFam);

                    } else {
                        Text genMsg = new Text("El alumno no necesita de atención especial.\n");
                        genMsg.setTextAlignment(TextAlignment.CENTER);
                        vbox.getChildren().add(genMsg);

                    }
                    Scene myDialogScene = new Scene(vbox);

                    vbox.getChildren().add(okButton);
                    vbox.setAlignment(Pos.CENTER);
                    myDialog.setScene(myDialogScene);
                    myDialog.show();

                    okButton.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent arg0) {
                            myDialog.close();
                        }

                    });

                }

            }

        });
    }
    @Override

    public void initialize(URL url, ResourceBundle rb) {

        String urlT = "Prueba.txt";
        li = new LinkedListMergeSort();

        li.setOrdenamiento("Salud");
        LecturaArchivos.leerEstudiante(urlT, li);
        li.head = li.mergeSort(li.head);
        mostrarFamilia();
        System.out.println("proyectofinalalgoritmos.FXMLDocumentController.initialize()");
        Global.setVisible(false);
        Economica.setVisible(false);
        Laboral.setVisible(false);
        Medica.setVisible(false);
        Familia.setVisible(true);

        Nombre1.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        Apellido1.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("apellido"));
        Matricula1.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("matricula"));
        Prioridad1.setCellValueFactory(new PropertyValueFactory<Estudiante, Double>("promEconomia"));

        Nombre2.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        Apellido2.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("apellido"));
        Matricula2.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("matricula"));
        Prioridad2.setCellValueFactory(new PropertyValueFactory<Estudiante, Double>("promFamilia"));

        Nombre3.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        Apellido3.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("apellido"));
        Matricula3.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("matricula"));
        Prioridad3.setCellValueFactory(new PropertyValueFactory<Estudiante, Double>("promLaboral"));

        Nombre4.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        Apellido4.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("apellido"));
        Matricula4.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("matricula"));
        Prioridad4.setCellValueFactory(new PropertyValueFactory<Estudiante, Double>("promSalud"));

        Nombre0.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("nombre"));
        Apellido0.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("apellido"));
        Matricula0.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("matricula"));
        Prioridad0.setCellValueFactory(new PropertyValueFactory<Estudiante, Double>("promGlobal"));

        mostrarInfoEcon();
        mostrarInfoLab();
        mostrarInfoSalud();
        mostrarInfoFamiliar();

    }

}
