package Modelo;

public class Celsius extends absPropriedades
{

    public Celsius(Double valorTemperatura)
    {
        super(valorTemperatura);
    }

    @Override
    public void executar()
    {
        this.valorTemperatura = valorTemperatura * 1.8 + 32;
    }

    @Override
    public String toString()
    {
        return valorTemperatura.toString();
    }
    
    

}
