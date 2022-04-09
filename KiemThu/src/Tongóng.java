
public class Tongóng {
	public static double TongS(int n, int x) {
		int T = 0;
		if(n == 0 && x == 0) {
			System.out.println("Vô nghĩa");
		}
		for(int i = 0; i <= n; i++)
			T += i;
		return (double) T/(x+n);
	}
	
	public static void main(String[] args) {
		System.out.println(TongS(6, 1));
	}
}
