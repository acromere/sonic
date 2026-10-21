package com.acromere.sonic;

import com.acromere.zerra.color.Colors;
import com.acromere.zerra.image.Proof;
import com.acromere.zerra.image.SvgIcon;
import javafx.scene.paint.*;
import org.jspecify.annotations.NonNull;

public class SonicCandleIcon extends SvgIcon {

	public SonicCandleIcon() {
		super( 32, 32 );

		String outerOutline = circle( 16, 16, 16 );
		String innerOutline = circle( 16, 16, 13 );
		fill( outerOutline + innerOutline, Color.BLACK );

		Color leftFill = Colors.parse( "#2B1600" );
		Color rightFill = Colors.parse( "#925E10" );
		Paint innerFill = new LinearGradient( 4, 16, 28, 16, false, CycleMethod.NO_CYCLE, new Stop( 0, leftFill ), new Stop( 1, rightFill ) );
		fill( innerOutline, innerFill );

		Color leftBarFill = Colors.parse( "#7A4B06" );
		Color rightBarFill = Colors.parse( "#E5C038" );
		Paint barFill = new LinearGradient( 4, 16, 28, 16, false, CycleMethod.NO_CYCLE, new Stop( 0, leftBarFill ), new Stop( 1, rightBarFill ) );
		fill( getBars(), barFill );
	}

	private @NonNull String getBars() {
		int index = 0;
		String bars = bar( index++, 4 );
		bars += bar( index++, 4 );
		bars += bar( index++, 4 );
		bars += bar( index++, 3.5 );
		bars += bar( index++, 2 );
		bars += bar( index++, 4.5 );
		bars += bar( index++, 6 );
		bars += bar( index++, 8 );
		bars += bar( index++, 5.5 );
		bars += bar( index++, 3.5 );
		bars += bar( index++, 10 );
		bars += bar( index++, 10 );
		bars += bar( index++, 16 );
		bars += bar( index++, 20 );
		bars += bar( index++, 12 );
		bars += bar( index++, 2.5 );
		bars += bar( index++, 2 );
		bars += bar( index++, 4 );
		bars += bar( index++, 5.5 );
		bars += bar( index++, 4 );
		bars += bar( index++, 5 );
		bars += bar( index++, 5 );
		bars += bar( index++, 2 );
		bars += bar( index++, 2 );
		bars += bar( index++, 2.5 );
		bars += bar( index++, 2.5 );
		return bars;
	}

	private String bar( int index, double size ) {
		double half = 0.5 * size;
		return "M" + (3.2 + index) + "," + (16 - half) + " l0," + size + " l0.6,0 l0,-" + size + " Z ";
	}

	public static void main( String[] args ) {
		Proof.proof( new SonicCandleIcon() );
	}

}
