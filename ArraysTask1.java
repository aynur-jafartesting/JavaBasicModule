public class ArraysTask1 {
    public static void main(String[] args) {

        String[] movies = {
                "I Origins",
                "Mr. Nobody",
                "Collateral Beauty",
                "Begin Again",
                "Meet Joe Black (1998)"
        };

        System.out.println("For-each:");

        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nNomrelenmis siyahi:");

        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }
    }
}
