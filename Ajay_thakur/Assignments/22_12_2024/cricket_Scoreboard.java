class Delivery{

    private long over;
    private long ball;
    private long runs;
    private String batsman;
    private String bowler;
    private String nonStriker;

    Delivery(){                     //Default Constructor

        over = 1;
        ball = 1;
        runs = 4;
        batsman = "Philip Salt";
        bowler = "Mitchel Stark";
        nonStriker = "Will Jacks";
    }

    Delivery(long over,long ball, long runs, String batsman, String bowler, String nonStriker){       //Parameterized Constructor

        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }
;
    public void setOver(long over){

        this.over = over;
    }

    public long getOver(){

        return over;
    }

    public void setBall(long ball){

        this.ball = ball;
    }

    public long getBall(){

        return ball;
    }

    public void setRuns(long runs){

        this.runs = runs;
    }

    public long getRuns(){

        return runs;
    }

    public void setBatsman(String batsman){

        this.batsman = batsman;
    }

    public String getBatsman(){

        return batsman;
    }

    public void setBowler(String bowler){

        this.bowler = bowler;
    }

    public String getBowler(){

        return bowler;
    }

    public void setNonStriker(String nonStriker){

        this.nonStriker = nonStriker;
    }

    public String getNonStriker(){

        return nonStriker;
    }

}



class Main{

    public static void main(String[] args) {
        
        Delivery match1 = new Delivery();
        Delivery match2 = new Delivery(10,3,85,"Rohit Sharma","Mohammad Amir","Ishan Kishan");

        System.out.println(match1.getBowler());
        System.out.println(match2.getRuns());

    }
}