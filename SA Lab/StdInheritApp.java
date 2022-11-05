class Student{
    protected int id;
    protected String firstName;
    protected String lastName;

    public Student(){}
    public Student(int sid,String first,String last){
        id = sid;
        firstName = first;
        lastName = last;
    }
    public int getId(){return id;}
    public String getFirst(){return firstName;}
    public String getLast(){return lastName;}
}

class ScoreStudent extends Student{
    protected double score;
    public ScoreStudent(int sid,String sfirst,String slast,double sc){
        id = sid;
        firstName = sfirst;
        lastName = slast;
        score = sc;
    }
    public double getScore(){return score;}
}

class GradeStudent extends Student{
    protected String thesis;
    public GradeStudent(int i,String fn,String ln,String t){
        id = i;
        firstName = fn;
        lastName = ln;
        thesis = t;
    }
    public String getThesis(){return thesis;}
}

class StdInheritApp{
    static void printStudent(Student s){
        System.out.println(s.getId()+","+s.getFirst()+","+s.getLast());
    }
    static void printScoreStd(ScoreStudent ss){
        System.out.println(ss.getId()+","+ss.getFirst()+","+ss.getLast()+",Score ="+ss.getScore());
    }
    static void printGradStudent(GradeStudent g){
        System.out.println(g.getId()+","+g.getFirst()+","+g.getLast()+","+g.getThesis());
    }
    public static void main(String[] args){
        double m,sd;
        ScoreStudent s = new ScoreStudent(43050391,"Pop","Kiatkulkumjom",54);
        GradeStudent g = new GradeStudent(43050416,"Fa","Inlong","Object-oriented Technology");
        printStudent(s); printStudent(g);
        printScoreStd(s); printGradStudent(g);
    }
}