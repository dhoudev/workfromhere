package dh.dev.workfromhere.spaces.model;

import lombok.Getter;

@Getter
public enum SpaceTypeResource {
    CAFE(1, "Cafe"),
    OFFICE(2, "Office"),
    BAR(3, "Bar"),
    HOT_DESK(4, "Hot Desk");

    private final Integer id;
    private final String name;

    SpaceTypeResource(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
