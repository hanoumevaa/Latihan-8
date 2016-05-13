package latihan;

public class superku implements I1, D1 {

    @Override
    public String methodI1() {
        return String.format("integer");
    }

    @Override
    public String methodD1() {
        return String.format("double");
    }
}
