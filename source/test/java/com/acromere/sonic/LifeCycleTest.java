package com.acromere.sonic;

import com.acromere.xenon.Module;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LifeCycleTest extends HyperSynesthesiaTest {

	@Test
	void testModLifeCycle() {
		assertThat( getProgram().getProductManager().isModEnabled( getMod() ) ).isTrue();
		assertThat( getMod().getStatus() ).isEqualTo( Module.Status.STARTED );

		getProgram().getProductManager().setModEnabled( getMod().getCard(), false );

		assertThat( getProgram().getProductManager().isModEnabled( getMod() ) ).isFalse();
		assertThat( getMod().getStatus() ).isEqualTo( Module.Status.STOPPED );
	}

	@Test
	void testModHasCard() {
		assertNotNull( getMod().getCard() );
	}

	@Test
	void testModCardName() {
		assertEquals( "Sonic Candle", getMod().getCard().getName() );
	}

	@Test
	void testModCardArtifact() {
		assertEquals( "sonic", getMod().getCard().getArtifact() );
	}

}
