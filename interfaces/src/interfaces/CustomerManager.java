package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	//constructor block
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}
