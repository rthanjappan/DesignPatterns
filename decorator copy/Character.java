package decorator;
import java.util.ArrayList;

/**
 * calling array for sections
 */
public abstract class Character {
    ArrayList<String> sections;

    public Character() {
        this.sections = new ArrayList<>();
        }    
   /**
    * draw method
    */
    public void draw() {
        for(int i=0;i<sections.size();i++) {
            System.out.println(sections.get(i));

        }
    
    }
    public void customize() {
    }
}
