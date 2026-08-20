public class Task01_Variables_Errors {
    public static void main(String[] args) {
        // int 3total = 100;

        //  int count;
        // System.out.println(count);

        // int number = "Aynur";

        // Netice:
        // 1) int 3total = 100; -> Error: "not a statement" və "';' expected"
        //    Səbəb: rəqəmlə başlayan ad compiler tərəfindən dəyişən adı kimi
        //    tanınmır, o, ədədlə (3) sözü (total) ayrı-ayrı oxumağa çalışır,
        //    nəticədə sətrin quruluşu pozulur.
        // 2) int count; System.out.println(count); -> Error: variable count might not have been initialized
        //    Səbəb: dəyişənə dəyər verilmədən istifadə oluna bilməz.
        // 3) int number = "Aynur"; -> Error: incompatible types: java.lang.String cannot be converted to int
        //    Səbəb: int tipli dəyişənə yalnız ədəd yazıla bilər, mətn (String) yox —
        //    Java statically typed dildir.
    }
}

