package MyPackage;

public class Numbers {

	int a = 2000;
	int b = 5000;
	int c = 8000;
	int result;

	public void checkNumbers() {
		if (a > b && a > c && b < a && b < c) {
			result = a + b;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);

		}
		if (a > b && a > c && c < a && c < b) {
			result = a + c;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);
		}
		if (b > a && b > c && c < a && c < b) {
			result = b + c;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);

		}
		if (b > a && b > c && a < b && a < c) {
			result = a + b;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);

		}
		if (c > a && c > b && b < a && b < c) {
			result = b + c;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);
		}
		if (c > a && c > b && a < b && a < c) {
			result = a + c;
			System.out.println("Сумма большего и меньшего из трех чисел = " + result);

		}
	}
}
