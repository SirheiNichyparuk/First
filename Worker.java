package MyPackage;

//8. � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
public class Worker {
	int k = 3;
	int[] mass = { 2, 4, 6, 10, 3, 6, 9, 12 };
	int sum = 0;

	public void counting() {

		for (int i = 0; i < mass.length; i++) { // ����������� �� ���� ���������
												// �������
			if (mass[i] % k == 0) { // ���� ����� ������ k
				sum = sum + mass[i];

			}

		}

		System.out.println("����� �����  " + sum);

	}
}
