package application.response;

public class ProductionCountriesResponse {
	private Integer productionCountriesId;
	
	private String iso_3166_1;
	private String name;
		
	public String getIso_3166_1() {
		return iso_3166_1;
	}
	public void setIso_3166_1(String iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getProductionCountriesId() {
		return productionCountriesId;
	}
	public void setProductionCountriesId(Integer productionCountriesId) {
		this.productionCountriesId = productionCountriesId;
	}

}
