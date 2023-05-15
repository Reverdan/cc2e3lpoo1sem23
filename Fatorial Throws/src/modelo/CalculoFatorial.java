package modelo;

public final class CalculoFatorial
{
    public Integer num;
    
    public CalculoFatorial(Integer num)
    {
        this.num = num;
        executar();
    }

    public void executar()
    {
        int base = this.num;
        for (int i = 1; i < base; i++)
        {
            this.num *= i;
        }
    }

    @Override
    public String toString()
    {
        return this.num.toString(); 
    }
    
    
}
