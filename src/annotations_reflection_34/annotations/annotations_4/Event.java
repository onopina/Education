package annotations_reflection_34.annotations.annotations_4;

@MyAnno(year = 2022)
public class Event {
    private String type;

    public Event(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
