package _1_intro;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        // Testing duck
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // Setting behaviour dynamically
        Duck model = new ModelDuck();
        model.performFly();
        // changing behaviour at runtime using the setter
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
