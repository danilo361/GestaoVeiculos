package Model;
@SuppressWarnings("serial")
public class Pneu {

    private String pk_pneu;
    private String fk_status;
    private String modelo;
    private String dimensoes;
    private String data_compra;
    private String dot;
    private String n_fogo;
     private String indice_carga;
     private String segmento_pneu;

    public Pneu(String pk_usuario, String nome, String sobrenome, String email, String senha, String tipo, String indice, String status, String segmento) {
        this.pk_pneu = pk_usuario;
        this.modelo = nome;
        this.dimensoes = sobrenome;
        this.data_compra = email;
        this.dot = senha;
        this.n_fogo = tipo;
        this.indice_carga = indice;
        this.fk_status = status;
        this.segmento_pneu = segmento;
    }


    public Pneu() {
        this.pk_pneu = "0";
        this.modelo = "";
        this.dimensoes = "";
        this.data_compra = "";
        this.dot = "";
        this.n_fogo = "";
        this.indice_carga="";
        this.segmento_pneu="";
    }

  

    public String preparaInsert() {
        String aux = "insert into pneu (fk_status, modelo,dimensoes,n_fogo,dot,data_compra,segmento_pneu,indice_carga) values ('"
                 + this.fk_status + "','"
                + this.modelo + "','"
                + this.dimensoes + "','"
                + this.n_fogo + "','"
                + this.dot + "','"
                 + this.data_compra + "','"
                 + this.segmento_pneu + "','"
                + this.indice_carga + "')";
        return aux;
    }

    public String preparaDelte() {
        String aux = "delete from pneu where pk_pneu=" + this.pk_pneu;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update pneu set "
                + "modelo='" + this.modelo + "' , "
                + "dimensoes='" + this.dimensoes + "' , "
                + "n_fogo='" + this.n_fogo + "' , "
                + "dot='" + this.dot + "' , "
                 + "data_compra='" + this.data_compra + "' , "
                 + "data_compra='" + this.segmento_pneu + "' , "
                + "indice_carga='" + this.indice_carga + "'  "
                + " where pk_pneu=" + this.pk_pneu;
       
        return aux;
    }

    public String getSegmento_pneu() {
        return segmento_pneu;
    }

    public void setSegmento_pneu(String segmento_pneu) {
        this.segmento_pneu = segmento_pneu;
    }
    
    
    
    public String getPk_pneu() {
        return pk_pneu;
    }

    public void setPk_pneu(String pk_pneu) {
        this.pk_pneu = pk_pneu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getN_fogo() {
        return n_fogo;
    }

    public void setN_fogo(String n_fogo) {
        this.n_fogo = n_fogo;
    }

    public String getIndice_carga() {
        return indice_carga;
    }

    public void setIndice_carga(String indice_carga) {
        this.indice_carga = indice_carga;
    }

    public String getFk_status() {
        return fk_status;
    }

    public void setFk_status(String fk_status) {
        this.fk_status = fk_status;
    }

}
