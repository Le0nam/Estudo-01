package Dominio;

public class Usuario extends BaseIdentificador{
    private String nome;
    private String email;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Usuario(int id, String nome, String email) {
        super(id);
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return "BaseIdentificador [id=" + id + "]" + "Usuario [nome=" + nome + ", email=" + email + "]";
    }
    
    
}
