package Dominio;

import java.time.LocalDate;

public class Job extends Leilao{

    public Job(int id, String produto, double preco, LocalDate dataLimete, boolean situacao) {
        super(id, produto, preco, dataLimete, situacao);
    }
    public void FeicharLeilao(){}

}
