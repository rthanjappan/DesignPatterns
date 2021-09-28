package decorator;
import java.util.ArrayList;

/**
 * implementing the loop and draw method for the mouth
 */
public class Mouth extends CharacterDecorator {
    public Mouth(Character character) {
        super(character);
        this.sections = new ArrayList<>();
        for(int i=0;i<character.sections.size();i++) {
            sections.add(character.sections.get(i));
        }
    } 
    @Override
   public void draw() {
    character.draw();
}
/**
 * looping through section 7 to create the mouth
 */
    public void customize() {
        for(int i=0;i<character.sections.size();i++) {
            character.sections.set(i,sections.get(i));
        }
        character.sections.set(7,("   \\  ----  /"));
        character.customize();
    }
}
