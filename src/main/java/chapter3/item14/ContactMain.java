package chapter3.item14;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class ContactMain {

    public static void main(String[] args) {
        Contact tc = new Contact(5);
        Contact sc = new Contact(1);
        Contact fc = new Contact(-3);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(tc);
        contacts.add(sc);
        contacts.add(fc);

        Collections.sort(contacts);
        for (Contact contact : contacts) {
            log.info("{} ", contact);
        }
    }
}
