package model;

import java.math.BigDecimal;

class Location {

    private BigDecimal latitude;
    private BigDecimal longitude;

    public Location(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
