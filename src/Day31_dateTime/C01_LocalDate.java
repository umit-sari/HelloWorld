package Day31_dateTime;
import java.time.LocalDate;
public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih1 = LocalDate.now();
        System.out.println(tarih1); // 2023-08-04
        System.out.println(tarih1.getMonth()); // AUGUST - hangi aydayız sorusuna cevap
        System.out.println(tarih1.getMonthValue()); // 8- içinde bulundugumuz ayın sayısal degeri
        System.out.println(tarih1.getDayOfYear()); // 216 -- bugun yılın kacıncı günü
        System.out.println(tarih1.isLeapYear()); // false -- artık yıl (şubat 29 mu) mı- false
        LocalDate tarih2 = LocalDate.of(2016,1,1);
        System.out.println(tarih2.isLeapYear()); // true - artık yıl-true
        System.out.println(tarih1.isAfter(tarih2)); // true - tarih1 - tarih2 den önce mi- true
        System.out.println(tarih1.withYear(2022)); // 2022-08-04- 2023 yılını 2022 ile degiştir
        System.out.println(tarih1.minusYears(3).minusDays(53)); // 2020-06-12-- cıkarma islemi
        System.out.println(tarih1.plusWeeks(15).plusDays(3)); // 2023-11-20-- ekleme işlemi
        System.out.println(tarih1.lengthOfYear()); // 365 // yılın gün uzunlugu
        System.out.println(tarih1.lengthOfMonth()); // 31 // aydaki gün uzunlugu


    }
}
