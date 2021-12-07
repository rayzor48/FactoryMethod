public class Main {
    public static void main(String[] args) {
        Factory[] factories = new Factory [2];

        factories[0] = new SamsungFactory();
        factories[1] = new AppleFactory();

        for(Factory f : factories){
            f.createSmartphone().test();
        }
    }
}
