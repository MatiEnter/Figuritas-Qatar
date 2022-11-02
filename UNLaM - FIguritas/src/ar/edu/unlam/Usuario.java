package ar.edu.unlam;

public abstract class Usuario {

	private Integer codigoUsuario;

	public Usuario(Integer codigoUsuario) {
		super();
		this.codigoUsuario = codigoUsuario;
	}

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public abstract Boolean agregarFigurita(Figurita figurita) throws CodigoExistente;

}
