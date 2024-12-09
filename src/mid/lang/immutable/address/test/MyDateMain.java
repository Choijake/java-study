package mid.lang.immutable.address.test;

public class MyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;

        date1 = date1.withYear(2022);
    }
}
