import java.util.ArrayList;

public class Database {

    private ArrayList<Bird> birdList;

    public Database() {
        this.birdList = new ArrayList<>();
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public void printAllBirds() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void printOneBird(String name) {
        for (Bird bird : this.birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println(birdNotFound());
    }

    public void addObservation(String name) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println(birdNotFound());
    }

    public String birdNotFound() {
        return "Not a bird!";
    }

    public ArrayList<Bird> getBirdList() {
        return this.birdList;
    }
}
