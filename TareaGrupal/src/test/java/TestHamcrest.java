import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestHamcrest {
    @Test
    public void shouldDemonstrateHamcrest() {
        int value = 42;
        assertThat(value, is(42));
        assertThat(value, is(not(41)));
        assertThat(null, is(nullValue()));
        String s = "CC-3S2nd";
        assertThat(s, is(notNullValue()));
        assertThat(s, containsString("2nd"));
        assertThat(s, not(containsString("1st")));

        List<String> l = new ArrayList<String>();
        l.add("Bimse");
        l.add("Bumse");
        assertThat(l, hasItems(new String[]{"Bimse", "Bumse"}));
    }
}
