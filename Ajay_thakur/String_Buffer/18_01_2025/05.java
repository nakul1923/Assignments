class Demo{

    public static void main(String[] args) {
        
        String str1 = "rashmika";

        StringBuffer str2 = new StringBuffer(str1);
        str2.delete(2, 5);
        System.out.println(str2);
        System.out.println(str1);
        str1 = str2.toString();
        System.out.println(str1);
    }
}