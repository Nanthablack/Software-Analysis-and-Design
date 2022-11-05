class Book
{
    private String title;
    private String publish;

    public Book(String t){
        title = t;
    }

    public void setPublish(String p){
        publish = p;
    }
    public String getTitle(){
        return title;
    }
    public String getPublish(){
        return publish;
    }
}

class Bookapp
{
    public static void main(String[] args){
        Book b1 = new Book("EAT THAT FROG!");
        Book b2 = new Book("Comp Gamer News");

        b1.setPublish("Berrett-Koehier");
        b2.setPublish("ATTASARN");

        System.out.println(b1.getTitle()+","+b1.getPublish());
        System.out.println(b2.getTitle()+","+b2.getPublish());
    }
}