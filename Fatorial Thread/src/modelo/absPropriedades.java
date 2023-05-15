package modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String numero;
    protected Integer num;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        executar();
    }

    public absPropriedades(Integer num)
    {
        this.num = num;
        executar();
    }
    
    
    
    
}
