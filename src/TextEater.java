public class TextEater {
    private int characters = 0;
    private int rows = 0;
    public void TextEater() {
    }
    public int characterCounter() {
        return characters;
    }
    public int rowCounter() {
        return rows;
    }
    public boolean stopTracker() {
        return true;
    }
    public void textAdder(String text) {
        if (text.equals("stop")) {
        } else {
            characters += text.length();
            rows++;
        }
    }
}