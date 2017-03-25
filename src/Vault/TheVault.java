package Vault;

public class TheVault {
	int secretCode = 262217;
	boolean tryCode(int num){
		if(num == secretCode){
			return true;
		}else{
			return false;
		}
	}
}
