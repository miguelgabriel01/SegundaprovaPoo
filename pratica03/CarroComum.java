package Questao3;

public class CarroComum {
	
	private String fabricante;
	private String modelo;
	private int anoFabricacao;
	private Motor motor;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public void getDadosCarro() {
		System.out.println( 
		"Fabricante: "+getFabricante() + "\n" + 
		"Modelo: "+getModelo() + "\n" + 
		"Ano: "+getAnoFabricacao() + "\n");
	}
	
	public CarroComum(String fabricante, String modelo, int anoFabricacao, Motor motor) {
		this.setFabricante(fabricante);
		this.setModelo(modelo);
		this.setAnoFabricacao(anoFabricacao);
		this.setMotor(motor);
	}
}
