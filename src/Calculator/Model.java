package Calculator;

public class Model {
	String inputOne = "";
	String inputTwo = "";
	String inputTree = "";
	String output = "";
	boolean operatorPressed = false;
	public void addNum(String num){
		if(num.equals("=")){
			calculate();
		}else if(num.equals("+")||num.equals("+")||num.equals("X")||num.equals("÷")||num.equals("%")){
			inputTwo = num;
			operatorPressed = true;
		}else if(operatorPressed == true){
			inputTree = inputTree + num;
		}else if(operatorPressed == false){
			inputOne = inputOne + num;
		}
		if(num.equals("Clear")){
			operatorPressed = false;
			inputOne = "";
			inputTwo = "";
			inputTree = "";
			output = "";
		}
	}
	private void calculate() {
		int num1 = Integer.parseInt(inputOne);
		int num3 = Integer.parseInt(inputTree);
		if(inputTwo.equals("+")){
			int answer = num1 + num3;
			output = "" + answer;
		}
		if(inputTwo.equals("-")){
			int answer = num1 - num3;
			output = "" + answer;
		}
		if(inputTwo.equals("X")){
			int answer = num1 * num3;
			output = "" + answer;
		}
		if(inputTwo.equals("÷")){
			int answer = num1 / num3;
			output = "" + answer;
		}
		if(inputTwo.equals("%")){
			int answer = num1 % num3;
			output = "" + answer;
		}
	}
	public String getInputOne() {
		return inputOne;
	}
	public void setInputOne(String inputOne) {
		this.inputOne = inputOne;
	}
	public String getInputTree() {
		return inputTree;
	}
	public void setInputTree(String inputTree) {
		this.inputTree = inputTree;
	}
	public String getInputTwo() {
		return inputTwo;
	}
	public void setInputTwo(String inputTwo) {
		this.inputTwo = inputTwo;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
}