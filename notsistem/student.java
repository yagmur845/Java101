package notsistem;

public class student {
    String name,stuNo;
    int classes;
    classes mat;
    classes fizik;
    classes kimya;
    double avarage;
    boolean isPass;
    int note;


    student(String name, int classes, String stuNo, classes mat,classes fizik,classes kimya,note) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        //calcAvarage();
        this.isPass = false;
    }

    void addBulkExameNote(int mat,int fizik,int kimya){
        if (mat>=0&& mat<=100){
            mat.note =mat;
        }
    }

}
