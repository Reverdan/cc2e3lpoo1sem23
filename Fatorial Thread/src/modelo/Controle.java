package modelo;

public class Controle implements Runnable
{

    public void executar()
    {
        Validacao validacao = new Validacao();
        CalculoFatorial fatorial = new CalculoFatorial();
        while (true)
        {
            validacao.executar();
            if (Estaticos.mensagem.equals(""))
            {
                fatorial.executar(Estaticos.num);
            }
        }
    }

    @Override
    public void run()
    {
        executar();
    }
}
