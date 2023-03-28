package modelo;

public class Controle
{
    public String executar(
            String numero1, String numero2, String operacao)
    {
        Validacao validacao = new Validacao();
        validacao.validar(numero1, numero2, operacao);
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            return calculos.calcular(validacao.num1,
                    validacao.num2, operacao).toString();
        }
        else
        {
            return validacao.mensagem;
        }
    }
}
