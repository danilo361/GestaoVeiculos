package Model;
@SuppressWarnings("serial")
public class PrestadorServico {

    private String pk_prestadora;
    private String segmento;
    private String nome_servico;
    private String numero;
    private String telefone;
    private String cep;
    private String cnpj;
    private String endereco;
    

    public PrestadorServico(String pk_prestadora, String nome,String numero, String telefone, String cep, String cnpj, String endereco, String tipo) {
        this.pk_prestadora = pk_prestadora;
        this.nome_servico = nome;
        this.numero= numero;
        this.telefone = telefone;
        this.cep = cep;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.segmento = tipo;
    }


    public PrestadorServico() {
        this.pk_prestadora = "0";
        this.nome_servico = "";
        this.numero="";
        this.telefone = "";
        this.cep = "";
        this.cnpj = "";
        this.endereco = "";
       this.segmento="";
    }

  

    public String preparaInsert() {
        String aux = "insert into prestadora (segmento, nome,numero, telefone, cep, cnpj, endereco) values ('"
                 + this.segmento + "','"
                + this.nome_servico + "','"
                 + this.numero + "','"
                + this.telefone + "','"
                + this.cep + "','"
                + this.cnpj + "','"
                + this.endereco + "')";
        return aux;
    }

    public String preparaDelte() {
        String aux = "delete from prestadora where pk_prestadora=" + this.pk_prestadora;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update prestadora set "
                + "nome='" + this.nome_servico + "' , "
                 + "numero='" + this.numero + "' , "
                + "telefone='" + this.telefone + "' , "
                + "endereco='" + this.endereco + "' , "
                 + "segmento='" + this.segmento + "' , "
                + "cnpj='" + this.cnpj + "' , "
                 + "cep='" + this.cep + "'"
                + " where pk_prestadora=" + this.pk_prestadora;
       
        return aux;
    }

    public String getPk_prestadora() {
        return pk_prestadora;
    }

    public void setPk_prestadora(String pk_prestadora) {
        this.pk_prestadora = pk_prestadora;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getNome() {
        return nome_servico;
    }

    public void setNome(String nome) {
        this.nome_servico = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
  

}
