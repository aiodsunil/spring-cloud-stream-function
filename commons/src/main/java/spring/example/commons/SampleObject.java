package spring.example.commons;

import java.util.UUID;

public class SampleObject {

    UUID id;
    String value;

    public SampleObject() {
    }

    public SampleObject(UUID id, String value) {
        this.id = id;
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SampleObject{" +
            "id=" + id +
            ", value='" + value + '\'' +
            '}';
    }

}
