package guru.springframework.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private int year;
    private String color;
    @JsonProperty("pantone_value")
    private String pantoneValue;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", pantoneValue='" + pantoneValue + '\'' +
                '}';
    }
}
