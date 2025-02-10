class Demo{

    public static void main(String[] args) {
        
        String str = "rashmika,radhika,pushpa";

        String arr[] = str.split(",");

        for(String s: arr){
            System.out.println(s);
        }
    }
}