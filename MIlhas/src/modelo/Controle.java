package modelo;

public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
    {
        absPropriedades validacao = new Validacao(numero);
        if (Estaticos.mensagem.equals(""))
        {
            absPropriedades conversao = new Conversao(validacao.num);
            this.numero = conversao.toString();
        }
    }

    @Override
    public String toString()
    {
        return numero; 
    }
    

}
