public class TextEater {
    private int characters = 0;
    private int rows = 0;
    private boolean stop = false;
    private int words = 0;
    public void TextEater () {
    }
    public int characterCounter () {
        return characters;
    }
    public int rowCounter () {
        return rows;
    }
    public boolean stopTracker () {
        return stop;
    }
    public void textAdder (String text) {
        String[] text1 = text.split(" ");
        int counter = 0;
        int counter1 = text1.length;
        while (counter < counter1) {
            if (text1[counter].equals("stop")) {
                stop = true;
                rows--;
            } else if (!stop) {
                characters += text1[counter].length();
                words++;
            }
            counter++;
        }
        rows++;
    }
    public int wordCounter() {
        return words;
    }
}