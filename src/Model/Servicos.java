package Model;
@SuppressWarnings("serial")
public class Servicos {

    private String pk_servico;
    private String fk_veiculo;
    private String fk_prestadora;
    private String nome_servico;
    private String descricao;
    private String valor_peca;
    private String valor_maobra;
    private String nome_peca;
    private String valor_total;
    private String data;

    public Servicos(String pk_servico, String fk_veiculo, String fk_prestadora, String nome, String descricao, String valor_peca, String data,String nome_peca,String valor_maobra, String valor_total) {
        this.pk_servico = pk_servico;
        this.fk_veiculo = fk_veiculo;
        this.fk_prestadora = fk_prestadora;
        this.nome_servico = nome;
        this.descricao = descricao;
        this.valor_peca = valor_peca;
        this.nome_peca=nome_peca;
        this.valor_maobra= valor_maobra;
        this.valor_total=valor_total;
        this.data = data;
        
    }

    public Servicos() {
        this.pk_servico = "0";
        this.fk_veiculo = "";
        this.fk_prestadora = "";
        this.nome_servico = "";
        this.descricao = "";
        this.valor_peca = "";
        this.valor_maobra="";
        this.valor_total="";
        this.nome_peca="";
        this.data="";
    }

   

  

    public String preparaInsertServicos() {
        
    String aux = "insert into servicos(fk_veiculo,fk_prestadora, nome_servico, descricao, valor_peca, valor_total, nome_peca,valor_maobra,data)"+
"SELECT pk_veiculo,pk_prestadora,"+"'"
            + this.nome_servico + "','"
                + this.descricao + "','"
                + this.valor_peca + "','"
                + this.valor_total + "','"
                + this.nome_peca + "','"
             + this.valor_maobra + "','"
                + this.data +  "'"
+" FROM veiculo, prestadora WHERE placa="+"'"+this.fk_veiculo+"'"+" and  nome=" +"'"+this.fk_prestadora+"';";
        

       
        return aux;
        
    }

    public String preparaDelte() {
        String aux = "delete from  servicos where pk_servico=" + this.pk_servico;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update servicos set "
                + "fk_veiculo='" + this.fk_veiculo + "' , "
                + "fk_prestadora='" + this.fk_prestadora + "' , "
                + "valor_peca='" + this.valor_peca + "' , "
                  + "valor_maobra='" + this.valor_maobra + "' , "
                 + "valor_total='" + this.valor_total + "' , "
                 + "nome_peca='" + this.nome_peca + "' , "
                + "descricao='" + this.descricao + "' , "
                 + "data='" + this.data + "' , "
                + "nome_servico='" + this.nome_servico
                + "' where pk_servico=" + this.pk_servico;
        return aux;
    }

    public String getPk_servico() {
        return pk_servico;
    }

    public void setPk_servico(String pk_servico) {
        this.pk_servico = pk_servico;
    }

    public String getValor_peca() {
        return valor_peca;
    }

    public String getValor_maobra() {
        return valor_maobra;
    }

    public void setValor_maobra(String valor_maobra) {
        this.valor_maobra = valor_maobra;
    }

    
    public void setValor_peca(String valor_peca) {
        this.valor_peca = valor_peca;
    }

    public String getNome_peca() {
        return nome_peca;
    }

    public void setNome_peca(String nome_peca) {
        this.nome_peca = nome_peca;
    }

    public String getValor_total() {
        return valor_total;
    }

    public void setValor_total(String valor_total) {
        this.valor_total = valor_total;
    }

    public String getFk_veiculo() {
        return fk_veiculo;
    }

    public void setFk_veiculo(String fk_veiculo) {
        this.fk_veiculo = fk_veiculo;
    }

    public String getFk_prestadora() {
        return fk_prestadora;
    }

    public void setFk_prestadora(String fk_prestadora) {
        this.fk_prestadora = fk_prestadora;
    }

    public String getNome() {
        return nome_servico;
    }

    public void setNome(String nome) {
        this.nome_servico = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}