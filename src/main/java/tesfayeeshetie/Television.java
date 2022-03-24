package tesfayeeshetie;

public class Television extends ServiceCommunicator {

    Television( String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

    public static void getShow (String inputTVShow) {
        Television TV = new Television(inputTVShow);
        TV.connect();
        System.out.println(TV.get());
    }

 }
