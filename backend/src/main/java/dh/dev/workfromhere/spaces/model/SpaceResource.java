package dh.dev.workfromhere.spaces.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spaces")
public class SpaceResource {

    @Id
    @SequenceGenerator(
            name = "spaces_seq",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "space_seq",
            strategy = GenerationType.AUTO
    )
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "space_type")
    private SpaceTypeResource type;

    @Column(name = "wifi_available")
    private Boolean wifiAvailable;

    @Column(name = "wifi_password")
    private String wifiPassword;
}
