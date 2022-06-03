import org.junit.*;
import static org.junit.Assert.*;

/** Test case class for testing emails address verification.
*/
public class TestEmail {

  private EmailAddress address;

  @Test
  public void shouldAcceptJohnAtCsDotEdu() {
    EmailAddress ea = new EmailAddress("abejita@cs.edu");
    assertTrue( ea.isValid() );
  }

  @Test
  public void shouldNotAccept123AtCsDotEdu() {
      EmailAddress ea = new EmailAddress("123@cs-edu");
      assertFalse( ea.isValid() );
  }

}
