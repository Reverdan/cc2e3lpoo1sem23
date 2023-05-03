package modelo;

import java.util.Objects;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
    }

    @Override
    public void verificar()
    {
        if (Objects.equals(this.l1, this.l2) &&
                Objects.equals(this.l2, this.l3))
        {
            this.resposta = "Triângulo equilátero";
        }
        else
        {
            if (!Objects.equals(this.l1, this.l2) &&
                    !Objects.equals(this.l2, this.l3) &&
                    !Objects.equals(this.l1, this.l3))
            {
                this.resposta = "Triângulo escaleno";
            }
            else
            {
                this.resposta = "Triângulo isósceles";
            }
        }
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }
    
    
    
}
