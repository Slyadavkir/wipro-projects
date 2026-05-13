import java.util.ArrayList;
import java.util.List;

public class Learner {

    private String name;
    private String video;
    private String mic;

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for video
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    // Getter & Setter for mic
    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public static void main(String[] args) {

        List<Learner> learnerslist = new ArrayList<>();

        Learner l1 = new Learner();
        l1.setName("sakshi");

        Learner l2 = new Learner();
        l2.setName("Mohit");
        l2.setVideo("On");

        Learner l3 = new Learner();
        l3.setName("Priyanshi");
        l3.setVideo("On");
        l3.setMic("On");

        learnerslist.add(l1);
        learnerslist.add(l2);
        learnerslist.add(l3);

        for (Learner obj : learnerslist) {
            System.out.println(obj.getName() + "\n" +
                               obj.getMic() +
                               "\n_____________________");
        }
    }
}