package Model;
@SuppressWarnings("serial")
public class Roda {

    private String pk_roda;
    private String posicao;
    private String fk_veiculo;
    private String fk_pneu;
  

    public Roda(String pk_roda, String posicao, String fk_veiculo, String fk_pneu) {
        this.pk_roda = pk_roda;
        this.posicao = posicao;
        this.fk_veiculo = fk_veiculo;
        this.fk_pneu = fk_pneu;
       
    }


    public Roda() {
        this.pk_roda = "0";
        this.posicao = "";
        this.fk_veiculo = "";
        this.fk_pneu = "";
       
    }

  

    public String preparaInsert() {
        String aux = "insert into roda (posicao, fk_veiculo,fk_pneu) values ('"
                + this.posicao + "','"
                + this.fk_veiculo + "','"
                + this.fk_pneu + "';)";
        return aux;
    }

    public String preparaDelte() {
        String aux = "delete from roda where pk_roda=" + this.pk_roda;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update pneu set "
                + "posicao='" + this.posicao + "' , "
                + "fk_veiculo='" + this.fk_veiculo + "' , "
                + "fk_pneu='" + this.fk_pneu + "'  "
                + " where pk_pneu=" + this.pk_roda;
       
        return aux;
    }

    public String getPk_roda() {
        return pk_roda;
    }

    public void setPk_roda(String pk_roda) {
        this.pk_roda = pk_roda;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getFk_veiculo() {
        return fk_veiculo;
    }

    public void setFk_veiculo(String fk_veiculo) {
        this.fk_veiculo = fk_veiculo;
    }

    public String getFk_pneu() {
        return fk_pneu;
    }

    public void setFk_pneu(String fk_pneu) {
        this.fk_pneu = fk_pneu;
    }
    
    
    
   

}
