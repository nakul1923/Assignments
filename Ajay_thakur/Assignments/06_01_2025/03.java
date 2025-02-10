abstract class Course{

    String courseName;
    int duration;

    Course(String courseName, int duration){

        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void showContest();

    void displayDetails(){

        System.out.println("Course Name: " + courseName + "\nDuration: " + duration);
    }
}

class ProgrammingCourse extends Course{

    String language ;

    ProgrammingCourse(String courseName, int duration, String language){

        super(courseName,duration);
        this.language = language;
    }

    void showContest(){

        System.out.println("This course covers programming in " + language);
    }
}

class DesignCourse extends Course{

    String tool;

    DesignCourse(String courseName, int duration, String tool){

        super(courseName,duration);
        this.tool = tool;
    }

    void showContest(){

        System.out.println("This focuses on design using " + tool);
    }
}

class Beta{

    public static void main(String[] args) {
        
        Course obj1 = new ProgrammingCourse("data analyst", 12, "Java");

        obj1.showContest();
        obj1.displayDetails();

        Course obj2 = new DesignCourse("Delta", 20, "VS code");

        obj2.showContest();
        obj2.displayDetails();
    }
}