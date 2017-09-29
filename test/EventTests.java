import com.example.EventLog;
import com.example.Event;
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
    public void invalidActionTest() throws IllegalArgumentException{
        System.out.println("Testing if invalid action can be added");
        Event eventTest = new Event();
        eventTest.setName("Face To Face");
        eventTest.setAction("invalid action");
        thrown.expect(IllegalArgumentException.class);
        assertFalse(event.addEvent(eventTest));
    }
    @Test
    public void addEvent() throws IllegalArgumentException{
        System.out.println("Testing add event function");
        Event event1 = new Event("event1", "Face2Face");
        Event event2 = new Event("event2", "PhoneCall");
        Event event3 = new Event( "event3", "TextMessaging");
        Event event4 = new Event ("event4", "Unknown");
        assertTrue(event.addEvent(event1));
        assertTrue(event.addEvent(event2));
        assertTrue(event.addEvent(event3));
        assertTrue(event.addEvent(event4));
    }
}

