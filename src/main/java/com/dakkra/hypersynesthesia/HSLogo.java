package com.dakkra.hypersynesthesia;

import com.acromere.zerra.javafx.Fx;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HSLogo extends Pane {

	private static final double WIDTH = 256;

	private static final double HEIGHT = 256;

	public HSLogo() {
		ImageView view = new ImageView( new Image( "/soniccandle-icon.png", WIDTH, HEIGHT, true, true ) );
		getChildren().addAll( view );
		setWidth( WIDTH );
		setHeight( HEIGHT );
	}

	static void main( String[] ignore ) {
		Fx.startup();

		Fx.run( () -> {
			HSLogo logo = new HSLogo();

			BorderPane borderPane = new BorderPane( logo );
			Scene scene = new Scene( borderPane, logo.getWidth(), logo.getHeight(), Color.BLACK );

			Stage stage = new Stage();
			stage.setScene( scene );
			stage.show();
		} );
	}

}
