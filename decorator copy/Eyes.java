package decorator;
import java.util.ArrayList;

/**
 * implementing the loop and draw method for eyes
 */
public class Eyes extends CharacterDecorator {
   public Eyes(Character character) {
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
 * looping through section 5 to create eyes
 */
   public void customize() {
    for(int i=0;i<character.sections.size();i++) {
        character.sections.set(i,sections.get(i));
    }
    character.sections.set(5,("   |  O    O |"));
    character.customize();
   }
}
