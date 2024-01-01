import org.example.MyStringBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStringBuilderTest {
    MyStringBuilder myStringBuilder;

    @Test
    void appendStringBuilderEmptyTest(){
        myStringBuilder = new MyStringBuilder(new StringBuilder());
        myStringBuilder.append("first text");
        assertEquals("first text", myStringBuilder.build());
    }

    @Test
    void appendStringBuilderNotEmptyTest() {
        myStringBuilder = new MyStringBuilder(new StringBuilder().append("first text"));
        myStringBuilder.append(" another text");
        assertEquals("first text another text", myStringBuilder.build());
    }

    @Test
    void appendDeleteStringBuilderEmptyTest() {
        myStringBuilder = new MyStringBuilder(new StringBuilder());
        myStringBuilder.append("text").delete(0, 1);
        assertEquals("ext", myStringBuilder.build());
    }

    @Test
    void deleteUndoTest()  {
        myStringBuilder = new MyStringBuilder(new StringBuilder().append("first text"));
        myStringBuilder.delete(0, 1).undo();
        assertEquals("first text", myStringBuilder.build());
    }

    @Test
    void multipleUndoTest() {
        myStringBuilder = new MyStringBuilder(new StringBuilder().append("first text"));

        myStringBuilder.append("smth1").delete(0, 1).append("smth2");
        myStringBuilder.undo().undo().undo();

        assertEquals("first text", myStringBuilder.build());
    }
}
