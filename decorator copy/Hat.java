package decorator;

/**
 * implementing the loop and draw method for the hat
 */
public class Hat extends CharacterDecorator{
    public Hat(Character character) {
        super(character);
        for(int i=0;i<character.sections.size();i++) {
            sections.add(character.sections.get(i));

        }
 
    } 
    @Override
   public void draw() {
    character.draw();
}

/**
 * looping through sections 1&2  to create the hat
 */
    public void customize() {
        for(int i=0;i<character.sections.size();i++) {
            character.sections.set(i,sections.get(i));
        }
        character.sections.set(1,("    ------"));
        character.sections.set(2,"   |      |");
        character.customize();
    }
   
}
