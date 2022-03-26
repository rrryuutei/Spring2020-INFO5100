package Question4;

public class Main {

    public static void compare(Player[] play,int i,int j) {
        if( play[i].getScore()>play[j].getScore() ) {
            exchage(play, i, j);
        }else if( play[i].getScore()==play[j].getScore() ) {
            if( play[i].getName().compareTo(play[j].getName())>0 ) {
                exchage(play, i, j);
            }
        }
    }

    public static void exchange(Player[] play,int i,int j) {
        Player temp = play[i];
        play[i] = play[j];
        play[j] = temp;
    }

    public static void main(String[] args) {
        Player p1 = new Player("A", 90);
        Player p2 = new Player("B", 96);
        Player p3 = new Player("C", 99);
        Player p4 = new Player("D", 100);
        Player p5 = new Player("E", 90);
        Player[] arr = {p1,p2,p3,p4,p5};
        for( int i=arr.length-1; i>0; i-- ) {
            for( int j=0; j<i; j++ ) {
                compare(arr, i, j);
            }
        }
        for( Player p:arr ) {
            System.out.println(p.getName()+":"+p.getScore());
        }
    }

}
