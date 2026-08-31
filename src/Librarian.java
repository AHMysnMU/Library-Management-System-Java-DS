public class Librarian {
    private static int nextId = 1;

    private int librarianId;
    private String name;
    private String phone;

    public Librarian(String name, String phone) {
        this.librarianId = nextId++;
        this.name = name;
        this.phone = phone;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Librarian ID: " + librarianId +
                ", Name: " + name +
                ", Phone: " + phone;
    }
}
