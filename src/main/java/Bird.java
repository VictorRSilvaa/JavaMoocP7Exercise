public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observations++;
    }

    public String toString() {
        String printOutput = this.name + " (" + this.latinName + "): " + this.observations;
        if (this.observations == 1) {
            return printOutput + " observation";
        }

        return printOutput + " observations";
    }
}
