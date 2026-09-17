package lab0;
public class Tv {
    public int channel;
    public int brightness;
    public float gamma;
    public String name;

    Tv (){
        channel = 1;
        brightness = 50;
        gamma = 2.0f;
        name = "default";
    }
    Tv (int c, int b , float g , String n){
        channel = c;
        brightness = b;
        gamma = g;
        name = n;
    }
    Tv (String n){
        channel = 1;
        brightness = 50;
        gamma = 2.0f;
        name = n;
    }
}
