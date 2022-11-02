import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> contacts = new HashMap<>();

    public void addContact(String fullName, String phoneNumber) {
        if (contacts.containsKey(fullName)) {
            throw new IllegalArgumentException("Ключ не уникален");
        } else {
            contacts.put(fullName, phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
