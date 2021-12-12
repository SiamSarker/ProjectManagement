package AdressBook;

class Test{
    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo("ABC", "DHAKA112", "19283");
        PersonInfo p2 = new PersonInfo("DEF", "DHAKA115", "13283");
        PersonInfo p3 = new PersonInfo("GHI", "DHAKA117", "19263");
        p1.newRecord();
        p1.updateRecord();
        p2.newRecord();
        p2.deleteRecord();
        p2.updateRecord();
        p3.newRecord();
        p3.updateRecord();
    }
}