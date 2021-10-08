package test;
import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest01() {
        assertEquals(true, true);
    }

    @Test
    public void emptyTest02(){
        assertEquals(BalancedBrackets.hasBalancedBrackets("[fudge][]"), true);
    }

    @Test
    public void emptyStringDoesNotHaveBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void wrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void closingBracketBeforeOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void anotherBalancedBracketsShouldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[l[a]u[n]c]h"));
    }


    // test these edge cases: "[[]", "[[][]]",

}
