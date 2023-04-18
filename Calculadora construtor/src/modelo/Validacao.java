package modelo;

public class Validacao 
{
    private String numero1;
    private String numero2;
    private String operacao;
    private Double num1;
    private Double num2;
    private String mensagem;

    public Validacao(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        this.executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.valueOf(this.numero1);
            this.num2 = Double.valueOf(this.numero2);
            if (this.operacao.equals("/") && this.num2 == 0.0)
                this.mensagem = "Divisão por zero";
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }

    public Double getNum1()
    {
        return num1;
    }

    public Double getNum2()
    {
        return num2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
