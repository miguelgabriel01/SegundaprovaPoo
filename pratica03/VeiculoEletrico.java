package Questao3;

public class VeiculoEletrico extends CarroComum {
	
	private String tipoBateria;

	public String getTipoBateria() {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	
	public VeiculoEletrico(String fabricante, String modelo, int anoFabricacao, Motor motor, String tipoBateria) {
		super(fabricante,modelo,anoFabricacao,motor);
		this.setTipoBateria(tipoBateria);
	}
	
}
