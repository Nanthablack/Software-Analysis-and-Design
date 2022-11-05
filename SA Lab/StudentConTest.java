class StudentConTest
{
    public static void main(String[] args){
        StudentCon x = new StudentCon();
        StudentCon y = new StudentCon(359,"Maliz");
        StudentCon z = new StudentCon(y);

        System.out.println(x.getId()+","+x.getName());
        System.out.println(y.getId()+","+y.getName());
        System.out.println(z.getId()+","+z.getName());

        x.setId(426); x.setName("Bon");

        System.out.println("\n"+x.getId()+","+x.getName());
    }
}
class StudentCon
{
    private int id;
    private String name;

    public StudentCon(){
        id = 0;
        name = null;
    }
    public StudentCon(int i,String n){
        id = i; name = n;
    }
    public StudentCon(StudentCon s){
        id = s.id; name = s.name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}