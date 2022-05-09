package Questao3;

public class VeiculoSemiEletrico extends CarroComum {
	
	private Motor motorAux;
	
	public void getMotorAux() {
		System.out.println( 
		"Quando a 60km/h será utilizado o motor auxiliar: ");
		motorAux.getDadosMotor();
	}

	public void setMotorAux(Motor motorAux2) {
		this.motorAux = motorAux2;
	}
	
	public VeiculoSemiEletrico(String fabricante, String modelo, int anoFabricacao, Motor motor, Motor motorAux) {
		super(fabricante,modelo,anoFabricacao,motor);
		this.setMotorAux(motorAux);
	}
}
