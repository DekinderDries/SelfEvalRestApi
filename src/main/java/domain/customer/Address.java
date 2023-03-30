package domain.customer;

public class Address {
    private String streetname;
    private int housenumber;
    private int postalCode;
    private String city;

    public Address(String streetname, int housenumber, int postalCode, String city) {
        this.streetname = streetname;
        this.housenumber = housenumber;
        this.postalCode = postalCode;
        this.city = city;
    }
}
