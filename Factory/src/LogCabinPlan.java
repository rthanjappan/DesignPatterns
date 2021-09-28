import java.util.ArrayList;
import java.util.Arrays;

public class LogCabinPlan extends HousePlan{

    public LogCabinPlan() {
        super(2,10,1800);

        setMaterials();
        setFeatures();

    }

    @Override
    protected void setMaterials() {
        materials=new ArrayList<>(Arrays.asList("Log Siding","Board and Batten Siding","White Pine"));
    }

    @Override
    protected void setFeatures() {
        features=new ArrayList<>(Arrays.asList("Timbered Roof","High Insulation","Rustic Effect"));

    }

    @Override
    public String toString() {
        return "Log Cabin\n" +super.toString()
                               ;
    }
}
