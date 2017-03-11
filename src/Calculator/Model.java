package Calculator;

public class Model {
	String inputOne;
	String inputTwo;
	String inputTree;
	String output;
	public String addNum(String num){
		inputOne = inputOne + num;
		return inputOne;
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