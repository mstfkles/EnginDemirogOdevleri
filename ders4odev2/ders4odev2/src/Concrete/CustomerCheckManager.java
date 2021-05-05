package Concrete;

import Abstract.CustomerCheckServece;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckServece {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub

	}

}
