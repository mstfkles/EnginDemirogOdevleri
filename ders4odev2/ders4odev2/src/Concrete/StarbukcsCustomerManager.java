package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckServece;
import Entities.Customer;

public class StarbukcsCustomerManager extends BaseCustomerManager {

	CustomerCheckServece customerCheckServece;

	public StarbukcsCustomerManager(CustomerCheckServece customerCheckServece) {
		super();
		this.customerCheckServece = customerCheckServece;
	}

	public void StarbucksManager(CustomerCheckServece customerCheckServece) {

		this.customerCheckServece = customerCheckServece;
	}

	@Override
	public void Save(Customer customer) {

		if (customerCheckServece.CheckIfRealPerson(customer)) {

			super.Save(customer);
		} else {
			System.out.println("Hata veri tabanýna eklenmedi");
		}

	}

}
