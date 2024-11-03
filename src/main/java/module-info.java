module org.example.mazebank {
	requires javafx.controls;
	requires javafx.fxml;
	requires de.jensd.fx.glyphs.fontawesome;
	requires java.sql;
	requires org.xerial.sqlitejdbc;

	opens org.example.mazebank to javafx.fxml;
	exports org.example.mazebank;
	exports org.example.mazebank.controllers;
	exports org.example.mazebank.controllers.admin;
	exports org.example.mazebank.controllers.client;
	exports org.example.mazebank.models;
	exports org.example.mazebank.views;
}