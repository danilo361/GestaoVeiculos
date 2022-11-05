package Model;
@SuppressWarnings("serial")
public class Usuario {

    private String pk_usuario;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String tipo;
    private String status;

    public Usuario(String pk_usuario, String nome, String sobrenome, String email, String senha, String tipo) {
        this.pk_usuario = pk_usuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Usuario() {
        this.pk_usuario = "0";
        this.nome = "";
        this.sobrenome = "";
        this.email = "";
        this.senha = "senha";
        this.tipo = "Usuário";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPk_usuario() {
        return pk_usuario;
    }

    public void setPk_usuario(String pk_usuario) {
        this.pk_usuario = pk_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String preparaInsert() {
        String aux = "insert into usuario (nome,sobrenome,tipo,senha,status,email) values ('"
                + this.nome + "','"
                + this.sobrenome + "','"
                + this.tipo + "','"
                + this.senha + "','"
                 + this.status + "','"
                + this.email + "')";
        return aux;
    }

    public String preparaDelte() {
        String aux = "delete from  usuario where pk_usuario=" + this.pk_usuario;

        return aux;
    }

    public String preparaUpdate() {
        String aux = "update usuario set "
                + "nome='" + this.nome + "' , "
                + "sobrenome='" + this.sobrenome + "' , "
                + "tipo='" + this.tipo + "' , "
                + "senha='" + this.senha + "' , "
                + "email='" + this.email
                + "' where pk_usuario=" + this.pk_usuario;
        return aux;
    }

}
