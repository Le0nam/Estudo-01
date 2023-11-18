package Dominio;

import java.time.LocalDate;

public class Leilao extends BaseIdentificador{
    private String produto;
    private double preco;
    private LocalDate dataLimete;
    private Usuario dono;
    private String listaDeLances;
    
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public LocalDate getDataLimete() {
        return dataLimete;
    }
    public void setDataLimete(LocalDate dataLimete) {
        this.dataLimete = dataLimete;
    }
    public Usuario getDono() {
        return dono;
    }
    public void setDono(Usuario dono) {
        this.dono = dono;
    }
    public String getListaDeLances() {
        return listaDeLances;
    }
    public void setListaDeLances(String listaDeLances) {
        this.listaDeLances = listaDeLances;
    }

    public Leilao(int id, String produto, double preco, LocalDate dataLimete, String listaDeLances) {
        super(id);
        this.produto = produto;
        this.preco = preco;
        this.dataLimete = dataLimete;
        this.listaDeLances = listaDeLances;
    }
}
