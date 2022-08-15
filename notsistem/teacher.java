package notsistem;

public class teacher {
    String name;
    String phone;
    String branch;

    teacher(String name,String phone,String branch){
        this.name=name;
        this.phone=phone;
        this.branch=branch;
    }

    void print(){
        System.out.println("Ad:"+this.name);

        System.out.println("Bölüm:"+this.branch);
        System.out.println("Telefon:"+this.phone);
    }
}
