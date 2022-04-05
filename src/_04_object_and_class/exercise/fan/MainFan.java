package _04_object_and_class.exercise.fan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        Fan fan3 = new Fan();
        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}
