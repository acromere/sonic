import com.acromere.sonic.SonicCandle;
import com.acromere.xenon.Module;

module com.acromere.soniccandle {
	requires static lombok;
	requires static org.jspecify;

	requires com.acromere.xenon;
	requires com.github.kokorin.jaffree;
	requires fft4j;
	requires org.slf4j;
	requires javafx.graphics;
	requires com.acromere.zevra;
	requires java.desktop;

	// Compile and runtime access
	exports com.acromere.sonic to com.acromere.xenon;
	exports com.acromere.sonic.icon;
	exports com.acromere.sonic.bar to com.acromere.xenon;

	// Runtime reflection
	opens com.acromere.sonic.bundles;
	//opens com.acromere.sonic.settings;

	provides Module with SonicCandle;
}
