import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("MAIDAN NEZALEZSHNOSTI", UsageType.RESIDENTIAL));
        mappables.add(new Building("Sport Life", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}