public class HousePlanFactory {

    public static HousePlan createHousePlan(String type){
        if(type.compareTo("log cabin")==0){
            //System.out.println( new LogCabinPlan());
            return new LogCabinPlan();
        }else if(type.compareTo("Tiny home")==0){
            return new TinyHomePlan();
        }else if (type.compareTo("contemporary home")==0){
            return new ContemporaryPlan();
        }
        return null;
    }
}
