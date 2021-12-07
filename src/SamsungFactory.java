public class SamsungFactory extends Factory{
    @Override
    public Smartphone createSmartphone() {
        return new Samsung();
    }
}
