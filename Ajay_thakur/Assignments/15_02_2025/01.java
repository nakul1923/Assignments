import java.util.*;

class MatchesSorting implements Comparator<Player>{

    public int compare(Player p1, Player p2){

        return p2.getMathcesPlayed()-p1.getMathcesPlayed();
    }

}

class NameSorting implements Comparator<Player>{

    public int compare(Player p1, Player p2){

        return p1.getPlayerName().compareTo(p2.getPlayerName());
    }
}

class Player implements Comparable<Player>{

    private int playerId;
    private String playerName;
    private int mathcesPlayed;
    private double averageScore;
    
    public Player(int playerId, String playerName, int mathcesPlayed, double averageScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.mathcesPlayed = mathcesPlayed;
        this.averageScore = averageScore;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getMathcesPlayed() {
        return mathcesPlayed;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId + ", playerName=" + playerName + ", mathcesPlayed=" + mathcesPlayed
                + ", averageScore=" + averageScore + "]";
    }

    public int compareTo(Player p){

        return (int)p.getAverageScore()-(int)this.getAverageScore();
    }

    
}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Set<Player> s = new TreeSet<Player>(new NameSorting());

        System.out.println("Enter the Number of players : ");
        int num = sc.nextInt();

        for(int i = 0; i<num; i++){

            System.out.println("Enter Details of " + (i+1)+ " Player");

            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name : ");
            String name = sc.nextLine();

            System.out.println("Enter Number of matches played : ");
            int matches = sc.nextInt();

            System.out.println("Enter Average : ");
            double average = sc.nextDouble();

            s.add(new Player(id, name, matches, average));
        }

        System.out.println(s);

    }
}