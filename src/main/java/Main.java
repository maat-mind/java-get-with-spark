import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/users", (req, res) ->  "efectivamente funciona");
    }
}