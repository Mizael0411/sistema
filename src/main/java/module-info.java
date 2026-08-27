module com.abrigo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.abrigo to javafx.fxml;
    opens com.abrigo.sistema to javafx.fxml;
    opens com.abrigo.view to javafx.fxml;
    exports com.abrigo;
    exports com.abrigo.sistema;
    exports com.abrigo.view;
}