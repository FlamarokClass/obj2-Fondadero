package ar.edu.unahur.po2.amarras;

public class YateMotor extends Yate {
	/*
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Integer peso;
	*/
	private Integer desplazamiento;
	private String propulcion;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;
	private final static double PRECIO_TIPOAMARRA = 10000.0;

	public YateMotor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso, Integer desplazamiento, String propulcion, Integer potencia, Integer velocidad,Integer autonomia) {
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
		this.desplazamiento = desplazamiento;
		this.propulcion = propulcion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	/*
	public Double costeDeAmarre() {
		Double valorEslora = 0.0; 
		if(this.eslora <= 20) {
			valorEslora = 2000.0;
		}else {
			valorEslora = 3000.0;
		}
		return valorEslora + PRECIO_TIPOAMARRA ;
	}
	*/
	
	@Override
	protected Double getPrecioPorTipoYate() {
		return PRECIO_TIPOAMARRA;
	}


}
