public class Employee {
    private String first;
    private String last;
    private int currentID;
    private static int ID = 101;
    private static int numOfWorkers = 0;

    public Employee (String first, String last) {
        this.first = first;
        this.last = last;
        currentID = ID;
        ID++;
        numOfWorkers ++;
    }

    public int getCurrentID() {
        return currentID;
    }

    public static int getrecentID() {
        return ID - 1;
    }

    public String getName() {
        return first + " " + last;
    }

    public static int getNumOfWorkers () {
        return numOfWorkers;
    }

    public String employeeInfo() {
        return ("Employee's full name: " +  getName() + "\nEmployee's ID: " + getCurrentID());
    }

    public static String classInfo() {
        return ("Most recent ID assigned: " + getrecentID() + "\nTotal employees hired: " + getNumOfWorkers());
    }
}
