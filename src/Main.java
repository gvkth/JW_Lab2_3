public class Main {
    public static void main(String[] args) {
        /*BaseballCoach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());*/

        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}