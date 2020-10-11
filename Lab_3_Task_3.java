import java.util.*;

public class Lab_3_Task_3 {
    public static void main(String[] args){
        String text = ("The study comes out as debate continues among psychologists and other health " +
                "professionals regarding the effects of violent media on youth. An APA task force is conducting a comprehensive " +
                "review of research on violence in video games and interactive media and will release its findings later this year " +
                "Important research has already been conducted for decades on the negative effects of gaming, including addiction, " +
                "depression and aggression, and we are certainly not suggesting that this should be ignored, says Isabela Granic, PhD, of " +
                "Radboud University Nijmegen in The Netherlands, lead author of the article. However, to understand the impact of video games on " +
                "children's and adolescents' development, a more balanced perspective is needed. While one widely held view maintains that playing " +
                "video games is intellectually lazy, such play actually may strengthen a range of cognitive skills such as spatial navigation, " +
                "reasoning, memory and perception, according to several studies reviewed in the article. This is particularly true for shooter " +
                "video games, which are often violent, the authors found. A 2013 meta-analysis found that playing shooter video games improved a " +
                "player's capacity to think about objects in three dimensions just as well as academic courses designed to enhance these same skills, " +
                "according to the study.");
        TextManipulation text1 = new TextManipulation(text);
        System.out.println("Number of words " + text1.getWords(text));
        System.out.println("Number of senetences " + text1.getSentences(text));

        System.out.println("Number of vowels and consonants " + text1.getVowelsAndConsonants(text));
    }

}
class TextManipulation{

    String text;

    public TextManipulation(String text) {
        this.text = text;
    }

    public int getWords(String text){
        int words = 0;
        for(int i = 0;i < text.length();i++){
            char ch = text.charAt(i);
            if (ch == ' '|| ch == ','|| ch == '.'){
                words ++;
            }
        }
        return words;
    }
    public int getSentences(String text){
        int sentences = 0;

        for(int i = 0;i < text.length();i++){
            char ch = text.charAt(i);
            if (ch == '.'){
                sentences ++;
            }
        }
        return sentences;
    }

    public List<Integer> getVowelsAndConsonants(String text){
        text = text.toLowerCase();
        int vowels = 0,consonants = 0,characters = 0;
        for (int i=0 ; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'){
                vowels ++;
            }else if(ch == '.'|| ch == ' '|| ch == ',' ||ch == '\''|| ch == '!' ||ch == '?'){
                characters ++;
            }else{
                consonants++;
            }
        }
        List<Integer> VowelsConsonants = new ArrayList();
        VowelsConsonants.add(vowels);
        VowelsConsonants.add(consonants);
        return VowelsConsonants;
    }

}
