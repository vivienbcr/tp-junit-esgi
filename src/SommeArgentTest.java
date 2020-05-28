import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SommeArgentTest {
    SommeArgent m14USD;
    SommeArgent m14CHF;
    SommeArgent m12CHF;


    @BeforeEach
    public void initparam() {
        m14USD= new SommeArgent(14, "USD");
        m12CHF= new SommeArgent(12, "CHF");
        m14CHF= new SommeArgent(14, "CHF");
    }


    @Test
    void getQuantite() {
        Assertions.assertEquals(14, m14USD.getQuantite());
    }

    @Test
    void getUnite() {
        Assertions.assertTrue( m12CHF.getUnite().equals(m12CHF.getUnite()));
    }

    @Test
    void add() {
        SommeArgent result = m12CHF.add(m14CHF);
        Assertions.assertEquals(26, result.getQuantite());
    }

    @Test
    void testEquals() {
        // Verify that m12CHF != null; throw True
        Assertions.assertTrue(!m12CHF.equals(null));
        // Verify that m12CHF = m12CHF; should throw True
        Assertions.assertEquals(m12CHF, m12CHF);
        // Verify that m12CHF != new SommeArgent; throw False
        Assertions.assertNotEquals(m12CHF, new SommeArgent (12, "CHF"));
        // Verify that m12CHF != m14CHF ? throw True
        Assertions.assertTrue(!m12CHF.equals(m14CHF));
        // Verify that m14USD != m14CHF ? throw True
        Assertions.assertTrue(!m14USD.equals(m14CHF));
    }
}
