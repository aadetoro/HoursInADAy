package FlexiInternsBackend;

interface HoursCalculator{
     int getHours();
     void displayHours();

     //to convert one hour to a day
     double Onehour = (0.0416 *24);
     int day= (int) Math.round(Onehour * (24));


}
public class HoursInADay implements HoursCalculator {
@Override
    public int getHours(){

    return day;
}

    @Override
    public void displayHours(){
        System.out.println("We have " + getHours() + "hours in a Day");
    }

    public static void main(String[] args) {
        HoursInADay hd = new HoursInADay();
        hd.displayHours();
    }
}
