public class IntervalWorkout {
    private Exercise[] exercise;
    private int repetitions;
    private int breaktime;

    public IntervalWorkout(Exercise[] exercise, int repetitions, int breaktime) {
        this.exercise = exercise;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }
    public void printIntervalWorkout(){
        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");

        for(int i=1; i<=repetitions; i++){
            System.out.println("=============================");
            System.out.println("ROUND " + i + ":");
            for(Exercise aExercise : exercise)
                System.out.println(aExercise.getExerciseName());
            if(i < repetitions){
                System.out.println("=============================");
                System.out.println("DO THE BREAK (" + breaktime + " SECONDS)");
            }
        }
        System.out.println("\n*****************************");
        System.out.println(" CONGRATS - YOU ARE DONE !!!");
        System.out.println("*****************************");
    }
}
