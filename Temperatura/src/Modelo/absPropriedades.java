package Modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String valor;
    protected Double valorTemperatura;
    
    public absPropriedades(String valor)
    {
        this.valor = valor;
        this.executar();
    }

    public absPropriedades(Double valorTemperatura)
    {
        this.valorTemperatura = valorTemperatura;
        this.executar();
    }
}
