import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TextEaterTester {
    @Test
    public void testCharacterCounter() {
        //Arrange
        TextEater text = new TextEater();
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testRowCounter() {
        //Arrange
        TextEater text = new TextEater();
        //Act
        int actual = text.rowCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testStopTracker() {
        //Arrange
        TextEater text = new TextEater();
        //Act
        boolean actual = text.stopTracker();
        //Assert
        boolean expected = false;
        assertEquals(expected, actual);
    }
}