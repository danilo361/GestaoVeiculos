package Model;
@SuppressWarnings("serial")
public class Veiculo {

    private String pk_veiculo;
    private String modelo;
    private String placa;
    private String ano;
    private String licenciamento;
    private String tipo;
    private String qtdEixos;

    public Veiculo(String pk_veiculo, String modelo, String placa, String ano, String licenciamento, String tipo, String qtdEixos) {
        this.pk_veiculo = pk_veiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.licenciamento = licenciamento;
        this.tipo = tipo;
        this.qtdEixos = qtdEixos;
    }

    public Veiculo() {
        this.pk_veiculo = "0";
        this.modelo = "";
        this.placa = "";
        this.ano = "";
        this.licenciamento = "";
        this.tipo = "";
        this.qtdEixos="";
    }

    public String getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(String qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public String getPk_veiculo() {
        return pk_veiculo;
    }

    public void setPk_veiculo(String pk_veiculo) {
        this.pk_veiculo = pk_veiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getLicenciamento() {
        return licenciamento;
    }

    public void setLicenciamento(String licenciamento) {
        this.licenciamento = licenciamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  

    public String preparaInsertVeiculo() {
        
        String aux = "insert into veiculo (modelo,placa,tipo,licenciamento,ano,qtdEixos) values ('"
                + this.modelo + "','"
                + this.placa + "','"
                + this.tipo + "','"
                + this.licenciamento + "','"
                 + this.ano + "','"
                + this.qtdEixos + "')";
       
        return aux;
        
    }

    public String preparaDelte() {
        String aux = "delete from  veiculo where pk_veiculo=" + this.pk_veiculo;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update veiculo set "
                + "modelo='" + this.modelo + "' , "
                + "placa='" + this.placa + "' , "
                + "tipo='" + this.tipo + "' , "
                + "licenciamento='" + this.licenciamento + "' , "
                 + "qtdEixos='" + this.qtdEixos + "' , "
                + "ano='" + this.ano
                + "' where pk_veiculo=" + this.pk_veiculo;
        return aux;
    }

}
