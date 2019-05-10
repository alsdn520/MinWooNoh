package i_singleton;
/* 1�ܰ� : �����ڸ� private�� �����.
 * 2�ܰ� : Ŭ���� ���γ� static���� ������ �ν��Ͻ� �����ϱ�.
 * 3�ܰ� : �ܺο��� ������ �� �ִ� public �޼��� �����.
 */
public class Company {
	private static Company instance = new Company();//�����ϰ� ������ �ν��Ͻ�
	private Company( ) {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}//instance�� null�̶�� new�� �����Ѵ�.
		return instance;//�����ϰ� ������ instance��ȯ
	}//�ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public get()�޼��� ����
	//��, �ܺο��� getInstance�� ȣ���Ѵٸ� null�� 
	//�ƴϹǷ� �ϳ��� instance�� ���ϵȴ�.
}
