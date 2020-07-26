package application.response;

public class ProductionCompaniesResponse {
	private Integer productionCompaniesId;
	
	private String logo_path;
	private String name;
	private String origin_country;
	
	
	public Integer getProductionCompaniesId() {
		return productionCompaniesId;
	}
	public void setProductionCompaniesId(Integer productionCompaniesId) {
		this.productionCompaniesId = productionCompaniesId;
	}
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin_country() {
		return origin_country;
	}
	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}
	
	

}
