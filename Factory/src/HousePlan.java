import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    protected abstract void setMaterials();

    protected abstract void setFeatures();

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    @Override
    public String toString() {
        String str= "Square Feet: " + squareFeet+
                "\nRoom: " + numRooms +
                "\nWindows: " + numWindows +
                "\n\nMaterials: \n";
        for(String s :materials){
            str+=" -"+s+"\n";
        }
        str+="\n";
        str+="Features:\n";
        for(String s :features){
            str+=" -"+s+"\n";
        }

        return str;

    }

    public String toString1() {
        return "HousePlan{" +
                "materials=" + materials +
                ", features=" + features +
                ", numRooms=" + numRooms +
                ", numWindows=" + numWindows +
                ", squareFeet=" + squareFeet ;

    }
}
