package testCalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testControle
{
    
    public testControle()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testar()
    {
        modelo.Controle controle = new modelo.Controle();
        controle.numero1 = "5";
        controle.numero2 = "3";
        controle.operacao = "+";
        controle.executar();
        assertEquals("8.0", controle.resultado);
        controle.numero1 = "10";
        controle.numero2 = "0";
        controle.operacao = "/";
        controle.executar();
        assertEquals("Divisão por zero", controle.resultado);
    }
}
