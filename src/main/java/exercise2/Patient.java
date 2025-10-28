package exercise2;

public class Patient {

    //TODO: Declare Private Attributes
    private String name;
    private int age;
    private int height;
    private int weight;
    private String gender;
    private String sickness;

    //TODO: Create Constructor
    public Patient(String name, int age, int height, int weight, String gender, String sickness) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.sickness = sickness;
    }

    public void setSickness(String sickness) {

    }

    //TODO: Add Getter and Setter Methods


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("ugly")) {

        } else {
            this.name = name;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSickness() {
        return sickness;
    }

    /*
    public String getBetter () {
            if (sickness.equals("physical")) {
                sickness = "curable";
                return sickness + "take medicine";
            }

            else {
               return sickness + " mental " + " not fully treatable with medicine " +
                       " recommended therapy and medicine,"
                       ;
            }
    }
    */
    //TODO: Add toString Method
    @Override
    public String toString() { // da wird nichts ausgeführt nur zurückgegeben also ausgeprintet on command
        return "Patient " +
                " | name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight +
                ", gender=" + gender + ", sickness=" + sickness;

    }
}
