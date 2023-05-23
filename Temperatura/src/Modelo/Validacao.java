package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String valor)
    {
        super(valor);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.valorTemperatura = Double.valueOf(valor);
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Número inválido";
        }
    }

}
