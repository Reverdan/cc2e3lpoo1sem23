

package modelo;


public abstract class absPropriedades implements intMetodos
{
    public String numero;
    public int num;
    public String mensagem;
    public String resposta;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        executar();
    }

    public absPropriedades(int num)
    {
        this.num = num;
        executar();
    }
    
    
}
