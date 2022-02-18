package by.home.task_3.entity;

import java.util.Objects;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы:
 *  вывести на консоль столицу,
 *   количество областей,
 *    площадь,
 *     областные центры.
 * 
 * @author knapp
 *
 */

public class Country {

	private String nameCountry;
	private int phoneCode;
	private Region region;
	private District district;
	private City city;
	
	

	public Country() {
		super();
	}

	public Country(String nameCountry, int phoneCode, String nameRegion, double squareOfRegion, String nameDistrict,
			String districtСenter, String nameCity, boolean capital) {
		super();
		this.nameCountry = nameCountry;
		this.phoneCode = phoneCode;
		this.region = new Region(nameRegion, squareOfRegion) ;
		this.district = new District(nameDistrict, districtСenter);
		this.city = new City(nameCity, capital);
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public int getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(int phoneCode) {
		this.phoneCode = phoneCode;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, district, nameCountry, phoneCode, region);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(city, other.city) && Objects.equals(district, other.district)
				&& Objects.equals(nameCountry, other.nameCountry) && phoneCode == other.phoneCode
				&& Objects.equals(region, other.region);
	}

	@Override
	public String toString() {
		return "NameCountry= " + nameCountry + ", phoneCode= " + phoneCode + ", region= " + region + ", district= "
				+ district + ", city= " + city + '\n';
	}

}
