class Product{

    private long pId ;
    private String pName;
    private double pPrice;
    private String pLocation;
    private String pType ;

    public void setpId(long pId){

        this.pId = pId ;
    }

    public long getpId() {

        return pId;
    }

    public void setpName(String pName){

        this.pName = pName ;
    }

    public String getpName() {
        return pName;
    }

    public void setpPrice(double pPrice){

        this.pPrice = pPrice ;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpLocation(String pLocation){

        this.pLocation = pLocation ;
    }

    public String getpLocation() {
        return pLocation;
    }

    public void setpType(String pType){

        this.pType = pType ;
    }

    public String getpType() {
        return pType;
    }
}

class Demo {
    
    public static void main(String[] args) {
        
        Product a[] = new Product[4];

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        p1.setpId(101);
        p1.setpName("goldex");
        p1.setpPrice(10);
        p1.setpLocation("room1");
        p1.setpType("pen");

        p2.setpId(102);
        p2.setpName("natraj");
        p2.setpPrice(20);
        p2.setpLocation("room2");
        p2.setpType("pencil");

        p3.setpId(103);
        p3.setpName("doms");
        p3.setpPrice(30);
        p3.setpLocation("room3");
        p3.setpType("sharpner");

        p4.setpId(104);
        p4.setpName("apsara");
        p4.setpPrice(40);
        p4.setpLocation("room4");
        p4.setpType("eareser");

        a[0] = p1 ;
        a[1] = p2 ;
        a[2] = p3 ;
        a[3] = p4 ;

        for(Product x:a){

            System.out.println(x.getpId() + " : " + x.getpName() + " : " + x.getpPrice() + " : " + x.getpLocation() + " : " + x.getpType());
        }

}
}
