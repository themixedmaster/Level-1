package Vault;

public class MomOChi {
	public static void main(String[] args) {
		TheVault ofBatman = new TheVault();
		MomOChi isTheBestNinja = new MomOChi();
		isTheBestNinja.crackVault(ofBatman);
	}
	int crackVault(TheVault vault){
		for(int o = 0;o <= 999999; o++){
			if(vault.tryCode(o)==true){
				System.out.println(o);
				return(o);
			}else if(vault.tryCode(-o)){
				System.out.println(-o);
				return(-o);
			}
		}
		return 0;
	}
}
