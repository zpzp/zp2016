package zp2016;

import java.io.IOException;
import java.security.KeyPair;
import java.security.cert.*;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class MainProgram 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//KeyPairClass gen = new KeyPairClass();
		//KeyPair pair = gen.genPairOfKeys();
		
		//test - ovo se unosi sa GUI-a
		CertificateClass cert = new CertificateClass();
		cert.setSerialNum(12342);
		cert.setLength(1024);
		cert.setDays(322);
		cert.setCN("Aida Mavric");
		cert.setOU("SI");
		cert.setO("ETF");
		cert.setL("Vracar");
		cert.setST("Belgrade");
		cert.setC("Serbia");
		cert.setE("aida.mavric@gmail.com");
		ArrayList<String> alternatives = new ArrayList<String>();
		alternatives.add("DNS=23232323");
		cert.setAltNames(alternatives);
		
		/*CN: CommonName
			OU: OrganizationalUnit
			O: Organization
			L: Locality
			S: StateOrProvinceName
			C: CountryName*/
		
		X509Certificate cX509 = null;
		
		try {
			cX509 = cert.generateCertificate();
		} catch (GeneralSecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(cX509.toString());
		//list of providers
		/*Provider [] prov= Security.getProviders();
		int n = prov.length;
		for(int i =0; i< n; i++)
		{
		System.out.println(prov[i].getName());
		for (Enumeration e = prov[i].keys(); e.hasMoreElements();)
            System.out.println("\t" + e.nextElement());
		
		}*/
		
		
		
		
		// TODO Auto-generated method stub

	}

}
