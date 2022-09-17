import java.util.Arrays;
import java.util.Random;

public class Dad extends GrandFather {
   private Fullness fullness;
   private String working="boss";
    private String working2="worker";
    private String unemployed="unemployed";

    public Dad(Agee age, AgeEnum ageEnum, Job work, Family family,Fullness fullness) {
        super(age, ageEnum, work, family);
        this.fullness=fullness;
    }


    public String getInfo(){
        return  super.getInfo()+
                "\nFullness : "+fullness;
    }
    public void workness(String working){
        System.out.println("very Good job");
    }
    final public void workness1(String working2){
        System.out.println("Good job");
    }
    public void workness2(String unemployed){
        System.out.println("Bad dad");
    }

}
