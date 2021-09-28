import java.util.ArrayList;
import java.util.Arrays;

public class TinyHomePlan extends HousePlan{

    public TinyHomePlan() {

        super(1,5,200);
        setMaterials();
        setFeatures();
    }

    @Override
    protected void setMaterials() {
        materials=new ArrayList<>(Arrays.asList("Lumber","Insulation","Metal Roofing","Hardware"));
    }

    @Override
    protected void setFeatures() {
        features=new ArrayList<>(Arrays.asList("Natural Light","Creative Storage","Multipurpose areas",
                "multi-use applications"));

    }

    @Override
    public String toString() {
        return "Tiny House\n"+super.toString();
    }
}
