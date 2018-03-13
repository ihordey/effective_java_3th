package chapter3.item14;

import lombok.ToString;

@ToString
public class PhoneNumber implements Comparable<PhoneNumber> {
    private int areaCode;
    private int prefix;
    private int lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        int result = Integer.compare(this.areaCode, phoneNumber.areaCode);
        if (result == 0) {
            result = Integer.compare(this.prefix, phoneNumber.prefix);
            if (result == 0) {
                result = Integer.compare(this.lineNumber, phoneNumber.lineNumber);
            }
        }
        return result;
    }
}
