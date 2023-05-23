package modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String numero;
    protected Double num;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        this.executar();
    }

    public absPropriedades(Double num)
    {
        this.num = num;
        this.executar();
    }
    
    
}
