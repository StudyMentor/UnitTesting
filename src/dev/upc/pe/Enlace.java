package dev.upc.pe;
import java.util.Date;
import java.util.Random;

public class Enlace {
	private String url;
	private Date fechaCreacion;
	
	public Enlace() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public static Enlace generarEnlaceConDatosAleatorios() {
        // Generar URL aleatoria
        String urlAleatoria = generarURLAleatoria();
        // Generar fecha aleatoria (entre 2000 y 2023 para este ejemplo)
        Date fechaAleatoria = generarFechaAleatoria();
        
		Enlace auxEnlace = new Enlace();
		auxEnlace.setFechaCreacion(fechaAleatoria);
		auxEnlace.setUrl(urlAleatoria);

        return auxEnlace;
    }


    private static String generarURLAleatoria() {
        // Lógica para generar una URL aleatoria
        // Aquí puedes implementar tu lógica para generar una URL aleatoria
        // Por ejemplo, puedes usar caracteres aleatorios o patrones predefinidos

        // En este ejemplo se generará una URL aleatoria de 10 caracteres
        int length = 10;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        return sb.toString() + ".com";
    }

    private static Date generarFechaAleatoria() {
        // Generar una fecha aleatoria entre 2000 y 2023 para este ejemplo
        long fechaInicial = 946684800000L; // 01-01-2000 en milisegundos
        long fechaFinal = 1672531200000L; // 01-01-2023 en milisegundos
        long fechaAleatoria = fechaInicial + (long) (Math.random() * (fechaFinal - fechaInicial));

        return new Date(fechaAleatoria);
    }
}
