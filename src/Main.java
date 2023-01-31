/**************************************************************
 * XP EXERCICE NINJA
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
public class Main {
    public static void main(String[] args) {

        Persona defaultPersona = new Persona(); // instance of Persona class
        defaultPersona.displayInfo();

        PlayWithDataType datas = new PlayWithDataType(); // instance of PlayWithData class

        System.out.println(datas.getChildren());
        System.out.print(datas.getIsCelibatary());
        System.out.print(datas.getGender());
        System.out.print(datas.getFullName());

       datas.setCelibatary(false);
        datas.setChildren(2);
        datas.setAverage(67);
        datas.setPriceByHour(7.0);

        datas.castValue();
        datas.salaryByWeek();
        datas.compareValue();

        Person defaultPerson = new Person(); // instance of Person class
        Person secondPerson = new Person("Pacome aristide",45,'M');
        Person thirdPerson = new Person("Risse belo", 8);

        defaultPerson.displayInfo();
        secondPerson.displayInfo();
        thirdPerson.displayInfo();

    }
}

/**
 *
 * Exercise 1 : Data Types
 * ------------------------------------------------------------
 * 1- Create a program that declares and initializes variables of different data types:
 *   - an integer variable named “age” and initialize it with your age
 *   - a double variable named “weight” and initialize it with your weight
 *   - a boolean variable named “isStudent” and initialize it with true or false depending on whether you are currently a student or not
 *   - a char variable named “gender” and initialize it with ‘M’ or ‘F’ depending on your gender
 *   - a String variable named “name” and initialize it with your name
 * 2- Create a method called “displayInfo” that takes no arguments and prints out the values of all variables in the following format “Name: <name>, Age: <age>, Gender: <gender>, Weight: <weight>, IsStudent: <isStudent>“
 * 3- In the main method, call the “displayInfo” method to display the values of the variables.
 *
 */
class  Persona{
    private int age= 26;
    private double weight = 48.0;
    private boolean isStudent = true;
    private char gender = 'F';
    private String name ="Melissa Kouadio";

    public void displayInfo() {
        String recap = "Name: <"+this.name+"> Age : <" + this.age +"> Gender <"+ this.gender + ">Weight: <"+ this.weight +"> IsStudent: <"+ this.isStudent +">";
        System.out.println(recap);
    }
}

/**
 *
 * Exercise 2 : Intermediate Data Type
 * -----------------------------------------------------------------------------
 * 1- Create a program that declares several variables of different data types,
 *    including at least one variable of each of the following types: int, double, char, and boolean:
 *   - an integer variable named “age” and initialize it with your age
 *   - a double variable named “weight” and initialize it with your weight
 *   - a boolean variable named “isStudent” and initialize it with true or false depending on whether you are currently a student or not
 *   - a char variable named “gender” and initialize it with ‘M’ or ‘F’ depending on your gender
 *   - a String variable named “name” and initialize it with your name
 * 2- Assign values to each of the variables.
 * 3- Print the value of each variable to the console using the appropriate method
 *    (e.g. System.out.println() for printing numbers, and System.out.print() for printing characters and booleans).
 * 4- Modify the values of the variables and print the new values to the console.
 * 5- Use at least one type casting operation in the program, such as casting a double to an int
 * 6- Use at least one mathematical operation, such as addition or multiplication, with the variables.
 * 7- Use at least one comparison operator, such as > or ==, to compare the values of two or more variables.
 * 8- Use at least one control flow statement, such as an if-else statement or a switch statement,
 * to make a decision based on the values of the variables.
 * 9- Add comments to your code to explain what it is doing at each step.
 * 10- Test your program with different inputs and debug any errors that you encounter
 *
 */

class PlayWithDataType {
    private boolean isCelibatary = false;
    private int children = 0;
    private String currentJob = "freelance dev";
    private double priceByHour = 9.16;
    private float average = 15;
    private String fullName ="Roberto robert";
    private char gender = 'M';


    public double getPriceByHour() {
        return priceByHour;
    }

    public float getAverage() {
        return average;
    }

    public int getChildren() {
        return children;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getIsCelibatary() {
        return isCelibatary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCelibatary(boolean celibatary) {
        this.isCelibatary = celibatary;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPriceByHour(double priceByHour) {
        this.priceByHour = priceByHour;
    }

    public int castValue() {
        int integerVal = (int) this.priceByHour;
        return integerVal;
    }

    public int salaryByWeek() {

        int timeWorking = 4;
        double moneyByDay = this.priceByHour * timeWorking;
        double moneyByWeek = moneyByDay *5;

        return (int) moneyByWeek;
    }

    public String compareValue(){

        String message = "";
        if(this.gender == gender ) { // if gender is 'M' log user is man else is woman
            message = "You are a Man";
        } else { message = "You are a woman";}

        return message;
    }
}
/**
 *
 * Exercise 3: Intermediate Data Type
 * ------------------------------------------------------
 * 1-Create a class called “Person” that has the following fields: name (String), age (int), and gender (char)
 * 2- Create a default constructor that initializes the name to “Unknown”, age to 0, and gender to ‘U’
 * 3- Create a second constructor that takes in three parameters: name, age, and gender.
 *   This constructor should initialize the fields of the Person class with the values passed in as parameters.
 * 4- Create a third constructor that takes in two parameters: name and age.
 *    This constructor should initialize the name and age fields with the values passed in as parameters, and should set the gender field to ‘U’.
 * 6- Create a method called “displayInfo” that displays the name, age, and gender of the person.
 * 7- In the main method, create three Person objects using the three constructors you created.
 * 8- Call the displayInfo method for each of the three <Person> objects to display their information.
 *
 */
class Person {
    private String name;
    private  int age;
    private char gender;

    Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'U';
    }
    Person(String _name, int _age, char _gender) {
        this.name = _name;
        this.age = _age;
        this.gender = _gender;
    }

    Person(String _name, int _age ) {
        this();
        this.name = _name;
        this.age = _age;
    }

    public void displayInfo(){
        String info = this.name + " has "+ this.age + " his gender is" + this.gender;
        System.out.print(info);
    }
}
