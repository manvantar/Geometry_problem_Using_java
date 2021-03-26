package Day5;

public class Geometry {
	float x1,y1,x2,y2;

	Geometry(float x1,float y1,float x2,float y2){

		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;

	}

	float calculateLength(){

		float length1=(float) Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y2-y1),2));
		return length1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry g1=new Geometry(1,1,2,2);
		Geometry g2=new Geometry(1,1,2,2);

		float length1=g1.calculateLength();
		float length2=g2.calculateLength();

		if(length1==length2) {
			System.out.println("Both are equal");				

		}
		else {
			System.out.println("Both are not equal");	

		}
		String l1=""+length1;
		System.out.println(length1 +" "+length2 );
		String l2=""+length2;

		int res=l1.compareTo(l2);
		if(res==0) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
			
		}


	}

}
