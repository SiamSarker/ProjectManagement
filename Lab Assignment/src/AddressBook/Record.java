package AddressBook;

public class Record {
    private String Name;
    private String PhnNum;
    private String Address;

    public Record(String name, String phnNum, String address) {
        Name = name;
        PhnNum = phnNum;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhnNum() {
        return PhnNum;
    }

    public void setPhnNum(String phnNum) {
        PhnNum = phnNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void newRecord(){

    }

}
