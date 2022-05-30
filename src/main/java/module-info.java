module ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.kordamp.bootstrapfx.core;


    opens ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022 to javafx.fxml;
    opens ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.model to javafx.fxml;
    exports ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022;
    exports ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.controller;
    exports ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.model;
    opens ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.controller to javafx.fxml;
}