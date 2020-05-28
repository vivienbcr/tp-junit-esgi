
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SommeArgentTest {
    SommeArgent m12CHF= new SommeArgent(12, "CHF");
    SommeArgent m14CHF= new SommeArgent(14, "CHF");
    SommeArgent m14USD= new SommeArgent(14, "USD");
    SommeArgent expected = new SommeArgent(26, "CHF");

    @Test
    void getQuantite() {

    }

    @Test
    void getUnite() {
    }

    @Test
    void add() {
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
        Assertions.assertEquals(26, result.getQuantite());
    }

    @Test
    void testEquals() {
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
        Assertions.assertTrue(result.equals(result));
    }
}