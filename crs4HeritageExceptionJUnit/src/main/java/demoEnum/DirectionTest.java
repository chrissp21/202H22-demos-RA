package demoEnum;

public class DirectionTest {
    public static void main(String[] args) {
        Direction d;

        d = Direction.NORD;

        for (Direction dir  : Direction.values())  {
            System.out.println(dir.name());
            System.out.println(dir.getDegre());
        }
    }
}
