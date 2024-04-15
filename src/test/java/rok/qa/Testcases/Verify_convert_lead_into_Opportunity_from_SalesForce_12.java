package rok.qa.Testcases;

import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Convert_Community_Lead_into_opportunity;
import rok.qaPageObject.Create_lead_from_salesforce_end;
import rok.qaPageObject.Logintosalesforce;

public class Verify_convert_lead_into_Opportunity_from_SalesForce_12 extends BaseClass {

	@Test(groups = { "group1" })
	public void Create_Lead_from_salesforce_end() throws Exception {
		// openUrl
		Logintosalesforce logintosalesforce = new Logintosalesforce(driver);
		logintosalesforce.sflogin();
		Create_lead_from_salesforce_end sfcrtlead = new Create_lead_from_salesforce_end(driver);
		sfcrtlead.createleadfromSF();
		Convert_Community_Lead_into_opportunity crtleatop = new Convert_Community_Lead_into_opportunity(driver);	
		crtleatop.Convertleadtoopps();

	}
}