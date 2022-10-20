import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testIncrement() throws URISyntaxException {
        Handler h = new Handler();
        URI increment = new URI("http://localhost/increment");
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(increment), "Number incremented!");
        assertEquals(h.handleRequest(rootPath), "Number: 1");

}

}
