package modelo;

public class Controle extends absPropriedades
{

    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
    }

    @Override
    public void verificar()
    {
        Estaticos.mensagem = "";
        absPropriedades validacao = new Validacao(lado1, lado2, lado3);
        if (Estaticos.mensagem.equals(""))
        {
            absPropriedades triangulos = new Triangulos(validacao.l1, 
                    validacao.l2, validacao.l3);
            this.resposta = triangulos.toString();
        }
    }
    
}
