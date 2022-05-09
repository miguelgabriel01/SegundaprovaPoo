public class ContatosDeEmergencia {
    protected String[] numeros;
    protected String[] emails;     
    
    //criamos o construtor da class
    public ContatosDeEmergencia(String[] numeros, String[] emails){
        this.setNumeros(numeros);
        this.setEmails(emails);
    }

    //criamos os metodos get
    public String[] getNumeros(){
        return this.numeros;
    }

    public String[] getemails(){
        return this.emails;
    }

    //criamos os metodos set
    public void setNumeros(String[] numeros){
        if(numeros.length == 0 || numeros == null){
            return;
        }
        this.numeros = numeros;
    }
    
    public void setEmails(String[] emails){
        if(emails == null || emails.length == 0){
            return;
        }
        this.emails = emails;
    }

    public static ContatosDeEmergencia informacoesSobreContatosDeEmergencia(){
        ContatosDeEmergencia contatosDeEmergenciaInfo = new ContatosDeEmergencia(new String[]{"8199276515","8254362453","8197925433","8199876143","8199566789"},new String[]{"gabrielogabriel10@gmail.com","mgbs@discente.ifpe.edu.br","garielsantosdebarbosa@gmail.com","miguelgabriel@gmail.com"});
    
        return contatosDeEmergenciaInfo;
    }
}
