package С6.phonebook.users;

import java.util.ArrayList;
import java.util.List;

import С6.phonebook.phones.Phone;

public class User {

    public String name;

    public List<Phone> phones = new ArrayList<Phone>();

    public User(String name) {
        this.name = name;
        this.phones = new ArrayList<Phone>();
    }

    public List<Phone> getPhones(String name) {
        return phones;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void removePhone(String name, Long phone) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).phone.equals(phone)) {
                phones.remove(i);
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
