package dev.upc.pe;

public abstract class Usuario {
    public enum Rol {
    	TUTOR, 
    	ALUMNO
    }
    private String usuario;
    private String contrase�a;
    private Rol tipo;

    public Usuario(String usuario, String contrase�a, int tipo) {
        this.usuario = usuario;
        this.contrase�a = contrase�a;
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

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

	public Rol getTipo() {
		return tipo;
	}

	public void setTipo(Rol tipo) {
		this.tipo = tipo;
	}
}
