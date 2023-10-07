//Nicholas Zaldivar Midterm Java Program
public class Q5Class {
    private int total = 0;
    public void processString(String string){
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A'){
                incrTotalAs();
            }
        }
    }
    private void incrTotalAs(){
        total++;
    }
    public int getTotalAs(){
        return total;
    }
}