package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
    }

    
    @Override
    public void executar()
    {
        this.mensagem = "";
        try
        {
            this.num = Integer.valueOf(numero);
        } 
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }
}
