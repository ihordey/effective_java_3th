package chapter3.item10;

import lombok.ToString;

import java.util.Objects;

@ToString
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    //TODO Broken - violates symmetry!
    /*@Override public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s);
        if (o instanceof String) // One-way interoperability!
            return s.equalsIgnoreCase((String) o);
        return false;
    }*/

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                s.equalsIgnoreCase(((CaseInsensitiveString)obj).s);
    }
}
