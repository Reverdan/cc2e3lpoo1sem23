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
        this.mensagem = "";
        Validacao validacao = new Validacao(this.numero);
        if (validacao.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.num);
            this.resposta = primo.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
