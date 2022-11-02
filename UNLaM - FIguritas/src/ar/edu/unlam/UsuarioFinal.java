package ar.edu.unlam;

import java.util.*;

public class UsuarioFinal extends Usuario {

	private Set<Figurita> figuritasEnStock;

	public UsuarioFinal(Integer codigoUsuario) {
		super(codigoUsuario);
		this.figuritasEnStock = new HashSet<>();
	}

	@Override
	public void agregarFigurita(Figurita figurita) {
		this.figuritasEnStock.add(figurita);

	}

	public Set<Figurita> getFiguritasEnStock() {
		return figuritasEnStock;
	}

	public void setFiguritasEnStock(Set<Figurita> figuritasEnStock) {
		this.figuritasEnStock = figuritasEnStock;
	}

	public void pegarFigurita() throws FiguritaRepetida {

	}

	public void intercambiarFigurita() throws FiguritaNoDisponible {

	}

}
