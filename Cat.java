public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        
        //напишите тут ваш код
        Cat.catsCount = catsCount;
        System.out.println(catsCount);
    }

    public static void main(String[] args) {
         setCatsCount(25);
    }
}
