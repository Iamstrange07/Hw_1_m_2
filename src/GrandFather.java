public class GrandFather {
    private Agee age;
    private AgeEnum ageEnum;
    private Job work;
    private Family family;

    public GrandFather(Agee age, AgeEnum ageEnum, Job work, Family family) {
        this.age = age;
        this.ageEnum = ageEnum;
        this.work = work;
        this.family = family;
    }

    public Agee getAge() {
        return age;
    }

    public AgeEnum getAgeEnum() {
        return ageEnum;
    }

    public Job getWork() {
        return work;
    }

    public Family getFamily() {
        return family;
    }
    public String getInfo() {
        return "Who :"+this.getClass()+
                "\nHow old :" + age +
                "\nAgeness : " + ageEnum +
                "\nJob : " +work +
                "\nFamily : " + family+
                "\n";
    }
}
