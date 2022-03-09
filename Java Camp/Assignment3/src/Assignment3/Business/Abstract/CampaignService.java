package Assignment3.Business.Abstract;

import Assignment3.Entities.Concrete.Campaign;

public interface CampaignService {
	double calculateNewPrice(double discount);
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void listCampaigns(Campaign campaign);
}
