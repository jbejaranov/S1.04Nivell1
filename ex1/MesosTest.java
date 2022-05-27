package ex1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MesosTest {

	@Test
	void test() {

		List<String> mesos = new ArrayList<String>();

		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Mar�");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");

//Verifiquem que t� 12 posicions
		equals(mesos.size() == 12);
//Verifiquem que la posici� 8 no �s nul�la		
		assertNotNull(mesos.get(8 - 1));
//Verifiquem que a la posici� 8 tenim Agost		
		assertEquals("Agost", mesos.get(8 - 1));
	}
}
