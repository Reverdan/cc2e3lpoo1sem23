package modelo;

public class ValidacaoTriangulo extends absPropriedades
{
    public ValidacaoTriangulo(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void executar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.l1 = Double.valueOf(lado1);
            this.l2 = Double.valueOf(lado2);
            this.l3 = Double.valueOf(lado3);
            if (this.l1 + this.l2 <= this.l3 ||
                    this.l1 + this.l3 <= this.l2 ||
                    this.l2 + this.l3 <= this.l1)
                Estaticos.mensagem = "Não é um triângulo";
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Erro de conversão";
        }
    }
}
