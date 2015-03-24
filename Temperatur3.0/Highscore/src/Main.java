
 public class Main {
    public static void main(String[] args) {
        Highscore hm = new Highscore();
        hm.addScore("Bart",540);
        hm.addScore("Marge",430);
        hm.addScore("Maggie",420);
        hm.addScore("Homer",100);
        //hm.addScore("Lisa",700);
        
        /*hm.addScore("Bart",0);
        hm.addScore("Marge",0);
        hm.addScore("Maggie",0);
        hm.addScore("Homer",0);
        hm.addScore("Lisa",0);*/
        
        hm.rewriteScore("Lisa",5);
        hm.rewriteScore("Bart",1);

        System.out.println(hm.getHighscoreString());
    }
}