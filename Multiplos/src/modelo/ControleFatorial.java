package modelo;

public final class ControleFatorial extends absPropriedades
{

    public ControleFatorial(String numero)
    {
        super(numero);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        absPropriedades validacao = new ValidacaoFatorial(this.numero);
        if (Estaticos.mensagem.equals(""))
        {
            absPropriedades fatorial = new CalculoFatorial(validacao.num);
            this.numero = fatorial.toString();
        }
        this.resposta = this.numero;
    }
}
