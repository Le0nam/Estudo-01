package Dominio;

import java.time.LocalDate;

public class Job extends Leilao{

    public Job(int id, String produto, double preco, LocalDate dataLimete, String listaDeLances) {
        super(id, produto, preco, dataLimete, listaDeLances);
    }

    public double FeicharLeilao(){
        return id;}

}
