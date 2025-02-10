class Beta{

    int x;

    public static void main(String[] args) {
        
        int y;
        //x=100;

        Beta obj = new Beta();

        obj.x=100;
        
        //m9();

        obj.m9();
        m10();

    }

    void m9(){

        System.out.println("m9 non static");
    }

    static void m10(){

        System.out.println("m10 static");
    }
}