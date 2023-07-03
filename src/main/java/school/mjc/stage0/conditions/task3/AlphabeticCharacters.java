package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char charter) {
        if (charter >= 65 && charter <= 90 || charter >= 97 && charter <= 122) {
            if (charter == 65 || charter == 69 || charter == 73 || charter == 79 || charter == 85 || charter == 89 || charter == 97 || charter == 101 || charter == 105 || charter == 111 || charter == 117 || charter == 121) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}