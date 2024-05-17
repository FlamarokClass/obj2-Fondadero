package ar.edu.unahur.po2.amarras;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class amarrasTest {

	@Test
	public void queSePuedaCrearUnFondeaderoConUnaCantidadMaximaDeAmarras() {
		// Preparacion , lo hacemos asi porque lo indica la consigna.
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		Integer valorEsperado = cantidadMaximaAmarras;
		Integer valorObtenido = 0;
		// Ejecucion
		valorObtenido = miFondeadero.getAmarras();
		// Contrastacion
		assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void queSePuedaCalcularElValorDeUnYateAMotor() {
		// Preparación
		Double valorObtenido = 0.0;
		Double valorEsperado = 13000.0;
		
		String nombre = "AZ1";
		String duenio = "Andres Borgeat";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso = 5500;
		Integer desplazamiento = 5959;
		String propulcion = "2x Mottores Diesel MAN Rk 2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		YateMotor miYateMotor = new YateMotor(nombre,duenio,manga,calado,eslora,tripulacion, peso, desplazamiento, propulcion, potencia, velocidad, autonomia);
		//Ejecución
		valorObtenido = miYateMotor.costeDeAmarre();
		//Contrastación
		assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queSePuedaCalcularElValorDeUnYateAVela() {
		// Preparación
				Double valorObtenido = 0.0;
				Double valorEsperado = 11000.0;
				
				String nombre = "XXR";
				String duenio = "Sebastian Pardo";
				Double manga = 6.90;
				Double calado = 2.7;
				Double eslora = 13.45;
				Integer tripulacion = 5;
				Integer peso = 1400;
				Double alturaMastil = 21.5;
				Integer superficieVelicaMayor = 85 ;
				Integer superficieTotal = 2;
				
				
				YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
				//Ejecución
				valorObtenido = miYateVela.costeDeAmarre();
				//Contrastación
				assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queSePuedaAmarrarUnYate() {
		// Preparación
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		Integer valorObtenido = 0;
		Integer valorEsperado = cantidadMaximaAmarras - 1;
		
		String nombre = "XXR";
		String duenio = "Sebastian Pardo";
		Double manga = 6.90;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso = 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85 ;
		Integer superficieTotal = 2;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		
		// Ejecucion
		miFondeadero.amarrarUnYate(miYateVela);
		valorObtenido = miFondeadero.candidadAmarrasDisponibles();
		//Contrastación
		assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queNoSePuedaAmarrarUnYateDuplicado() {
		// Preparación
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		String nombre = "XXR";
		String duenio = "Sebastian Pardo";
		Double manga = 6.90;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso = 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85 ;
		Integer superficieTotal = 2;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		YateVela miSegundoYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		
		Integer valorObtenido = 0;
		Integer valorEsperado = cantidadMaximaAmarras - 1;
		// Ejecucion
		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miSegundoYateVela);
		
		valorObtenido = miFondeadero.candidadAmarrasDisponibles();
		//Contrastación
		assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queObtengamosElPrecioDeUnAmarre() {
		// Preparación
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
				
		String nombre = "XXR";
		String duenio = "Sebastian Pardo";
		Double manga = 6.90;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso = 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85 ;
		Integer superficieTotal = 2;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		YateVela miSegundoYateVela = new YateVela("Galgo","carlos santillan",manga,calado,9.0,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
				
		Double valorEsperado = 22000.0 ;
		// Ejecucion
		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miSegundoYateVela);
		Double valorObtenido = miFondeadero.obtenerRecaudacionTotal();
		//Contrastación
		assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queLosYatesDelFondeaderoEstenOrdenadosPorTamañoDeEslora() {
		// Preparación
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
				
		String nombre = "XXR";
		String duenio = "Sebastian Pardo";
		Double manga = 6.90;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso = 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85 ;
		Integer superficieTotal = 2;

		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		YateVela miSegundoYateVela = new YateVela("Galgo","carlos santillan",manga,calado,9.0,tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		YateMotor miYateMotor = new YateMotor("AZ1","mariano regal",18.87,5.15, 119.0,37, 5500, 5959, "2x Mottores Diesel MAN Rk 2805", 9000, 23, 6500);
		
		// Ejecucion
		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miSegundoYateVela);
		miFondeadero.amarrarUnYate(miYateMotor);
		miFondeadero.ordenarYatesPorEslora();
		Yate valorObtenido = miFondeadero.miPrimerYate();
		Yate valorEsperado = miSegundoYateVela;
		//Contrastación	
		assertEquals(valorObtenido, valorEsperado );
	}
		
}
