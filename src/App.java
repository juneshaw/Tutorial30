import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a camera";
	}	
	public String snap() {
		return "Taking picture";
	}
}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> machineList = new ArrayList<>();
		machineList.add(new Machine());
		showList1(machineList);
		
		ArrayList<Camera> cameraList = new ArrayList<>();
		cameraList.add(new Camera());
		cameraList.add(new Camera());
		showList2(cameraList);

	}

	public static void showList1(ArrayList<? extends Machine> list) {

		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}	
	public static void showList2(ArrayList<? super Camera> list) {

		for (Object value : list) {
			System.out.println(value);
			System.out.println(((Camera)value).snap());
		}
	}

}
