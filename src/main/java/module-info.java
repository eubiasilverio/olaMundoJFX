module spsenac.br.olamundo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens spsenac.br.olamundo4 to javafx.fxml;
    exports spsenac.br.olamundo4;
}