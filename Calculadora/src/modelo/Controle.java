package modelo;

public class Controle
{
    public String numero1;
    public String numero2;
    public String operacao;
    public String resultado;
    
    public void executar()
    {
        Validacao validacao = new Validacao();
        validacao.numero1 = this.numero1;
        validacao.numero2 = this.numero2;
        validacao.operacao = this.operacao;
        validacao.validar();
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.num1 = validacao.num1;
            calculos.num2 = validacao.num2;
            calculos.operacao = this.operacao;
            calculos.calcular();
            this.resultado = calculos.resultado.toString();
        }
        else
        {
            this.resultado = validacao.mensagem;
        }
    }
}
