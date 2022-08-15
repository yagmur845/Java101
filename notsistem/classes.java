package notsistem;

public class classes {
    String name;
    String code;
    String prefix;
    int note;
    teacher teacher;

    classes(String name,String code,String prefix,teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;
    }

    void  addTeacher(teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printeacher();
        }
        else{
            System.out.println("öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void print(){
        System.out.println("Ad:"+this.name);
        System.out.println("Kod:"+this.code);
        System.out.println("Prefix:"+this.prefix);
    }
    void printeacher(){
        this.teacher.print();
    }
}
