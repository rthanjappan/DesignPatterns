import java.util.ArrayList;
import java.util.Arrays;

public class ContemporaryPlan extends HousePlan{

    public ContemporaryPlan() {

        super(5,40,3000);
        setMaterials();
        setFeatures();
    }

    @Override
    protected void setMaterials() {
        materials=new ArrayList<>(Arrays.asList("Ceramics","High-Strength Alloys","Composites"));
    }

    @Override
    protected void setFeatures() {
        features=new ArrayList<>(Arrays.asList("Oversized Windows","Unconventional Roofs","Minimalism","Open Floor Plan"));

    }

    @Override
    public String toString() {
        return "Contemporary Home\n"+super.toString();

    }
}
