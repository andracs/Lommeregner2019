import junit.framework.TestCase;

public class LommeregnerTest extends TestCase {

    public void testSum() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 5;
        int y = 12;
        int resultat = lommeregner.sum(x, y);

        assertEquals(17, resultat);

    }

    public void testMinus() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 5;
        int y = 12;
        int resultat = lommeregner.minus(x, y);

        assertEquals(-7, resultat);
    }
}