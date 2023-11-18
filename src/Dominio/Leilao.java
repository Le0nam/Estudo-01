package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Leilao extends BaseIdentificador{
    private String produto;
    private double preco;
    private LocalDate dataLimete;
    private Usuario dono;
    private ArrayList<Lance> listaDeLances;
    private boolean situacao;

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
    public ArrayList<Lance> getListaDeLances() {
        return listaDeLances;
    }
    public void setListaDeLances(ArrayList<Lance> listaDeLances) {
        this.listaDeLances = listaDeLances;
    }
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Leilao(int id, String produto, double preco, LocalDate dataLimete, boolean situacao) {
        super(id);
        this.produto = produto;
        this.preco = preco;
        this.dataLimete = dataLimete;
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Leilao [id=" + id + "produto=" + produto + ", preco=" + preco + ", dataLimete="
         + dataLimete + ", dono=" + dono + ", listaDeLances=" + listaDeLances + ", situacao=" + situacao + "]";
    }    
}
