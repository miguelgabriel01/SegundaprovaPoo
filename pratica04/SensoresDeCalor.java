public class SensoresDeCalor extends DispositivosDeSeguranca{
    protected static Integer horarioAtual;
    static EspacoMonitorado statusPossibilidadeDepessoasNoLocal = EspacoMonitorado.informacoesSobreEspacoMonitorado();

    //criamos o construtor da classe
    public SensoresDeCalor(String id, String tipo, String[] presencaDetectada, boolean movimentacaoSuspeita, Integer horarioAtual){
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

    //instanciamos a classe
    public static SensoresDeCalor informacoesSobreSensorDeCalor(){
        SensoresDeCalor sensorDeCalorInfo = new SensoresDeCalor("2022mg764539", "Sensor De Movimento",new String[]{"negativo","negativo","negativo","negativo","negativo","positivo"}, false,20);
        SensoresDeCalor.verificarDispositivo();
            return sensorDeCalorInfo;
        }
 
     //metodo para verificar os dados da camera e mudar o status sobre movimentações suspeitas
     public static void verificarDispositivo(){
     //   System.out.println("verificar se uma pessoa pode estar dentro do local: " + statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas());
        if(statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas() == "SIM"){
          //  System.out.println("Entrou no if");
            movimentacaoSuspeita = false;
         //   System.out.println(movimentacaoSuspeita);
        }else if(statusPossibilidadeDepessoasNoLocal.getPermitidoPermanenciaDepessoas() == "NAO"){
          //  System.out.println("Entrou no else if");

            for(String i : presencaDetectada){
                if(i == "positivo"){
                    //mudamos o status para true
                //    System.out.println("Entrou no for");
                    movimentacaoSuspeita = true; 
                }
            } 
        }
    }   
}
