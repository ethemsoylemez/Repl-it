package assignments;

//public class for main method
public class _211_Inheritance_2_Phone {

	public static void main(String[] args) {
		CameraPhone ph = new CameraPhone(5, 6);
		System.out.println(ph.numPictures());
	}
}

//parent class
class Phone {

}

//child class
class CameraPhone extends Phone {

	int imageSize;
	int memorySize;

	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}

	public int numPictures() {
		return (memorySize * 1000) / imageSize;
	}
}