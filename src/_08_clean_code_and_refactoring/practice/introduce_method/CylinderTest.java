package _08_clean_code_and_refactoring.practice.introduce_method;

public class CylinderTest {
    public static void main(String[] args) {
        testGetVolume0And0();
        testGetVolume1And2();
    }
    static void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        System.out.println(result);
    }

    static void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        System.out.println(result);
    }
}
