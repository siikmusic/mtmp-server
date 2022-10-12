
import com.google.gson.Gson;

import static spark.Spark.*;

public class MyServer {
    public static void main(String[] args) {

        get("/hello", (req, res)->"Hello, world");

        get("/computation", (req,res)->{
            res.type("application/json");
            int angle = Integer.parseInt(req.queryParams("angle"));
            int velocity = Integer.parseInt(req.queryParams("velocity"));
            Result result = new Result();
            Calculaction calculaction = new Calculaction();
            calculaction.calculateTime(velocity,angle);
            result.setTime(calculaction.calculateTime());
            result.setX(calculaction.calculateX());
            result.setY(calculaction.calculateY());
            return new Gson().toJson(result);

        });
    }
}