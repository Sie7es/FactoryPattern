/**
 * Created by Victor on 29/5/16.
 */
public class PC implements Computer {

    private final String ram;
    private final String hdd;

    public PC(String ram, String hdd) {
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
