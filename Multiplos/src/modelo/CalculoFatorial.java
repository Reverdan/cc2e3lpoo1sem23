package modelo;

public final class CalculoFatorial extends absPropriedades
{

    public CalculoFatorial(int num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        int base = num;
        for (int i = 1; i < base; i++)
        {
            num *= i;
        }
        this.resposta = this.num.toString();
    }
}
