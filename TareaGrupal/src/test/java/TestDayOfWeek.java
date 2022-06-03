import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestDayOfWeek{


    public static void main(String[] args){

        Date d = new Date(2010,12,25);

        Date.Weekday weekday = d.dayOfWeek();

        if (weekday==Date.Weekday.SATURDAY) System.out.println("test case: DEC 25th 2010: PASS");

        else System.out.println("test case: DEC 25th 2010: FAIL");

        }

/*
   // import org.junit.jupiter.api.Test;
        @Test
        @DisplayName("Usando Junit")
        public void shouldGiveSaturdayFor25Dec2010(){
            Date d = new Date(2010,12,25);

            assertEquals(Date.Weekday.SATURDAY,d.dayOfWeek());
    }

*/

/*
    //usando import static org.hamcrest.MatcherAssert.assertThat
    @Test
    @DisplayName("Usando Hamcrest")
    public void shouldGiveSaturdayFor25Dec2010(){
        Date d = new Date(2010,12,25);
        assertThat(d.dayOfWeek(), is(Date.Weekday.SATURDAY));
    }
*/
}

