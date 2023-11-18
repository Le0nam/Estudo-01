package Dominio;


public abstract class BaseIdentificador {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseIdentificador(int id) {
        this.id = id;
    }

    // @Override
    // public String toString() {
    //     return "BaseIdentificador [id=" + id + "]";
    // }

    
    
}