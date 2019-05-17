public class Main {

    public static void main(String[] args) {
        Exercise ex1 = new Exercise("Push-ups", "Place your hands on the floor. Raise up onto " +
                "your toes so\nthat all of your body weight is on your hands and your feet. Bend your\nelbows and lower" +
                " your chest down toward the floor. Then, push off the\nfloor and extend them so that you return to " +
                "starting position.",
                30, Exercise.Position.FLOOR);
        Exercise ex2 = new Exercise("Planks", "Start on the floor on your hands and knees. " +
                "Lower your\nforearms to the floor with elbows positioned under your shoulders and\nyour hands " +
                "shoulder-width apart. Maintain a straight line from heels\nthrough the top of your head, looking down" +
                " at the floor. Now, tighten\nyour abs and hold.",
                90, Exercise.Position.FLOOR);
        Exercise ex3 = new Exercise("Squats", "Stand with feet a little wider than " +
                "shoulder-width apart,\nhips stacked over knees, and knees over ankles. Extend arms out\nstraight so " +
                "they are parallel with the ground, palms facing down. Goto\na squat and exhale, then explode back up" +
                " to standing, driving through\nheels.",
                45, Exercise.Position.STAND_UP);
        Exercise ex4 = new Exercise("Backward Kick", "Get in an all-fours position with your" +
                " knees and hands on\nthe floor. Your back is straight. Lift your leg up, and straighten it.\nForm" +
                " constantly forming a 90 degree angle in between the legs. Return\nto the starting position and repeat",
                60, Exercise.Position.FLOOR);
        Exercise ex5 = new Exercise("Leg Curl", "Stand up on, shift your weight to one feet and" +
                " pull\nanother heel toward your buttocks. Stay 15 seconds, then repeat\nwith your other leg.",
                90, Exercise.Position.STAND_UP);
        Exercise ex6 = new Exercise("Sidewards Back Stretch", "Go into standing position, put " +
                "your hands on your hips and\nthen stretch with one hand over your head to the opposite side. Repeat\n" +
                "with other hand.",
                60, Exercise.Position.STAND_UP);

        Exercise[] exercises = {ex1, ex2, ex3, ex4, ex5, ex6};

        for(Exercise aExercise : exercises){
            aExercise.printExercises();
        }
        for(Exercise aExercise : exercises){
            if(aExercise.getPosition().equals(Exercise.Position.FLOOR)){
                aExercise.printExercises();
            }
        }
        for(Exercise aExercise : exercises){
            if(aExercise.getPosition().equals(Exercise.Position.FLOOR) && aExercise.getDuration() > 60){
                aExercise.printExercises();
            }
        }
// BONUS
        Exercise[] intervalWorkout = {ex1, ex3, ex2};
        IntervalWorkout iW1 = new IntervalWorkout(intervalWorkout, 4, 30);
        iW1.printIntervalWorkout();

    }
}
