public class Task06_EqualsVsDoubleEquals {
    public static void main(String[] args) {

        String a = "salam";
        String b = "salam";

        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println();
        System.out.println("QEYD: Bu misalda hər ikisi 'true' çıxdı, çünki Java " +
                "eyni məzmunlu String literal-ları yaddaşda 'String Pool' adlanan " +
                "xüsusi sahədə saxlayır və eyni mətni təkrar yaratmır - hər iki " +
                "dəyişən eyni yaddaş ünvanına işarə edir.");
        System.out.println();
        System.out.println("SUAL: Bəs onda niyə yenə də equals() istifadə etməliyik, " +
                "== yox? Çünki == YADDAŞ ÜNVANINI müqayisə edir, MƏZMUNU yox. " +
                "Əgər String-lər 'new String(...)' ilə yaradılsaydı (String Pool-dan " +
                "kənarda), == yanlış olaraq false qaytara bilərdi, hətta məzmun eyni " +
                "olsa belə. Bu fərqin dəqiq səbəbini Modul 4-də (obyektlər və yaddaş " +
                "idarəetməsi mövzusunda) daha ətraflı öyrənəcəyik.");
    }
}
