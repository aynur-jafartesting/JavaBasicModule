public class Task03_AgeCheck {
    public static void main(String[] args) {

        int age = 16;

        boolean schoolAge = (age >= 6) && (age <= 17);
        boolean youthAge = (age >= 18) && (age <= 35);
        boolean notSchoolAge = !schoolAge;

        System.out.println("Yaş: " + age);
        System.out.println("Məktəb yaşındadır (6-17): " + schoolAge);
        System.out.println("Gənclik yaşındadır (18-35): " + youthAge);
        System.out.println("Məktəb yaşında DEYİL: " + notSchoolAge);

        System.out.println();
        System.out.println("İzah: && operatoru ilə yaş aralığı yoxlanılır (məs. age >= 6 && age <= 17). " +
                "! operatoru isə boolean nəticəni tərsinə çevirir - schoolAge true olduğu üçün " +
                "notSchoolAge false çıxır.");
    }
}
