import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] scores;
    char grade = 'O';

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.scores = testScores;
    }

    public void setScores(int[] testScores){
            scores = testScores;
    }

    public int[] getScores() {
        return scores;
    }
    public char calculate () {
        int sum = 0;
        int average = 0;
        for(int i=0; i < scores.length; i++){
            sum += scores[i];
        }
        average = (sum/scores.length);

        if(average<40)
            return 'T';
        else if(average<55)
            return 'D';
        else if(average<70)
            return 'P';
        else if(average<80)
            return 'A';
        else if(average<90)
            return 'E';
        else if(average<=100)
            return 'O';
        else
            return '0';
    }




    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
//    Student(String firstName, String lastName, int identification, int[] testScores) {
//        super(firstName, lastName, identification);
//    }
//    public Student(int[] testScores, char grade) {
//        super(firstName, lastName, idNumber);
//    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

}
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
