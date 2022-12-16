public class Student {
    private String name;
    private int points;
    private static int highestPoints;
    private static int totalPoints;

    public Student (String name) {
        this.name = name;
    }

    public void addPoints(int points) {
        this.points += points; totalPoints += points;
        if (this.points > highestPoints) {
            highestPoints = this.points;
        }
    }

    public String studentInfo() {
        return ("Student: " + name + "\nPoints: " + points);
    }

    public static int getTotalPointsEarned () {
        return totalPoints;
    }

    public static int getGreatestPoints () {
        return highestPoints;
    }
}
