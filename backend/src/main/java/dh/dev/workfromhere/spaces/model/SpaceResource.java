package dh.dev.workfromhere.spaces.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceResource {
    private Integer id;
    private String name;
    private String description;
    private SpaceTypeResource type;
    private Boolean wifiAvailable;
    private String wifiPassword;
}
