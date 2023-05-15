package modelo;

public final class Validacao
{
    public String numero;
    public Integer num;
    
    public void executar() throws NumberFormatException
    {
        Estaticos.mensagem = "";
        this.num = Integer.valueOf(numero);
    }

}
