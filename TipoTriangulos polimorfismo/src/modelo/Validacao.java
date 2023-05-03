package modelo;

public class Validacao extends absPropriedades
{
    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void verificar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.l1 = Double.valueOf(lado1);
            this.l2 = Double.valueOf(lado2);
            this.l3 = Double.valueOf(lado3);
            if (l1 + l2 <= l3 ||
                    l2 + l3 <= l1 ||
                    l1 + l3 <= l2)
            {
                Estaticos.mensagem = "Não é triângulo";
            }
        } 
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
    }
    
}
