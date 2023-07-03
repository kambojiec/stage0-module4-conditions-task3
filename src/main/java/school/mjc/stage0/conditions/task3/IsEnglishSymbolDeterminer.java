package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        boolean isLatin = (symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z');
        if (isLatin){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
