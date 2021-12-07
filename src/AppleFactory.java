public class AppleFactory extends Factory{
    @Override
    public Smartphone createSmartphone() {
        return new Apple();
    }
}
