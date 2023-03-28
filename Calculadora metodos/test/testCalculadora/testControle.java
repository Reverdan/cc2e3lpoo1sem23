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
        assertEquals("8.0", controle.executar("5", "3", "+"));
        assertEquals("Divisão por zero", controle.executar("10", "0", "/"));
    }
}
