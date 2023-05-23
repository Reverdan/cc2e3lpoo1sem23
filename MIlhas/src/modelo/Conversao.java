package modelo;

public class Conversao extends absPropriedades
{

    public Conversao(Double num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        this.num = this.num * 1609.34;
    }

    @Override
    public String toString()
    {
        return this.num.toString(); 
    }
    
    

}
