enum Color {
    BLACK, BLUE, GREEN, RED, ORANGE
}

enum Geometry {
    LINE, POINT, POLYGON
}

enum PointMarkers {
    CIRCLE, DIAMOND, PUSH_PIN, STAR, SQUARE
}

enum LineMarkers {
    DASHED, DOTTED, SOLID
}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
               "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
