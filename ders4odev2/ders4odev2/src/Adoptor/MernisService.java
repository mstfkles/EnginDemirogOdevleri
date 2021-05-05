package Adoptor;

import java.rmi.RemoteException;

import Abstract.CustomerCheckServece;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements CustomerCheckServece{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
        boolean returnType = false;
        try {
            returnType = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
                    customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (RemoteException e) {

            e.printStackTrace();
        }
        return returnType;
    }
	 

}
