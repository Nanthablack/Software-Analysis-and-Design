class Student{
    private String id;
    private String name;
    private String height;
    public void setID(String sid){
        id = sid;
    }
    public String getID(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setHeight(String h){
        height = h;
    }
    public String getHeight(){
        return height;
    }
}

class StudentTest
{
    public static void main(String[] args){
        Student p = new Student();
        p.setID("43050359");
        p.setName("Kroekkiat Voravisuttikul");
        p.setHeight("168");
        System.out.println("Student ID :"+p.getID());
        System.out.println("Student Name :"+p.getName());
        System.out.println("Student Height :"+p.getHeight());
    }
}