/*
 * program of introduction of setter and getter
 */

class Person{

    private int id;
    private String name;


    public void setId(int id){

        this.id = id;
    }

    public int getId(){

        return id;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }
}

class Demo {

    public static void main(String[] args) {
        
        Person p1 = new Person();

        p1.setId(101);

        System.out.println(p1.getId());

        p1.setName("pushpa");

        System.out.println(p1.getName());

    }


}
