package modelo;

public class Validacao
{

    public void executar()
    {
        try
        {
            Estaticos.num = Integer.valueOf(Estaticos.numero);
            Estaticos.mensagem = "";
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
    }

}
