import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import javax.swing.JOptionPane;

public class OkJavaGoInHome {
    public static void main(String[] args) {
        // 입력창에서 입력한 값으로 변수 저장
        String id = JOptionPane.showInputDialog("Input Adress");
        String floor = JOptionPane.showInputDialog("Enter a Floor level");
        String bright = JOptionPane.showInputDialog("Input Level");

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(Integer.parseInt(floor));

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting halllamp = new Lighting(id+ " / Hall Lamp");
        halllamp.on();

        Lighting floorlamp = new Lighting(id+ " / Floor Lamp");
        floorlamp.on();

        DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
        moodLamp.setBright(
                Double.parseDouble(bright));
        moodLamp.on();
    }
}
