package Day19_Scope;
public class C03_baskaClassdanClasslevelvariablelaraErisim {
    public static void main(String[] args) {
        System.out.println(C02_ClassLevelVariable.bls); // false
        System.out.println(C02_ClassLevelVariable.strs); // Java
        System.out.println(C02_ClassLevelVariable.sayis); // 0
        System.out.println(C02_ClassLevelVariable.chrs); // a
        C02_ClassLevelVariable obj = new C02_ClassLevelVariable(); // static olmayan variable'lara obj tanımı üzrinden ulaşttık.
        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri); // ''
        System.out.println(obj.bls);
        System.out.println(obj.strs);
    }
}











