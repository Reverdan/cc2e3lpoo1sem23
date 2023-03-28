package modelo;

public class Validacao
{
    public Double num1;
    public Double num2;
    public String mensagem;
    
    public void validar(
            String numero1, String numero2, String operacao)
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.valueOf(numero1);
            this.num2 = Double.valueOf(numero2);
            if (operacao.equals("/") &&
                    this.num2.equals(0.0))
                this.mensagem = "Divisão por zero";
        } 
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }
}
