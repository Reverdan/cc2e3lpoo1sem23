package fatorial;

import apresentacao.frmPrincipal;
import modelo.Controle;

public class Fatorial
{

    public static void main(String[] args)
    {
        Controle controle = new Controle();
        Thread ct = new Thread(controle);
        ct.start();

        frmPrincipal frmP = new frmPrincipal(null, true);
        frmP.setVisible(true);

        System.exit(0);
    }

}
