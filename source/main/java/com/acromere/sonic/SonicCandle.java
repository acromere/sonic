package com.acromere.sonic;

import com.acromere.xenon.Module;
import com.acromere.xenon.ToolRegistration;
import lombok.CustomLog;

@CustomLog
public class SonicCandle extends Module {

	private final ProjectResourceType projectResourceType;

	public SonicCandle() {
		projectResourceType = new ProjectResourceType( this );
	}

	@Override
	public void register() {
		super.register();
		log.atInfo().log( "Registering Sonic Candle");
	}

	@Override
	public void startup() throws Exception {
		super.startup();
		log.atInfo().log( "Initializing Sonic Candle");

		// TODO Register an icon to represent a music render project file

		registerResourceType( projectResourceType );
		ToolRegistration registration = new ToolRegistration( this, SonicCandleTool2.class);
		registration.setName( "HyperSynestheisa Tool" );
		registerTool( projectResourceType, registration );
	}

	@Override
	public void shutdown() throws Exception {
		super.shutdown();
		log.atInfo().log( "Closing Sonic Candle");

		unregisterTool( projectResourceType, SonicCandleTool2.class );
		unregisterResourceType( projectResourceType );
	}

	@Override
	public void unregister() {
		super.unregister();
		log.atInfo().log( "UnRegistering Sonic Candle");
	}
}
