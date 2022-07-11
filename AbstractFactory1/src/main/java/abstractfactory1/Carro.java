package abstractfactory1;

public abstract class Carro {
    protected String nome;
    protected TipoCarro tipo;

    @Override
    public String toString() {
        return "--------------Carro--------------\n"+
                "nome: " + nome + "\n"+
                "tipo: " + tipo.toString() + "\n";
    }
}
