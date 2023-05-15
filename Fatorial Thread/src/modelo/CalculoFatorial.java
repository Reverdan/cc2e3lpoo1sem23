package modelo;

public class CalculoFatorial
{
    public void executar(Integer num)
    {
        int base = num;
        for (int i = 1; i < base; i++)
        {
            num *= i;
        }
        Estaticos.resposta = num.toString();
    }
}
