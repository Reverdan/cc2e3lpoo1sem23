package modelo;

public class Excecao extends Exception
{

    @Override
    public String getMessage()
    {
        return "Número deve ser menor que 10"; 
    }

}
