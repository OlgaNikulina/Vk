public class InformationBlock {
    private String id;
    private  int websiteUrl;
    private String telephoneNumber;
    private String address;
    private boolean inDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(int websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isInDetails() {
        return inDetails;
    }

    public void setInDetails(boolean inDetails) {
        this.inDetails = inDetails;
    }

    public InformationBlock() {
    }
}
