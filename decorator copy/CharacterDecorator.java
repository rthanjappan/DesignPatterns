package decorator;

/**
 * creating a the character and making sure to implement the customize method
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
        for(int i=0;i<character.sections.size();i++) {
            sections.add(character.sections.get(i));
        }
        customize();
    }
    public abstract void customize();
    
}
