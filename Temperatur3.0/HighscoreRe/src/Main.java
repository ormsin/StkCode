
 public class Main {
    public static void main(String[] args) {
        Highscore hm = new Highscore();
        hm.rewriteScore("Bart",540);
        hm.rewriteScore("Marge",430);
        hm.rewriteScore("Maggie",420);
        hm.rewriteScore("Homer",250);
        hm.rewriteScore("Lisa",600);
        hm.rewriteScore("Bart",50);
        hm.rewriteScore("Mark",50);

        System.out.println(hm.getHighscoreString());
        //System.out.println("index 1 = "+hm.bestimmteAngabe());
        //System.out.println(hm.bestimmteName(0));
        

    }
}