package by.home.task_3.entity;

import java.util.Objects;

public class District {

	private String nameDistrict;
	private String districtСenter;

	public District(String nameDistrict, String districtСenter) {
		super();
		this.nameDistrict = nameDistrict;
		this.districtСenter = districtСenter;
	}

	public String getNameDistrict() {
		return nameDistrict;
	}

	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}

	public String getDistrictСenter() {
		return districtСenter;
	}

	public void setDistrictСenter(String districtСenter) {
		this.districtСenter = districtСenter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(districtСenter, nameDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(districtСenter, other.districtСenter) && Objects.equals(nameDistrict, other.nameDistrict);
	}

	@Override
	public String toString() {
		return "District [nameDistrict=" + nameDistrict + ", districtСenter=" + districtСenter + "]";
	}

}
