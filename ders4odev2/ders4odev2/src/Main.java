import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adoptor.MernisService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbukcsCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbukcsCustomerManager(new MernisService());
		customerManager.Save(new Customer(1, "Mustafa", "Keleþ", LocalDate.of(1998, 07, 01), "23831041394"));

	}

}
