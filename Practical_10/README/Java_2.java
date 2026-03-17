//Demonstrating the insects Kingdom

class Insects{
	void dirty(){
		System.out.println("Insects are being dirty");
	}
}

class roaches extends Insects{
	void yuck(){
	System.out.println("roaches are just yuck!");
	}	
}

class Bees extends Insects{
	void buzz(){
	System.out.println("bees are buzzing");	
	}
}

class Java_2{
	public static void main(String[] args){
		Bees b = new Bees();
		b.dirty();
		b.buzz();
		roaches r = new roaches();
		r.dirty();
		r.yuck();
	}
}
