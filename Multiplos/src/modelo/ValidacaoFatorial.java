package modelo;

public final class ValidacaoFatorial extends absPropriedades
{

    public ValidacaoFatorial(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.num = Integer.valueOf(numero);
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Número inválido";
        }
    }

}
