module com.example.demo19 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires org.mariadb.jdbc;


    opens com.example.demo19 to javafx.fxml;
    exports com.example.demo19;
}
