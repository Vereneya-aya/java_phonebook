package С6.phonebook.phoneBook;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import С6.phonebook.phones.Phone;
import С6.phonebook.users.User;

public class phoneBook {

    HashMap <User,List<Phone>> phonebook = new HashMap<>();

    public void addUser(User user) {
        phonebook.put(user, user.getPhones(user.name));
    }



    public void printAll() {
        for (User user : phonebook.keySet()) {
            System.out.println(user.name + " " + user.getPhones(user.name));
        }
    }

     public void sort() {
        HashMap<User, Integer> pbToSort = new HashMap<>();
        for (User user : phonebook.keySet()) {
            pbToSort.put(user, user.getPhones(user.name).size());
        }
        Map<User, Integer> sortedMap = pbToSort.entrySet().stream()
               .sorted(Map.Entry.<User, Integer>comparingByValue().reversed())
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        for (User user : sortedMap.keySet()) {
            System.out.println(user.name + " " + user.getPhones(user.name));
        }
    }
}
