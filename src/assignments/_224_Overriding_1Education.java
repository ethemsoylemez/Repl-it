package assignments;

public class _224_Overriding_1Education {

	public static void main(String[] args) {
		
		EducationalInstitution parentObject = new EducationalInstitution(5);
		System.out.println(parentObject.graduationRequirements());
		
		LawSchool ls = new LawSchool();
		System.out.println(ls.graduationRequirements());	
	}
}

class EducationalInstitution {

	private int years;

	public EducationalInstitution(int years) {
		this.years = years;
	}

	public String graduationRequirements() {
		return years + " years of study";
	}
}

class LawSchool extends EducationalInstitution {

	public LawSchool() {
		super(3);
	}

	@Override
	public String graduationRequirements() {
		return super.graduationRequirements() + " and passing the bar";
	}
}
