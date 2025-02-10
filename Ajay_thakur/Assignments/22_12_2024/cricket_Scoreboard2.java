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
    }match1.getOver();
    match1.getBall();
    match1.getRuns();
    match1.getBatsman();
    match1.getBowler();
    match1.getNonStriker();

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

    public void getOver(){

        System.out.println("over : " + over);
    }

    public void setBall(long ball){

        this.ball = ball;
    }

    public void getBall(){

        System.out.println("Ball : " + ball);
    }

    public void setRuns(long runs){

        this.runs = runs;
    }

    public void getRuns(){

        System.out.println("Runs : " + runs);
    }

    public void setBatsman(String batsman){

        this.batsman = batsman;
    }

    public void getBatsman(){

        System.out.println("Batsman : " + batsman);
    }

    public void setBowler(String bowler){

        this.bowler = bowler;
    }

    public void getBowler(){

        System.out.println("Bowler : " + bowler);
    }

    public void setNonStriker(String nonStriker){

        this.nonStriker = nonStriker;
    }

    public void getNonStriker(){

        System.out.println("NonStriker : " + nonStriker);
    }

}



class Main{

    public static void main(String[] args) {
        
        Delivery match1 = new Delivery();
        Delivery match2 = new Delivery(10,3,85,"Rohit Sharma","Mohammad Amir","Ishan Kishan");

        System.out.println("Output 1 : \n");
        match1.getOver();
        match1.getBall();
        match1.getRuns();
        match1.getBatsman();
        match1.getBowler();
        match1.getNonStriker();

        System.out.println();
        System.out.println("Output 2 : \n");
        match2.getOver();
        match2.getBall();
        match2.getRuns();
        match2.getBatsman();
        match2.getBowler();
        match2.getNonStriker();
        
    }
}