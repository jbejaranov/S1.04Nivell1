package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MesosTest {

	@Test
	public void mesosTest() {

		Mesos mesos = new Mesos();

//Verifiquem que t� 12 posicions
		equals(mesos.metodeMesos().size() == 12);
//Verifiquem que la posici� 8 no �s nul�la	
		assertNotNull(mesos.metodeMesos().get(8 - 1));
//Verifiquem que a la posici� 8 tenim Agost	
		assertEquals("Agost", mesos.metodeMesos().get(8 - 1));

	}

}
