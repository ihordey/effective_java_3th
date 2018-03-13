package chapter3.item14;

import lombok.ToString;

@ToString
public class Contact implements Comparable<Contact> {
    private int number;

    public Contact(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Contact contact) {
        return Integer.compare(this.number, contact.number);
    }
}
