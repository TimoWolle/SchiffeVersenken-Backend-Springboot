package schiffezerstoeren.entity.enumeration;

public enum ShipType {
    SUBMARINE(2),
    DESTROYER(3),
    BATTLESHIP(4),
    AIRCRAFT_CARRIER(5);
    private Integer length;

    ShipType(Integer _length) {
        this.length = _length;
    }

    public Integer getShipType() {
        return length;
    }
}
