package ar.edu.unahur.po2.amarras;

import java.util.LinkedList;
import java.util.Collections;

public class Fondeadero {
	private Integer cantidadMaximaAmarras ;
	private LinkedList <Yate> amarras = new LinkedList<>();

	public Fondeadero(Integer cantidadMaximaAmarras) {
		this.cantidadMaximaAmarras = cantidadMaximaAmarras;
	}

	public Integer getAmarras() {
		return this.cantidadMaximaAmarras;
	}

	public void amarrarUnYate(Yate miYate) {
		if( candidadAmarrasDisponibles() > 0 && validarYateDuplicado(miYate)) { 
		this.amarras.add(miYate);
		}
	}
	
	public void desamarrarUnYate(Yate miYate) {
		if(amarras.contains(miYate)) {
			amarras.remove(miYate);
		}
	}
	
	public Integer getCantidadYatesAmarrados() {
		return amarras.size();
	}
	
	public Integer getCantidadDeAmarrasDisponibles() {
		return this.getAmarras() - amarras.size() ; 
	}

	public Integer candidadAmarrasDisponibles() {
		return getAmarras() - this.amarras.size();
	}
	
	// No amarrar un yate duplicado
	private Boolean validarYateDuplicado(Yate unYate) {
		Boolean retorno = Boolean.TRUE;
		if(this.amarras.contains(unYate)) { // en "Yate" ya definí que es debe tener un yate para estar Duplicado, en esta funcion valido esto.
			retorno = Boolean.FALSE;
		}
		return retorno; 
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double precioAmarrer = 0.0;
		if(amarras.contains(yate)) {
			precioAmarrer += yate.costeDeAmarre();
		}
		return precioAmarrer;
			
	}
		
	public Double obtenerRecaudacionTotal() {
		Double valorTotal = 0.0;
		for(Yate yate : this.amarras) {
			valorTotal += yate.costeDeAmarre();
		}
		return valorTotal;
	}
		
	public Object ordenarYatesPorEslora() {
		Collections.sort(amarras);
		return amarras;
	}
	
	public Yate miPrimerYate() {
		return amarras.getFirst();
		
	}
		
}
