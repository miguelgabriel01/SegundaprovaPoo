package Questao3;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tipoCarro;
		
		System.out.println("Selecione o carro desejado:");
		System.out.println("Digite 1 para Carro Anf�bio, Adapt�vel");
		System.out.println("Digite 2 para Carro El�trico, Econ�mico");
		System.out.println("Digite 3 para Carro Semi El�trico, Econ�mico em situa��es espec�ficas");
		System.out.println("Digite qualquer tecla para o Carro Comum");
		
		tipoCarro = scanner.nextInt();
		
		if(tipoCarro == 1) {
			Motor motor = new Motor("ViperX","15000CZ");
			VeiculoAnfibio carro = new VeiculoAnfibio("Tesla","Zunp",2021,motor,"Pe�as adapt�veis para terra e �gua");
			System.out.printf("Informa��es do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informa��es do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informa��es adicionais\n"+
			carro.getPecasAdaptadas()+"\n");
			
		} else if (tipoCarro == 2) {
			
			Motor motor = new Motor("VTX","35000CZ");
			VeiculoEletrico carro = new VeiculoEletrico("Fiat","Corvett",2017,motor,"�ons de l�tio");
			System.out.printf("Informa��es do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informa��es do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informa��es adicionais\n"+
			"tipo da bateria: " + carro.getTipoBateria());
			
		} else if (tipoCarro == 3) {
			
			Motor motor = new Motor("V3CB","25000CZ");
			Motor motorAux = new Motor("RLX2000","1000CZ");
			VeiculoSemiEletrico carro = new VeiculoSemiEletrico("Mercedez","F-VSZ",2020,motor,motorAux);
			System.out.printf("Informa��es do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informa��es do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informa��es adicionais\n");
			carro.getMotorAux();
			
		} else {
			
			Motor motor = new Motor("PoneiLand","1000CZ");
			CarroComum carro = new CarroComum("Classic","Fusca",2000,motor);
			System.out.printf("Informa��es do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informa��es do motor\n");
			motor.getDadosMotor();
		}
	}
}