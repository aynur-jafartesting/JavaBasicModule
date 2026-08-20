public class Task06_ImmutabilityDemo {
    public static void main(String[] args) {

        String original = "Avtomatlasdirma testleri hər gün ishlenir";
        String modified = original.replace(" ", "_");

        System.out.println("Orijinal (dəyişməzdən əvvəl): " + original);
        System.out.println("Dəyişdirilmiş (yeni String): " + modified);
        System.out.println();
        System.out.println("Orijinal indi də: " + original);

        System.out.println();
        System.out.println("İzah: replace() metodu original String-i DƏYİŞMİR, " +
                "əksinə yeni bir String yaradıb geri qaytarır. Ona görə 'original' " +
                "dəyişəni hələ də ilkin dəyərini saxlayır - bu, String-in immutable " +
                "(dəyişməz) olduğunu sübut edir.");
    }
}
