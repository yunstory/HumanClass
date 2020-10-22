package youtube;

public class C {

	int gas; 
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("yes gas");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run (gas L" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("norun (gas L" + gas + ")");
				return;
			}
		}
	}
}
