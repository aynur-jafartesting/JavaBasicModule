public class Task02_PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("TASK 1: 8 Primitive Type ");

        byte alphabetLetterCount = 32;    // 1 byte — Azərbaycan əlifbasındakı hərf sayı
        short cityCount = 78;             // 2 byte — Azərbaycandakı şəhərlərin sayı (təxmini)
        int districtCount = 64;           // 4 byte — Azərbaycandakı rayonların sayı (təxmini)
        long countryPopulation = 10200000L; // 8 byte — Azərbaycanın əhalisi (təxmini)

        double caspianCoastlineKm = 713.0; // 8 byte — Xəzər dənizinin Azərbaycan sahilinin uzunluğu (km)
        float aznToUsdRate = 0.59f;        // 4 byte — 1 AZN-in təxmini dollar (USD) qarşılığı

        char temperatureUnit = 'C';        // 2 byte — Selsi temperatur şkalasının işarəsi
        boolean isBakuCapital = true;      // 1 byte (JVM-də adətən) — Bakı Azərbaycanın paytaxtıdırmı

        System.out.println("alphabetLetterCount (byte, 1 byte)  = " + alphabetLetterCount);
        System.out.println("cityCount (short, 2 byte)           = " + cityCount);
        System.out.println("districtCount (int, 4 byte)         = " + districtCount);
        System.out.println("countryPopulation (long, 8 byte)    = " + countryPopulation);
        System.out.println("caspianCoastlineKm (double, 8 byte) = " + caspianCoastlineKm);
        System.out.println("aznToUsdRate (float, 4 byte)        = " + aznToUsdRate);
        System.out.println("temperatureUnit (char, 2 byte)      = " + temperatureUnit);
        System.out.println("isBakuCapital (boolean, ~1 byte)    = " + isBakuCapital);

        System.out.println();

        System.out.println("===== Task 2 =====");

        byte maxByte = 127;
        System.out.println(maxByte);

        // byte overflowByte = 128;
        // Error: incompatible types: possible lossy conversion from int to byte
        // Səbəb: byte tipi yalnız -128-dən 127-yə qədər dəyər saxlaya bilər.
        // 128 bu diapazondan kənardır, ona görə Java bunu avtomatik (implicit)
        // çevirməyə icazə vermir — məlumat itkisi (lossy conversion) riski var.

        System.out.println("===== Task 3 =====");

        int intResult = 10 / 3;
        double doubleResult = 10.0 / 3;

        System.out.println(intResult);
        System.out.println(doubleResult);

        // İzah: int ilə bölmə (10 / 3) yalnız tam ədəd hissəsini saxlayır,
        // qalıq (0.333...) atılır, çünki hər iki operand int-dir və nəticə
        // də int olmalıdır. double ilə (10.0 / 3) isə ən azı bir operand
        // kəsr olduğu üçün Java bütün əməliyyatı kəsr ədəd kimi hesablayır
        // və dəqiq nəticə (3.3333...) alınır.

        System.out.println("===== Task 4 =====");

        double sum = 0.1 + 0.2;
        System.out.println(sum);

        // Araşdırma: Nəticə tam olaraq 0.3 deyil, 0.30000000000000004 çıxır.
        // Səbəb: kompüterlər kəsr ədədləri ikilik (binary) sistemdə saxlayır,
        // amma 0.1 və 0.2 kimi ədədləri ikilik sistemdə DƏQİQ göstərmək
        // mümkün deyil (elə bizim 1/3-ü onluq sistemdə dəqiq yaza bilmədiyimiz kimi).
        // Ona görə double bu ədədləri təqribi (approximate) saxlayır,
        // toplananda da kiçik bir yuvarlaqlaşdırma xətası (rounding error) yaranır.
        // Bu, "floating point precision" problemi adlanır və xüsusilə pul
        // hesablamalarında ehtiyatlı olmaq lazımdır.
    }
}