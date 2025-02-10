class nakul{
    public static void main(String args[]){
        
        double wlim=20, whim=2, wtim=0.75;
        double wl= 20*100, wh=2*100, wt=0.75*100;

        double bl=25, bw=10, bt=7.5;

        double co100b = 900;

        double vosb= bl*bw*bt;

        double vow = wl*wh*wt;

        double nob= vow / vosb;

        double tc= nob / 1000 * co100b;

        System.out.println(tc);

}
}