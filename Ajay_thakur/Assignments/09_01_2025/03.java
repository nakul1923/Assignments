/*
 *  Library Management System
Objective: Manage library operations using an interface.

Define an interface LibraryOperations with methods issueBook() and returnBook().
Implement the interface in Student and Teacher classes.
Demonstrate how students and teachers interact with the library differently.
 */

interface LibraryOperations{

    void issueBook(String title,String dateOfIssue);

    void returnBook(String title,String dateOfReturn);

}

class Student implements LibraryOperations{

    String title;
    String dateOfIssue;
    String dateOfReturn;

    // Student(String title, String dateOfissue, String dateOfReturn){

    //     this.
    // }

    public void issueBook(String title,String dateOfIssue){

        System.out.println("Title: " + title);

        System.out.println("Date of Issue : " + dateOfIssue);

    }

    public void returnBook(String title,String dateOfReturn){

        System.out.println("Title: " + title);

        System.out.println("Date of Issue : " + dateOfReturn);
    }
}

class Main{

    public static void main(String[] args) {
        
        LibraryOperations s1 = new Student();

        s1.issueBook("java and DSA","01/01/2025");
        s1.returnBook("java and DSA", "15/01/2025");
    }
}


