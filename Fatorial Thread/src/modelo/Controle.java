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
            absPropriedades fatorial = new CalculoFatorial(validacao.num);
            this.numero = fatorial.toString();
        }
    }

    @Override
    public String toString()
    {
        return this.numero; 
    }
    
    
}
