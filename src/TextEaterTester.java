import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TextEaterTester {
    @Test
    public void testCharacterCounter() {
        //Arrange
        String myText = "stop";
        TextEater text = new TextEater(myText);
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testRowCounter() {
        //Arrange
        String myText = "stop";
        TextEater text = new TextEater(myText);
        //Act
        int actual = text.rowCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testStopTracker() {
        //Arrange
        String myText = "stop";
        TextEater text = new TextEater(myText);
        //Act
        boolean actual = text.stopTracker();
        //Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingStopCharacters() {
        //Arrange
        String myText = "stop";
        TextEater text = new TextEater(myText);
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
}