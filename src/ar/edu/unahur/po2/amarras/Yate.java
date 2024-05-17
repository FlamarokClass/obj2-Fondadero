package ar.edu.unahur.po2.amarras;

import java.util.Objects;

public abstract class Yate implements Comparable<Yate>{
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Integer peso;
	
	Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga =  manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}
	
	protected abstract Double getPrecioPorTipoYate(); // abstracto que estara definido en los hijos.
	
	public Double costeDeAmarre() {
		Double valorEslora = 0.0; 
		if(this.eslora <= 20) {
			valorEslora = 2000.0;
		}else {
			valorEslora = 3000.0;
		}
		return valorEslora + getPrecioPorTipoYate() ; // trae el valor desde el hijo
	}

	@Override
	public int hashCode() {
		return Objects.hash(eslora, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(eslora, other.eslora) && Objects.equals(nombre, other.nombre);
	}
	
	
	// Con esta funcion puedo ordenar Yates
	@Override
	public int compareTo(Yate o) {
		int retorno = 0;
		if(this.eslora > o.eslora) {
			retorno = 1;
		}if(this.eslora < o.eslora) {
			retorno = -1;
		}
		return retorno;
	}
}
