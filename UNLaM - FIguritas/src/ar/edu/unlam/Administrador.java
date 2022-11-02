package ar.edu.unlam;

import java.util.*;

public class Administrador extends Usuario {

	Set<Figurita> figuritasCreadas;

	public Administrador(Integer codigoUsuario) {
		super(codigoUsuario);
		this.figuritasCreadas = new HashSet<>();
	}

	@Override
	public Boolean agregarFigurita(Figurita figurita) throws CodigoExistente {
		return this.figuritasCreadas.add(figurita);

	}

	public Set<Figurita> getFiguritasCreadas() {
		return figuritasCreadas;
	}

	public void setFiguritasCreadas(Set<Figurita> figuritasCreadas) {
		this.figuritasCreadas = figuritasCreadas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(figuritasCreadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		return Objects.equals(figuritasCreadas, other.figuritasCreadas);
	}

	
}
