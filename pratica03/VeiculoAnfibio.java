package Questao3;

public class VeiculoAnfibio extends CarroComum {

	private String pecasAdaptadas;

	public String getPecasAdaptadas() {
		return pecasAdaptadas;
	}

	public void setPecasAdaptadas(String pecasAdaptadas) {
		this.pecasAdaptadas = pecasAdaptadas;
	}
	
	public VeiculoAnfibio(String fabricante, String modelo, int anoFabricacao, Motor motor,String pecasAdaptadas) {
		super(fabricante,modelo,anoFabricacao,motor);
		this.setPecasAdaptadas(pecasAdaptadas);
	}
}
