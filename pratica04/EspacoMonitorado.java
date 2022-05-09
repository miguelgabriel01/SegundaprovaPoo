public class EspacoMonitorado {
   protected static Integer horarioDeAbertura;
   protected static Integer horarioDeFechamento;
   protected static String permitidoPermanenciaDepessoas;
   static CentralDeSeguranca infoHoracentralDeSeguranca = CentralDeSeguranca.centralDeSegurancaInfo();
   
   //criamos o construtor da classe
   public EspacoMonitorado(Integer horarioDeAbertura, Integer horarioDeFechamento, String permitidoPermanenciaDepessoas){
       this.setHorarioDeAbertura(horarioDeAbertura);
       this.setHorarioDeFechamento(horarioDeFechamento);
       this.setPermitidoPermanenciaDepessoas(permitidoPermanenciaDepessoas);
   }

   //criamos os metodos get
   public Integer getHorarioDeAbertura(){
        return this.horarioDeAbertura;
   }

   public Integer getHorarioDeFechamento(){
       return this.horarioDeFechamento;
   }

   public String getPermitidoPermanenciaDepessoas(){
       return this.permitidoPermanenciaDepessoas;
   }

   //criamos os metodos set
   public void setHorarioDeAbertura(Integer horarioDeAbertura){
       if(horarioDeAbertura <= 0){
           return;
       }
       this.horarioDeAbertura = horarioDeAbertura;
   }

   public void setHorarioDeFechamento(Integer horarioDeFechamento){
       if(horarioDeFechamento <= 0){
            return;
        }
        this.horarioDeFechamento = horarioDeFechamento;
    }

    public void setPermitidoPermanenciaDepessoas(String permitidoPermanenciaDepessoas){
        this.permitidoPermanenciaDepessoas = permitidoPermanenciaDepessoas;
    }

    public static EspacoMonitorado informacoesSobreEspacoMonitorado(){
        EspacoMonitorado espacoMonitoradoInfo = new EspacoMonitorado(7,16,"SIM");

        /******************************************** */
        /******************************************** */
        /******************************************** */
        /******************************************** */

        //verificar se isso é correto e se não fere algum conceito de POO
        EspacoMonitorado.verificarSeHorarioEPermitido();
        
        /******************************************** */
        /******************************************** */
        /******************************************** */
        /******************************************** */
        /******************************************** */
        return espacoMonitoradoInfo;
    }


    public static void verificarSeHorarioEPermitido(){
        //System.out.println("HORARIO DA CENTRAL :" + infoHoracentralDeSeguranca.getHorarioDeVarreduraDoEspaco());
        Integer contadorDeHorarioPermitido = 0;
        for(Integer i = horarioDeAbertura; i<= horarioDeFechamento;i++){
            if(i != infoHoracentralDeSeguranca.getHorarioDeVarreduraDoEspaco()){
                //System.out.println("entrou no if" + i);
                permitidoPermanenciaDepessoas = "SIM";  
            }else if(i == infoHoracentralDeSeguranca.getHorarioDeVarreduraDoEspaco()){
                //System.out.println("entrou no else" + i);

                contadorDeHorarioPermitido++;
            }
        }
        //System.out.println("valor de contador: " + contadorDeHorarioPermitido);
        //verifico o contador e faço a alteração na possibilidade de pessoas dentro do espaço
        if(contadorDeHorarioPermitido > 0){
            //System.out.println("entrou em sim");
            permitidoPermanenciaDepessoas = "SIM";
        }else{
           // System.out.println("entrou em nAo");
             permitidoPermanenciaDepessoas = "NAO";
        }
    }

    

    public static void main(String[] args){

        EspacoMonitorado espacoInfo = EspacoMonitorado.informacoesSobreEspacoMonitorado();
       // EspacoMonitorado.verificarSeHorarioEPermitido();
        Cameras cameraStatusInfo = Cameras.informacoesSobreCamera();

        System.out.println("Horario de abertura: " + espacoInfo.getHorarioDeAbertura());
        System.out.println("Horario De Fechamento: " + espacoInfo.getHorarioDeFechamento());
        System.out.println("Permitido a permanencia de pessoas?: " + espacoInfo.getPermitidoPermanenciaDepessoas());
        System.out.println("Valor de horario vindo da casa de satanas: " + infoHoracentralDeSeguranca.getHorarioDeVarreduraDoEspaco());

        System.out.println("teste de valor vindo da camera");
        System.out.println(cameraStatusInfo.getMovimentacaoSuspeita());
    }
}
