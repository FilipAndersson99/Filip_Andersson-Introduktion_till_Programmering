import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TextEaterTester {
    @Test
    public void testCharacterCounter () {
        //Arrange
        TextEater text = new TextEater();
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testRowCounter () {
        //Arrange
        TextEater text = new TextEater();
        //Act
        int actual = text.rowCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testStopTracker () {
        //Arrange
        TextEater text = new TextEater();
        //Act
        boolean actual = text.stopTracker();
        //Assert
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingStopCharacters () {
        //Arrange
        TextEater text = new TextEater();
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingMultipleRowsCharacters () {
        //Arrange
        TextEater text = new TextEater();
        String myText1 = "Hej";
        text.textAdder(myText1);
        String myText2 = "stop";
        text.textAdder(myText2);
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingMultipleRowsRows () {
        //Arrange
        TextEater text = new TextEater();
        String myText1 = "Hej";
        text.textAdder(myText1);
        String myText2 = "stop";
        text.textAdder(myText2);
        //Act
        int actual = text.rowCounter();
        //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingMultipleRowsStop () {
        //Arrange
        TextEater text = new TextEater();
        String myText1 = "Hej";
        text.textAdder(myText1);
        String myText2 = "stop";
        text.textAdder(myText2);
        //Act
        boolean actual = text.stopTracker();
        //Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testTypingAfterStopCharacters () {
        //Arrange
        TextEater text = new TextEater();
        String myText1 = "Hej";
        text.textAdder(myText1);
        String myText2 = "stop";
        text.textAdder(myText2);
        String myText3 = "Hej då";
        text.textAdder(myText3);
        //Act
        int actual = text.characterCounter();
        //Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
}