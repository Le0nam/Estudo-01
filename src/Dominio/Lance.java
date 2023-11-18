package Dominio;

public class Lance extends BaseIdentificador{
    private int codigoUsuariocomprador;
    private int codigoLeilaoleilao;
    private double valor;

    public int getCodigoUsuariocomprador() {
        return codigoUsuariocomprador;
    }
    public void setCodigoUsuariocomprador(int codigoUsuariocomprador) {
        this.codigoUsuariocomprador = codigoUsuariocomprador;
    }
    public int getCodigoLeilaoleilao() {
        return codigoLeilaoleilao;
    }
    public void setCodigoLeilaoleilao(int codigoLeilaoleilao) {
        this.codigoLeilaoleilao = codigoLeilaoleilao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Lance(int id, int codigoUsuariocomprador, int codigoLeilaoleilao, double valor) {
        super(id);
        this.codigoUsuariocomprador = codigoUsuariocomprador;
        this.codigoLeilaoleilao = codigoLeilaoleilao;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Lance [id=" + id + "codigoUsuariocomprador=" + codigoUsuariocomprador + ", codigoLeilaoleilao=" + codigoLeilaoleilao
                + ", valor=" + valor + "]";
    }
}
