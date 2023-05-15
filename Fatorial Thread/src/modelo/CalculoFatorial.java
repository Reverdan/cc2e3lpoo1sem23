package modelo;

public class CalculoFatorial extends absPropriedades
{

    public CalculoFatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        int base = this.num;
        for (int i = 1; i < base; i++)
        {
            num *= i;
        }
    }

    @Override
    public String toString()
    {
        return num.toString(); 
    }
    
    
}
