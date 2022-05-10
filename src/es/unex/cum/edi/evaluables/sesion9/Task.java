package es.unex.cum.edi.evaluables.sesion9;
import java.util.Date;
public class Task implements Comparable{
    private int id;
    private Date fecha;
    private String name;
    private String description;
    private String nameSubject;
    private float mark; 
    public Task(){
        this.id=0;
        this.fecha=new Date();
        this.name="";
        this.description="";
        nameSubject="";
        this.mark=0.0F;

    }

    public Task (int id,Date d, String name,String desc, String nameSubject){
        this.id=id;
        this.fecha=d;
        this.name=name;
        this.description=desc;
        this.nameSubject=nameSubject;
        this.mark=0.0F;
    }

    public int getId(){return id;}
    public Date getFecha(){return fecha;}
    public String getName(){return name;}
    public String getDescription(){return description;}
    public String getNameSubject(){return nameSubject;}
    public float getMark(){return mark;}
    public void setMark(float m){ mark=m;}

    public int compareTo(Object ob){
        Task t=(Task) ob;
        return 0;
    }
}
