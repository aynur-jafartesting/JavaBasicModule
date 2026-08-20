public class Task04_CharToIntCast {
    public static void main(String[] args) {

        char letter = 'A';
        int asciiValue = letter;   // implicit: char -> int

        System.out.println("letter = " + letter);
        System.out.println("(int) letter = " + asciiValue);

        System.out.println();
        System.out.println("İzah: Java-da char tipi əslində arxa planda 16-bit " +
                "unsigned rəqəmdir (Unicode/ASCII kod). 'A' hərfinin ASCII kodu 65-dir.");

        System.out.println();

        char reverseChar = (char) 66;
        System.out.println("(char) 66 = " + reverseChar);

        System.out.println();
        System.out.println("İzah: 66 rəqəminin ASCII cədvəlində qarşılığı 'B' hərfidir. " +
                "Bu, char <-> int arasında ikitərəfli çevrilmənin mümkün olduğunu göstərir.");
    }
}
