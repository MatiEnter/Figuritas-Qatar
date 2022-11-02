package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFiguritas {
	Figurita messi = new Figurita(001, "C", "Argentina", "Messi", 50000000.0);
	Figurita ronaldo = new Figurita(002, "G", "Portugal", "Ronaldo", 10000000.0);
	Usuario admin = new Administrador(1);
	Usuario user = new UsuarioFinal(2);
	
	@Test
	public void queSePuedaCrearUnaFigurita() {
		assertEquals(001, messi.getCodigo(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnAdministrador() throws CodigoExistente {
		assertEquals(1, admin.getCodigoUsuario(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		assertEquals(2, user.getCodigoUsuario(), 0.01);
	}

	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistente {
		
		admin.agregarFigurita(messi);
	
		assertEquals(1,((Administrador) admin).figuritasCreadas.size());

		
	}

	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() throws CodigoExistente {
		Usuario user = new UsuarioFinal(2);
		Figurita messi = new Figurita(001, "C", "Argentina", "Messi", 50000000.0);

		user.agregarFigurita(messi);

		assertTrue(((UsuarioFinal) user).getFiguritasEnStock().contains(messi));
	}

	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() {
		fail("Not yet implemented");
	}

	@Test
	public void queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() {
		fail("Not yet implemented");
	}

	@Test
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() {
		fail("Not yet implemented");
	}

	@Test
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado() {
		fail("Not yet implemented");
	}

}
