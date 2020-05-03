package Objects;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void removeCD() {
        System.out.println(location + " stereo removed the CD");
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void removeDVD() {
        System.out.println(location + " stereo removed the DVD");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }

    public void disableRadio() {
        System.out.println(location + " stereo disabled Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
