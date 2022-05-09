public class DispositivosDeSeguranca {
    protected String id;
    protected String tipo;
    protected static String[] presencaDetectada;
    protected static boolean movimentacaoSuspeita;
    
    //criamos o construtor da classe
    public DispositivosDeSeguranca(String id, String tipo, String[] presencaDetectada, boolean movimentacaoSuspeita){
        this.setId(id);
        this.setTipo(tipo);
        this.setPresencaDetactada(presencaDetectada);
        this.setMovimentacaoSuspeita(movimentacaoSuspeita);
    }

    //criamos os metodos get
    public String getId(){
        return this.id;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String[] getPresencaDetactada(){
        return this.presencaDetectada;
    }

    public boolean getMovimentacaoSuspeita(){
        return this.movimentacaoSuspeita;
    }

    //criamos os metodos set
    public void setId(String id){
        if(id == null || id.length() == 0){
            return;
        }
        this.id = id;
    }

    public void setTipo(String tipo){
        if(tipo == null || tipo.length() == 0){
            return;
        }
        this.tipo = tipo;
    }

    public void setPresencaDetactada(String[] presencaDetectada){
        if(presencaDetectada.length < 0){
            return;
        }
        this.presencaDetectada = presencaDetectada;
    }

    public void setMovimentacaoSuspeita(boolean movimentacaoSuspeita){
        this.movimentacaoSuspeita = movimentacaoSuspeita;
    }
}
