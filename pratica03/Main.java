package Questao3;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tipoCarro;
		
		System.out.println("Selecione o carro desejado:");
		System.out.println("Digite 1 para Carro Anfíbio, Adaptável");
		System.out.println("Digite 2 para Carro Elétrico, Econômico");
		System.out.println("Digite 3 para Carro Semi Elétrico, Econômico em situações específicas");
		System.out.println("Digite qualquer tecla para o Carro Comum");
		
		tipoCarro = scanner.nextInt();
		
		if(tipoCarro == 1) {
			Motor motor = new Motor("ViperX","15000CZ");
			VeiculoAnfibio carro = new VeiculoAnfibio("Tesla","Zunp",2021,motor,"Peças adaptáveis para terra e água");
			System.out.printf("Informações do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informações do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informações adicionais\n"+
			carro.getPecasAdaptadas()+"\n");
			
		} else if (tipoCarro == 2) {
			
			Motor motor = new Motor("VTX","35000CZ");
			VeiculoEletrico carro = new VeiculoEletrico("Fiat","Corvett",2017,motor,"íons de lítio");
			System.out.printf("Informações do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informações do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informações adicionais\n"+
			"tipo da bateria: " + carro.getTipoBateria());
			
		} else if (tipoCarro == 3) {
			
			Motor motor = new Motor("V3CB","25000CZ");
			Motor motorAux = new Motor("RLX2000","1000CZ");
			VeiculoSemiEletrico carro = new VeiculoSemiEletrico("Mercedez","F-VSZ",2020,motor,motorAux);
			System.out.printf("Informações do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informações do motor\n");
			motor.getDadosMotor();
			System.out.printf("Informações adicionais\n");
			carro.getMotorAux();
			
		} else {
			
			Motor motor = new Motor("PoneiLand","1000CZ");
			CarroComum carro = new CarroComum("Classic","Fusca",2000,motor);
			System.out.printf("Informações do carro\n"); 
			carro.getDadosCarro();
			System.out.printf("Informações do motor\n");
			motor.getDadosMotor();
		}
	}
}