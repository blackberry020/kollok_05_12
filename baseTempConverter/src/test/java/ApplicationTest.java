import org.example.Application;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    private Application application;

    @Before
    public void config() {
        application = new Application();
        application.configure();
    }

    @Test
    public void creation() {
        assertEquals(application.getTemperature(0), 32.0, 0.0);
    }
}
