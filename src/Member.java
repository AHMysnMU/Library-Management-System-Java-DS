public class Member {
    private static int nextId = 1;

    private int memberId;
    private String name;
    private String phone;

    public Member(String name, String phone) {
        this.memberId = nextId++;
        this.name = name;
        this.phone = phone;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId +
                ", Name: " + name +
                ", Phone: " + phone;
    }
}
