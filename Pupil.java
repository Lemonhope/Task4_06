package Task4_06;

public class Pupil {
    public void study(){
        System.out.println("studying.");
    }
    public void read(){
        System.out.println("reading.");
    }
    public void write(){
        System.out.println("writing.");
    }
    public void relax(){
        System.out.println("relaxing.");
    }

}
class ExcellentPupil extends Pupil{
    public void study(){
        System.out.println("Excellent study!");
    }
    public void read(){
        System.out.println("Excellent reading!");
    }
    public void write(){
        System.out.println("Excellent writing!");
    }
    public void relax(){
        System.out.println("Excellent relaxing!");
    }
}
class GoodPupil extends Pupil{
    public void study(){
        System.out.println("Good study!");
    }
    public void read(){
        System.out.println("Good reading!");
    }
    public void write(){
        System.out.println("Good writing!");
    }
    public void relax(){
        System.out.println("Good relaxing!");
    }
}
class BadPupil extends Pupil{
    public void study(){
        System.out.println("Bad study!");
    }
    public void read(){
        System.out.println("Bad reading!");
    }
    public void write(){
        System.out.println("Bad writing!");
    }
    public void relax(){
        System.out.println("Bad relaxing!");
    }
}