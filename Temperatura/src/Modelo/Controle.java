package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String valor)
    {
        super(valor);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        absPropriedades validacao = new Validacao(this.valor);
        if (Estaticos.mensagem.equals(""))
        {
            absPropriedades celsius = new Celsius(validacao.valorTemperatura);
            this.valor = celsius.toString();
        }
    }

    @Override
    public String toString()
    {
        return valor;
    }
}
