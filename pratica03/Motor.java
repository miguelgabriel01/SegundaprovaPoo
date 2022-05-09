package Questao3;

public class Motor {
	
	private String fabricante;
	private String potencia;
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	public void getDadosMotor() {
		System.out.println("Fabricante: "+
		getFabricante()+"\n"+
		"Potencia: "+ getPotencia()+"\n");
	}
	
	public Motor(String fabricante, String potencia) {
		this.setFabricante(fabricante);
		this.setPotencia(potencia);
	}
}
