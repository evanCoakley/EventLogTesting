import com.example.EventLog;
import com.example.Event;
import com.sun.deploy.cache.InMemoryLocalApplicationProperties;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;
import org.junit.Rule;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class EventTests {
    EventLog event = new EventLog();


    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addImproperEvent() throws IllegalArgumentException {
        System.out.println("Testing if improper event throws exception");
        expected.expect(IllegalArgumentException.class);
        Event improperEvent = null;
        assertTrue(event.addEvent(improperEvent));
    }

    @Test
    public void testingProperEvent() throws IllegalArgumentException {
        System.out.println("Testing if proper event can be added");
        expected.expect(IllegalArgumentException.class);
        Event properEvent = new Event();
        assertTrue(event.addEvent(properEvent));
    }
    @Test
    public void addImproperAction() throws IllegalArgumentException{
        System.out.println("Testing if improper action event will throw exception");
        expected.expect(IllegalArgumentException.class);
        Event improperAction = new Event("action", null);
        assertTrue(event.addEvent(improperAction));
    }
    @Test
    public void

}

