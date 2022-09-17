import java.util.Arrays;

final public class Son extends Dad {
    private Type type;

    public Son(Agee age, AgeEnum ageEnum, Job work, Family family, Fullness fullness,Type type) {
        super(age, ageEnum, work, family, fullness);
        this.type=type;
    }


    public void workness2(String unemployed){
        System.out.println("Anyway good son");
    }
    public String getInfo(){
        return  super.getInfo()+
                "\nType : "+type;
    }
}
