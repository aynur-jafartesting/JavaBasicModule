public class Task04_ChainedCasting {
    public static void main(String[] args) {

        byte byteValue = 63;
        short shortValue = byteValue;   // implicit: byte -> short
        int intValue = shortValue;      // implicit: short -> int
        long longValue = intValue;      // implicit: int -> long
        double doubleValue = longValue; // implicit: long -> double

        System.out.println("byte   = " + byteValue);
        System.out.println("short  = " + shortValue);
        System.out.println("int    = " + intValue);
        System.out.println("long   = " + longValue);
        System.out.println("double = " + doubleValue);

        System.out.println();
        System.out.println("İzah: hər addımda böyük tip kiçik tipin bütün dəyərlərini " +
                "tuta bilir, ona görə Java heç bir explicit cast tələb etmir - " +
                "bu, avtomatik (implicit) widening casting-dir.");
    }
}
