/**
 * Created by Victor on 29/5/16.
 */
public class Server implements Computer {

    private final String ram;
    private final String hdd;

    public Server(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }
}
