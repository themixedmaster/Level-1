package casino;

public class SevenSevenSeven {
	public static void main(String[] args) {
		SlotMachineView v = new SlotMachineView();
		SlotMachineModel m = new SlotMachineModel();
		SlotMachineController c = new SlotMachineController(v, m);
	}
}
