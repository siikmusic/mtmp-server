


import java.util.ArrayList;

public class Calculaction {
    private int angle;
    private int speed;
    private double time;
    public Calculaction() {
        angle = 0;
        speed = 0;
        time = 0;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double calculateTime(int speed, int angle) {
        this.time = (2*speed*(Math.sin(Math.toRadians(angle)))/9.8);

        this.speed = speed;
        this.angle = angle;
        return this.time;
    }
    public ArrayList<Double> calculateX() {
        ArrayList<Double> x = new ArrayList<>();
        for(double i = 0; i<time; i = i+ 0.01){
            Double xT = this.speed*i * Math.cos(Math.toRadians(angle));
            x.add(xT);
        }
        Double xT = this.speed*this.time * Math.cos(Math.toRadians(angle));
        x.add(xT);
        return x;
    }
    public ArrayList<Double> calculateY() {
        ArrayList<Double> y = new ArrayList<>();
        for(double i = 0; i<time; i = i+ 0.01){
            Double yT = this.speed*i * Math.sin(Math.toRadians(angle)) - (0.5)*9.8*i*i;
            y.add(yT);
        }
        Double yT = this.speed*this.time * Math.sin(Math.toRadians(angle)) - (0.5)*9.8*this.time*this.time;
        y.add(yT);
        return y;
    }
    public ArrayList<Double> calculateTime() {
        ArrayList<Double> time = new ArrayList<>();
        for(double i = 0; i<this.time; i = i+ 0.01){
            Double timeT = i;
            time.add(timeT);
        }
        time.add(this.time);
        return time;
    }
}
