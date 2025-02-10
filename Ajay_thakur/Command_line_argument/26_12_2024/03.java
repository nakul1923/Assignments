class Beta{

    public static void main(String[] a) {
        
        int x = Integer.parseInt(a[0]);                    // converting string into int,double,boolean because we cannot perform operator on strings  
        double y = Double.parseDouble(a[1]);
        boolean z = Boolean.parseBoolean(a[2]);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
