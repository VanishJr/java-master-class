enum UsageType {
    BUSINESS, ENTERTAINMENT, RESIDENTIAL, SPORTS
}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + (usage);
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.CIRCLE;
            case BUSINESS -> Color.RED + " " + PointMarkers.DIAMOND;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.PUSH_PIN;
            case SPORTS -> Color.ORANGE + " " + PointMarkers.STAR;
            default -> Color.BLACK + " " + PointMarkers.SQUARE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
        " name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
