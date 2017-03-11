package Calculator;

public class Calculator {
	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(model,view);
		view.createUI();
		
	}
}
