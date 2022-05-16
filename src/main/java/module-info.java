module ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022 to javafx.fxml;
    exports ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022;
}