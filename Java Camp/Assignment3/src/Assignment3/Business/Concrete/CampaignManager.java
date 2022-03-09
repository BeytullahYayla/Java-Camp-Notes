package Assignment3.Business.Concrete;
import Assignment3.Business.Abstract.*;
import Assignment3.Entities.Concrete.Campaign;
public class CampaignManager implements CampaignService{

	
	public double calculateNewPrice(double discount) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+":Added");
		
	}

	
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+":Deleted");
		
	}

	
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+":Updated");
		
	}



	public void listCampaigns(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Campaigns listed successfully");
	}

	 

}
