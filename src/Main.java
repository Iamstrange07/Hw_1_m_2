import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dad objectA=new Dad(Agee.MORE_THAN_30_AND_LESS_THAN_60,AgeEnum.ADULT,Job.EMPLOYED,Family.MARRIED,Fullness.NOTFULL);
        Son objectB=new Son(Agee.LESS_THAN_30,AgeEnum.TEENAGER,Job.UNEMPLOYED,Family.TOO_YOUNG,Fullness.NOTFULL,Type.NERD);
        Son objectC=new Son(Agee.LESS_THAN_30,AgeEnum.ADULT,Job.EMPLOYED,Family.SINGLE,Fullness.NOTFULL,Type.GOOD_BOY);
        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
        objectA.workness1("programmer");
        objectB.workness2("student");
        objectC.workness("Owner of company");



    }
}