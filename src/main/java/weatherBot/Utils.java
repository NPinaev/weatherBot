package weatherBot;

public class Utils {

    public static final String botName = "simple_weather_bot";

    public static final String botToken = "1425047546:AAFTW1jjhWb9mW5oapEEuCdGITJF6PPt9zk";

    public static String getURL(String location) {
        return "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&units=metric&appid=94769a67672236c6cdf1ece81ded3350";
    }

}
