package sortingusingcomparator;

public class Address implements Comparable<Address> {
    private String streetName;
    private int postCode;

    public Address(String streetName, int postCode) {
        this.streetName = streetName;
        this.postCode = postCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public int compareTo(Address o) {
        return this.postCode-o.getPostCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
