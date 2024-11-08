package project2.lib;

/**
 * Description : 연락처 값 객체 <br>
 * Date : 2024. 5. 13. <br>
 * History : <br>
 * - @author : Jewon <br>
 * - 날짜 : 2024. 5. 13. <br>
 * - 설명 : 최초작성 <br>
 * @version 1.0
 */
public class ContactVo {
	private String name;
	private String phone;
	private String address;
	private String gubun_nm;
	
	public ContactVo(String name, String phone, String address, String gubun_nm) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.gubun_nm = gubun_nm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGubun_nm() {
		return gubun_nm;
	}

	public void setGubun_nm(String gubun_nm) {
		this.gubun_nm = gubun_nm;
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 전화번호 : " + phone + ", 주소 : " + address + ", 분류 : " + gubun_nm;
	}
	
	
}
