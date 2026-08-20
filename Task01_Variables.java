public class Task01_Variables {
    public static void main(String[] args) {

        String name = "Aynur";          // ad -> mətn olduğu üçün String
        int age = 30;                   // yaş -> tam ədəd olduğu üçün int
        double height = 1.58;           // boy (metr) -> kəsr ədəd olduğu üçün double
        boolean isStudent = false;      // tələbəlik statusu -> true/false olduğu üçün boolean

        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Boy: " + height + " m");
        System.out.println("Tələbədir: " + isStudent);

        int score = 30;
        System.out.println("İlkin dəyər: " + score);
        score = 60;
        System.out.println("Yeni dəyər: " + score);
    }
}