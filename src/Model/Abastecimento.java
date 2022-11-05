package Model;
@SuppressWarnings("serial")
public class Abastecimento {

    private String pk_Abastecimento;
    private String fk_veiculo;
    private String fk_prestadora;
    private String tipo_Combustivel;
    private String forma_pagamento;
    private String qtd_litros;
    private String km_atual;
    private String valor_total;
    private String valor_litro;
    private String data;

    public Abastecimento(String pk_servico, String fk_veiculo, String fk_prestadora,String km_atual, String tipo_Combustivel, String forma_pagamento, String qtd_litros, String valor_litro, String valor_total,String data) {
        this.pk_Abastecimento = pk_servico;
        this.fk_veiculo = fk_veiculo;
        this.fk_prestadora = fk_prestadora;
        this.tipo_Combustivel = tipo_Combustivel;
        this.forma_pagamento = forma_pagamento;
        this.qtd_litros = qtd_litros;
        this.km_atual=  km_atual;
        this.valor_total=valor_total;
        this.valor_litro = valor_litro;
        this.data =data;
        
        
    }

    public Abastecimento() {
        this.pk_Abastecimento = "0";
        this.fk_veiculo = "";
        this.fk_prestadora = "";
        this.tipo_Combustivel = "";
        this.forma_pagamento = "";
        this.qtd_litros = "";
        this.km_atual="";
        this.valor_total="";
        this.valor_litro="";
        this.data="";
    }

   

  

    public String preparaInsertAbastecimento() {
        
    String aux = "insert into abastecimento(fk_veiculo,fk_prestadora, tipo_Combustivel, forma_pagamento, qtd_litros, valor_total, km_atual, data, valor_litro)"+
"SELECT pk_veiculo,pk_prestadora,"+"'"
            + this.tipo_Combustivel + "','"
                + this.forma_pagamento + "','"
                + this.qtd_litros + "','"
                + this.valor_total + "','"
             + this.km_atual + "','"
            + this.data + "','"
                + this.valor_litro +  "'"
+" FROM veiculo, prestadora where placa="+"'"+this.fk_veiculo+"'"+" and  nome=" +"'"+this.fk_prestadora+"';";
        

       
        return aux;
        
    }

    public String preparaDelte() {
        String aux = "delete from abastecimento where pk_abastecimento=" + this.pk_Abastecimento;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update servicos set "
                + "fk_veiculo='" + this.fk_veiculo + "' , "
                + "fk_prestadora='" + this.fk_prestadora + "' , "
                + "qtd_litros='" + this.qtd_litros + "' , "
                  + "km_atual='" + this.km_atual + "' , "
                 + "valor_total='" + this.valor_total + "' , "
                + "forma_pagamento='" + this.forma_pagamento + "' , "
                 + "valor_litro='" + this.valor_litro + "' , "
                 + "data='" + this.data + "' , "
                + "tipo_Combustivel='" + this.tipo_Combustivel
                + "' where pk_abastecimento=" + this.pk_Abastecimento;
        return aux;
    }

    public String getPk_Abastecimento() {
        return pk_Abastecimento;
    }

    public void setPk_Abastecimento(String pk_Abastecimento) {
        this.pk_Abastecimento = pk_Abastecimento;
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

    public String getTipo_Combustivel() {
        return tipo_Combustivel;
    }

    public void setTipo_Combustivel(String tipo_Combustivel) {
        this.tipo_Combustivel = tipo_Combustivel;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getQtd_litros() {
        return qtd_litros;
    }

    public void setQtd_litros(String qtd_litros) {
        this.qtd_litros = qtd_litros;
    }

    public String getKm_atual() {
        return km_atual;
    }

    public void setKm_atual(String km_atual) {
        this.km_atual = km_atual;
    }

    public String getValor_total() {
        return valor_total;
    }

    public void setValor_total(String valor_total) {
        this.valor_total = valor_total;
    }

    public String getValor_litro() {
        return valor_litro;
    }

    public void setValor_litro(String valor_litro) {
        this.valor_litro = valor_litro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

  

}