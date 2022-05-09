public class DetectoresDeMovimentos extends DispositivosDeSeguranca{
    protected static Integer horarioAtual;
    static EspacoMonitorado statusPossibilidadeDepessoasNoLocal = EspacoMonitorado.informacoesSobreEspacoMonitorado();

    //criamos o construtor da classe
    public DetectoresDeMovimentos(String id, String tipo, String[] presencaDetectada, boolean movimentacaoSuspeita, Integer horarioAtual){
        super(id,tipo,presencaDetectada,movimentacaoSuspeita);
        this.setHorarioAtual(horarioAtual);
    }

    //criamos o metodo get
    public Integer getHorarioAtual(){
        return this.horarioAtual;
    }

    //criamos os metodos set
    public void setHorarioAtual(Integer horarioAtual){
        if(horarioAtual <= 0){
            return;
        }
        this.horarioAtual = horarioAtual;
    }

     //metodo para verificar os dados da camera e mudar o status sobre movimentações suspeitas
    public static void verificarDispositivo(){
        //System.out.println("verificar se uma pessoa pode estar dentro do local: " + statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas());
        if(statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas() == "SIM"){
            //System.out.println("Entrou no if");
            movimentacaoSuspeita = false;
           // System.out.println(movimentacaoSuspeita);
        }else if(statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas() == "NAO"){
           // System.out.println("Entrou no else if");

            for(String i : presencaDetectada){
                if(i == "positivo"){
                    //mudamos o status para true
                //    System.out.println("Entrou no for");
                    movimentacaoSuspeita = true; 
                }
            } 
        }
    }   
 

    //instanciamos a classe
    public static DetectoresDeMovimentos informacoesSobreDetectorDeMovimento(){
        DetectoresDeMovimentos detectoresDeMovimentosInfo = new DetectoresDeMovimentos("2022mg111999", "Detector de Movimneto",new String[]{"negativo","negativo","negativo","negativo","negativo","positivo"}, false,20);
        DetectoresDeMovimentos.verificarDispositivo();
             return detectoresDeMovimentosInfo;
    }
}