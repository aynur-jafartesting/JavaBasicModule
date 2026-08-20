public class Task04_BoundaryCasting {
    public static void main(String[] args) {

        int val1 = 127;
        int val2 = 128;
        int val3 = 300;

        byte byte1 = (byte) val1;
        byte byte2 = (byte) val2;
        byte byte3 = (byte) val3;

        System.out.println(val1 + " -> (byte) = " + byte1);
        System.out.println(val2 + " -> (byte) = " + byte2);
        System.out.println(val3 + " -> (byte) = " + byte3);

        System.out.println();
        System.out.println("İzah: byte tipi -128 ilə 127 arasını əhatə edir.");
        System.out.println("127 bu diapazona sığır, ona görə nəticə gözlənildiyi kimi 127 çıxdı.");
        System.out.println("128 diapazonu keçir və overflow nəticəsində -128 kimi mənfi ədədə çevrildi.");
        System.out.println("300 isə daha da böyükdür, amma nəticə mənfi yox, 44 kimi müsbət " +
                "bir ədəd çıxdı - bu göstərir ki, overflow-un nəticəsi həmişə mənfi " +
                "olmur, tamamilə gözlənilməz ola bilər.");
        System.out.println();
        System.out.println("Overflow-un səbəbi: cast zamanı Java yalnız dəyərin son 8 bitini " +
                "saxlayır (byte 8 bitlik tipdir), qalan bitlər atılır. Nəticədə ədəd " +
                "'wrap around' olur - yəni diapazonun digər ucundan davam edir, " +
                "elə bil dairəvi bir sayğacdır.");
    }
}
