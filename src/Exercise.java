public class Exercise {
    private String exerciseName;
    private String description;
    private int duration;
    private Position aPosition;
    public enum Position {
        STAND_UP,
        FLOOR
    }

    public Exercise(String exerciseName, String description, int duration, Position position){
        this.exerciseName = exerciseName;
        this.description = description;
        this.duration = duration;
        this.aPosition = position;
    }

    public int getDuration() {
        return duration;
    }

    public Position getPosition() {
        return aPosition;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void printExercises() {
        System.out.format("%-50s" + "DURATION: " + "%d" + " seconds" + "%n", this.exerciseName, this.duration);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("DESCRIPTION: " + this.description + "\n\n");
    }
}
