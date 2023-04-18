package modelo;

public class Controle
{
    public String executar(
            String numero1, String numero2, String operacao)
    {
        Validacao validacao = new Validacao(numero1, numero2, operacao);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos();
            return calculos.calcular(validacao.getNum1(), validacao.getNum2(), operacao).toString();
        }
        else
        {
            return validacao.getMensagem();
        }
    }
}
