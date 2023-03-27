package Enum;

public enum GenderEnum {

    MALE("Male"),
    FEMALE("Female"),
    NO_GENDER("No Gender");

    private final String genderValue;

    GenderEnum(String genderValue) {
        this.genderValue = genderValue;
    }
}
