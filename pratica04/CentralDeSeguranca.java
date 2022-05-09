import java.util.Scanner;

public class CentralDeSeguranca {
    protected static Integer horarioDeVarreduraDoEspaco;
    protected static String mensagemDeEmergencia;


    public CentralDeSeguranca(Integer horarioDeVarreduraDoEspaco, String mensagemDeEmergencia){
        this.setHorarioDeVarreduraDoEspaco(horarioDeVarreduraDoEspaco);
        this.setMensagemDeEmergencia(mensagemDeEmergencia);
    }

    
    //criamos os metodos get
    public Integer getHorarioDeVarreduraDoEspaco(){
        return this.horarioDeVarreduraDoEspaco;
    }

    public String getMensagemDeEmergencia(){
        return this.mensagemDeEmergencia;
    }

    //criamos os metodos set
    public void setHorarioDeVarreduraDoEspaco(Integer horarioDeVarreduraDoEspaco){
        if(horarioDeVarreduraDoEspaco <=0){
            return;
        }
        this.horarioDeVarreduraDoEspaco = horarioDeVarreduraDoEspaco;
    }

    public void setMensagemDeEmergencia(String mensagemDeEmergencia){
        if(mensagemDeEmergencia == null || mensagemDeEmergencia.length() == 0){
            return;
        }
        this.mensagemDeEmergencia = mensagemDeEmergencia;
    }


    public static CentralDeSeguranca centralDeSegurancaInfo(){
        CentralDeSeguranca centralInfo = new CentralDeSeguranca(1,"Risco de invasao eminente!!!");

        return centralInfo;
    }

    static ContatosDeEmergencia contatosDeEmergenciaInfo = ContatosDeEmergencia.informacoesSobreContatosDeEmergencia();
    static Cameras cameraStatusInfo = Cameras.informacoesSobreCamera();
    static DetectoresDeMovimentos detectorDeMovimentoInfo = DetectoresDeMovimentos.informacoesSobreDetectorDeMovimento();
    static SensoresDeCalor sensorDeCalorInfo = SensoresDeCalor.informacoesSobreSensorDeCalor();

    public static void iniciarverificacaoDeseguranca(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE VARREDURA INCIADO");
        System.out.println("....................");
        System.out.println("....................");
        System.out.println(".....lOADING........");
        System.out.println("....................");
        System.out.println("....................");

        System.out.println(" ");
        System.out.println("VERIFICANDO DIGITAL....");
        System.out.println(" ");
        System.out.println("DIGITAL OK.");
        System.out.println(" ");

        System.out.println("Digite Sua Senha: ");
        Integer senha = scanner.nextInt();
        System.out.println(" ");




            if(senha == 123456 && cameraStatusInfo.getMovimentacaoSuspeita() == true || detectorDeMovimentoInfo.getMovimentacaoSuspeita() == true || sensorDeCalorInfo.getMovimentacaoSuspeita() == true){

                System.out.println("POSSIVEL INVASOR NO LOCAL!!!");
                System.out.println(" ");
    
                System.out.println("...........................................");
                System.out.println("...........................................");
                System.out.println(".....INICIANDO PROTOCOLOS DE SEGURANCA.....");
                System.out.println("...........................................");
                System.out.println("...........................................");
                System.out.println(" ");

                System.out.println("Enviando Mensagem de Emergencia:");
                System.out.println("Mensagem: " + mensagemDeEmergencia);
                System.out.println(" ");
        
                for(String i : contatosDeEmergenciaInfo.getNumeros()){
                    System.out.println("Numero: " + i + " ...");
                }
                System.out.println("------------------------------");
                System.out.println(" ");

                System.out.println("Ligando Para Os responsaveis:");
                System.out.println(" ");
        
                for(String i : contatosDeEmergenciaInfo.getNumeros()){
                    System.out.println("Numero: " + i + " discando...");
                }
                System.out.println("------------------------------");
                System.out.println(" ");

                System.out.println("Enviando emails Para Os responsaveis:");
                System.out.println(" ");
        
                for(String i : contatosDeEmergenciaInfo.getemails()){
                    System.out.println(" ");
                    System.out.println("Email: " + i);
                    System.out.println("Mensagem: " + mensagemDeEmergencia);
                    System.out.println(" ");
                }
                System.out.println("------------------------------");
                System.out.println(" ");

                System.out.println("RELATORIO DE DISPOSITIVOS");
                System.out.println(" ");
                if(cameraStatusInfo.getMovimentacaoSuspeita() == true){
                    
                }if(detectorDeMovimentoInfo.getMovimentacaoSuspeita() == true){

                }if(sensorDeCalorInfo.getMovimentacaoSuspeita() == true){

                }

            }else{
            System.out.println("CREDENCIAIS INCORRETAS ");
        }
    }
 
    
    public static void main(String[] args){


        CentralDeSeguranca centralDeSegurancaInfo = CentralDeSeguranca.centralDeSegurancaInfo();
        CentralDeSeguranca.iniciarverificacaoDeseguranca();
        System.out.println("Horario da consulta: " + centralDeSegurancaInfo.getHorarioDeVarreduraDoEspaco() + "HORA");

        System.out.println("CAMERA");
        if(cameraStatusInfo.getMovimentacaoSuspeita() == true){
            System.out.println("POSSIVEL INVASOR NO LOCAL!!!");
            System.out.println("");
        }else{
            System.out.println("SEGURO!!!!");
            System.out.println("");
        }

        System.out.println("SENSOR DE MOVIMENTO");
        if(detectorDeMovimentoInfo.getMovimentacaoSuspeita() == true){
            System.out.println("POSSIVEL INVASOR NO LOCAL!!!");
            System.out.println("");
        }else{
            System.out.println("SEGURO!!!!");
            System.out.println("");
        }

        System.out.println("DETECTOR DE MOVIMENTO");
        if(sensorDeCalorInfo.getMovimentacaoSuspeita() == true){
            System.out.println("POSSIVEL INVASOR NO LOCAL!!!");
            System.out.println("");
        }else{
            System.out.println("SEGURO!!!!");
            System.out.println("");
        }
        System.out.println("MEDIDAS DE SEGURANÇA INTERNAS: ");
        System.out.println(" ");
        System.out.println("ATIVANDO SIRENES");
        System.out.println("------------------------------");

    }
}
