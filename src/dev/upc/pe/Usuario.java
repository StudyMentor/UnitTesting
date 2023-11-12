package dev.upc.pe;

public abstract class Usuario {
    public enum Rol {
    	TUTOR, 
    	ALUMNO
    }
    private String usuario;
    private String contraseña;
    private Rol tipo;

    public Usuario(String usuario, String contraseña, int tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        if(tipo==1) {
        	this.tipo = Rol.TUTOR;
        } else {
        	this.tipo = Rol.ALUMNO;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

	public Rol getTipo() {
		return tipo;
	}

	public void setTipo(Rol tipo) {
		this.tipo = tipo;
	}
}
