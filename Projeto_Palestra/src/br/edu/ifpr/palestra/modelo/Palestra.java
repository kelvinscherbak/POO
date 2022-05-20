package br.edu.ifpr.palestra.modelo;



public class Palestra {
	protected String tema;
	protected String diaHora;
	protected boolean exigeFrequencia;
	
	public Palestra(String tema,String diaHora, boolean exigeFrequencia) {
		this.tema = tema;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
		
	}
}
