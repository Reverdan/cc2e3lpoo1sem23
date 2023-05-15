package modelo;

public final class Controle
{

    public String numero;

    public Controle(String numero)
    {
        this.numero = numero;
        executar();
    }

    public void executar()
    {
        Validacao validacao = new Validacao();
        validacao.numero = this.numero;
        try
        {
            validacao.executar();
            if (validacao.num > 10) 
                throw new Excecao();
            CalculoFatorial fatorial = new CalculoFatorial(validacao.num);
            this.numero = fatorial.toString();
            
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
        catch (Excecao e)
        {
            Estaticos.mensagem = e.getMessage();
        }
    }

    @Override
    public String toString()
    {
        return this.numero;
    }

}
