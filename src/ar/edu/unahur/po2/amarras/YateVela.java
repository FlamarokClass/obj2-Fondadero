package ar.edu.unahur.po2.amarras;

public class YateVela extends Yate {
	/*
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Integer peso;
	*/
	private Double alturaMastil;
	private Integer superficieVelicaMayor;
	private Integer superficieTotal;
	private final static double PRECIO_TIPOAMARRA = 9000.0;

	public YateVela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso, Double alturaMastil, Integer superficieVelicaMayor, Integer superficieTotal) {
		/*
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga =  manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
		*/
		super(nombre,duenio,manga,calado,eslora,tripulacion,peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

	/*
	public Double costeDeAmarre() {
		Double valorEslora = 0.0; 
		if(this.eslora <= 20) {
			valorEslora = 2000.0;
		}else {
			valorEslora = 3000.0;
		}
		return valorEslora + PRECIO_TIPOAMARRA  ;
	}
	*/
	
	@Override
	protected Double getPrecioPorTipoYate() {
		return PRECIO_TIPOAMARRA;
	}

}


