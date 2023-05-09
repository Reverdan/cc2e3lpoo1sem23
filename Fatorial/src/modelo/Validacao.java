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
        Estaticos.mensagem = "";
        try
        {
            this.num = Integer.valueOf(numero);
        } 
        catch (Exception e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
    }
    
}
