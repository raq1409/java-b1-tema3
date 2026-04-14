public class Developer extends Employee {

    // Private attribute: language
    private String language;

    // Constructor: receives id, name, salary, and language
    // Calls the superclass constructor and sets the language
	
    public Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        setLanguage(language);
    }

    // Getter for language
    public String getLanguage() {
        return language;
    }

    // Setter for language
    // If language is null or empty, print "Programming language cannot be empty."
    public void setLanguage(String language) {
        if(language == null || language.isEmpty()) { 
            System.out.println("Programming language cannot be empty.");
        } else {
            this.language = language;
        }
    }

    // Override toString()
    // Return: Developer: <id>, Name: <name>, Salary: <salary>€, Language: <language>
    @Override
    public String toString() {
        return "Developer: " + getId() + ", Name: " + getName() + ", Salary: " + getSalary() + "€, Language: " + language;
    }
}
