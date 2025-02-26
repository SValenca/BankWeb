package domain.model;


public class Pessoa {
    private String nome;
    private String cpf;
    private String cnpj;
    private String dataNasc;
    private String email;
    private String tel;
     
    public Pessoa(String nome, String email, String tel )throws Exception{
        this.setNome(nome);     // ou this.nome = nome
        this.setEmail(email);   // ou this.email = email
        this.setTel(tel);       // ou this.tel = tel
    }
                                                                        //.TRIM ele apaga os espaços do texto (Sempre que manipular String deve usar )
    public void setNome(String nome)throws Exception{                   //O método .EQUALS é utilizado para comparações.
        if (nome.trim().equals(""))                            //THROWS (com S no final) é usada em um método para informar ao código de chamada (quem chamou seu método)
            throw new Exception("nome em branco!");             //que esse método pode gerar uma exceção (dentro dele tem algum código que gera exception) e que 
        this.nome = nome.trim();                                        //o próprio método não trata (não tem try/catch).  
            
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setdataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setTel(String tel){
        this.tel = tel;
    }
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public String getDataNasc(){
        return this.dataNasc;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getTel(){
        return this.tel;
    }
        
}
