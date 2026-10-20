package com.acromere.sonic;

import com.acromere.xenon.Rebrandable;
import com.acromere.xenon.XenonProgram;
import com.acromere.zerra.image.BrokenIcon;

public class Rebrand implements Rebrandable {

	public void register( XenonProgram xenon ) {
		// Register rebranding resources like fonts, colors, and icons
		xenon.getIconLibrary().register( "soniccandle", new BrokenIcon() );
	}

	public void unregister( XenonProgram xenon) {
		xenon.getIconLibrary().unregister( "soniccandle", new BrokenIcon() );
	}

}
