package collectionEx.lib;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class NationEx9 {
	private String country;
	private String capital;
	
	public NationEx9(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	
	public static void nationInput(Vector<NationEx9> nations, Scanner scanner) {
		while(true){
			System.out.print("나라와 수도 입력 " + (nations.size()+1) + ">> ");
			String information = scanner.nextLine();
			if(information.equals("그만")) {
				break;
			}else {
				StringTokenizer informationToken = new StringTokenizer(information);
				if(informationToken.countTokens() == 2) {
					NationEx9 nationInput = new NationEx9(informationToken.nextToken(),informationToken.nextToken());		
					if(nations.size() == 0) {
						nations.add(nationInput);
					}else {
						for(int i=0; i<nations.size(); i++) {
							if(nationInput.country.equals(nations.get(i).getCountry())) {
								System.out.println(nationInput.country + "는 이미 있습니다!");
								break;
							}else if(i == nations.size() - 1){
								nations.add(nationInput);
								break;
							}
						}
					}
				}
			}
		}
	}
	
	public static void nationQuiz(Vector<NationEx9> nations, Scanner scanner) {
		for(NationEx9 i : nations) {
			System.out.print(i.getCountry() + "의 수도는? ");
			String answer = scanner.nextLine();
			if(answer.equals("그만")) {
				break;
			}else if(answer.equals(i.getCapital())){
				System.out.println("정답!!");
			}else {
				System.out.println("아닙니다!!");
			}
		}
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}
