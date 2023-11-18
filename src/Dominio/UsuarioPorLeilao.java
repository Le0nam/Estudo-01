package Dominio;

public class UsuarioPorLeilao extends BaseIdentificador{
    private int codigoLeilao;
    private int codigoUsuario;

    public int getCodigoLeilao() {
        return codigoLeilao;
    }
    public void setCodigoLeilao(int codigoLeilao) {
        this.codigoLeilao = codigoLeilao;
    }
    public int getCodigoUsuario() {
        return codigoUsuario;
    }
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    public UsuarioPorLeilao(int id, int codigoLeilao, int codigoUsuario) {
        super(id);
        this.codigoLeilao = codigoLeilao;
        this.codigoUsuario = codigoUsuario;
    }
    
    
}
