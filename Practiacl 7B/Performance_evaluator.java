class Performance_evaluator{
	static void f1(){
for(int i = 0; i<= 25; i++){
System.out.println(2000000);
		}
			}
static void f2(){
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);
	System.out.println(2000000);

		}			
public static void main(String args[]){
	double f1avg = 0;
	double f2avg = 0;
	double f1st, f1et, f2st, f2et;
	double f1tt = 0;
	double f2tt = 0;
	double no_of_times = 2;
		for(int i = 0; i <= no_of_times; i++){
	f1st = System.nanoTime();
	f1();
	f1et = System.nanoTime();
	f1tt = f1et - f1st;
		}
	f1avg = f1tt/no_of_times;


for(int j = 0; j <= no_of_times; j++){
	f2st = System.nanoTime();
	f2();
	f2et = System.nanoTime();
	f2tt = f2et - f2st;
		}
	f2avg = f2tt/no_of_times;

	System.out.println("time taken by f1 = " + f1tt);
	System.out.println(" avg time taken by f2 = " + f1avg);
	System.out.println("time taken by f2 = " + f2tt);
	System.out.println("avg time taken by f2 = " + f2tt);
	
			}


    				}