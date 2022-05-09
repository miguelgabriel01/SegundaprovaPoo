public class Cameras extends DispositivosDeSeguranca{
    
    //criamos o construtor da classe
    public Cameras(String id, String tipo, String[] presencaDetectada, boolean movimentacaoSuspeita){
        super(id,tipo,presencaDetectada,movimentacaoSuspeita);
    }

    //instanciamos a classe
    public static Cameras informacoesSobreCamera(){
        Cameras cameraInfo = new Cameras("2022mgl8767", "Camera de monitoramento",new String[]{"negativo","negativo","negativo","negativo","negativo","positivo"}, true);

            return cameraInfo;
        }
 
    //metodo para verificar os dados da camera e mudar o status sobre movimentações suspeitas
     public static void verificarDispositivo(){
        for(String i : presencaDetectada){
            if(i == "positivo"){
                //mudamos o status para true
                movimentacaoSuspeita = true; 
            }
        }
    }
}
