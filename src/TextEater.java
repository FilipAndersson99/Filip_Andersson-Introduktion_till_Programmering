public class TextEater {
    private int characters = 0;
    private int rows = 0;
    private boolean stop = false;
    public void TextEater() {
    }
    public int characterCounter() {
        return characters;
    }
    public int rowCounter() {
        return rows;
    }
    public boolean stopTracker() {
        return stop;
    }
    public void textAdder(String text) {
        if (text.equals("stop")) {
            stop = true;
        } else {
            characters += text.length();
            rows++;
        }
    }
}