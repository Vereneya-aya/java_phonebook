package С6.phonebook.phones;

public class Phone {

    public Long phone;

    public Phone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return phone.toString();
    }


}
