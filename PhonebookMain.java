package С6.phonebook;

import С6.phonebook.phoneBook.phoneBook;
import С6.phonebook.phones.Phone;
import С6.phonebook.users.User;

public class PhonebookMain {
    public static void main(String[] args) {

        phoneBook test = new phoneBook();

        
        User Aidar = new User("Aidar");
        User Oleg = new User("Oleg");
        User Alina = new User("Alina");
        User Ivan = new User("Ivan");

        
        test.addUser(Aidar);
        test.addUser(Oleg);
        test.addUser(Alina);
        test.addUser(Ivan);

        
        Aidar.addPhone(new Phone(444L));
        Aidar.addPhone(new Phone(555L));
        Oleg.addPhone(new Phone(666L));
        Alina.addPhone(new Phone(111L));
        Alina.addPhone(new Phone(222L));
        Alina.addPhone(new Phone(333L));
        Ivan.addPhone(new Phone(987L));
        Ivan.addPhone(new Phone(97L));
        Ivan.addPhone(new Phone(967L));
        Ivan.addPhone(new Phone(917L));
        Ivan.addPhone(new Phone(947L));

        // System.out.println(Alina.getPhones("Alina"));
        // System.out.println(Aidar.getPhones("Aidar"));
        // System.out.println(Oleg.getPhones("Oleg"));

        // Aidar.removePhone("Aidar", 555L);
        // System.out.println(Aidar.getPhones("Aidar"));

        test.printAll();
        
        test.sort(); 
        //   Этот метод возвращает и печатает phonebook в порядке убывания количества номеров телефона, 
        // воспользовалась материалом google, сама сделать не смогла со своими навыками, не получилось

        
    }
    
}
