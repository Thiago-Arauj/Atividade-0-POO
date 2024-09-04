public class Series {

    private String name;
    private int numTemp;

    public Series(String name, int numTemp) {
        this.name = name;
        this.numTemp = numTemp;
    }


    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", numTemp=" + numTemp +
                '}';
    }
}
