package modelo;

public abstract class absPropriedades implements intMetodos
{
    public String lado1;
    public String lado2;
    public String lado3;
    public Double l1;
    public Double l2;
    public Double l3;
    public String resposta;

    public absPropriedades(String lado1, String lado2, String lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        verificar();
    }

    public absPropriedades(Double l1, Double l2, Double l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        verificar();
    }
    
    
}
