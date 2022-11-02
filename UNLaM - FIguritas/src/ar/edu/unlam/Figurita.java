package ar.edu.unlam;

import java.util.Objects;

public class Figurita {

	private Integer numeroFigurita;
	private String grupo;
	private String seleccion;
	private String nacionalidad;
	private Double precio;

	public Figurita(Integer codigo, String grupo, String seleccion, String nacionalidad, Double precio) {
		this.numeroFigurita = codigo;
		this.grupo = grupo;
		this.seleccion = seleccion;
		this.nacionalidad = nacionalidad;
		this.precio = precio;
	}

	public Integer getCodigo() {
		return numeroFigurita;
	}

	public void setCodigo(Integer codigo) {
		this.numeroFigurita = codigo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grupo, numeroFigurita, seleccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(grupo, other.grupo) && Objects.equals(numeroFigurita, other.numeroFigurita)
				&& Objects.equals(seleccion, other.seleccion);
	}

	
}
