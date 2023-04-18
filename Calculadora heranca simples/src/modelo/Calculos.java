package modelo;

public class Calculos extends Propriedades
{
    public Calculos(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        this.executar();
    }
    
    private void executar()
    {
        if (this.operacao.equals("+"))
            this.resultado = this.num1 + this.num2;
        if (this.operacao.equals("-"))
            this.resultado = this.num1 - this.num2;
        if (this.operacao.equals("*"))
            this.resultado = this.num1 * this.num2;
        if (this.operacao.equals("/"))
            this.resultado = this.num1 / this.num2;
    }

    public Double getResultado()
    {
        return resultado;
    }
}