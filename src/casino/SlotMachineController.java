package casino;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author The LEAGUE of Amazing Programmers.
 *
 */
public class SlotMachineController {
	private SlotMachineView view;
	private SlotMachineModel model;

	/**
	 * 
	 * @param view
	 * @param model
	 */
	public SlotMachineController(SlotMachineView view, SlotMachineModel model) {
		this.view = view;
		this.model = model;
		view.addSlotListenter(new SlotMachineListener());
	}

	/**
	 * 
	 * @author The LEAGUE of Amazing Programmers
	 *
	 */
	class SlotMachineListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			model.pull();
			view.setReel1(model.getreel1());
			view.setReel2(model.getreel2());
			view.setReel3(model.getreel3());
			view.refresh();
			int winnings = model.getWinnings(view.getBetAmount());
			view.setWinAmount(view.getWinnings());
		}

	}
}
