package modelo;

public class Calculos
{
    public Double num1;
    public Double num2;
    public String operacao;
    public Double resultado;
    
    public void calcular()
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
}
