package decorator;
import java.util.ArrayList;

/**
 * implementing the loop and draw method for the nose
 */
public class Nose extends CharacterDecorator {
    public Nose(Character character) {
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
/*
 * looping through section 6 to create the nose
 */
    public void customize() {
        
        for(int i=0;i<character.sections.size();i++) {
            character.sections.set(i,sections.get(i));
        }
        character.sections.set(6,("   |     >   |"));
        character.customize();
    }
    
}
