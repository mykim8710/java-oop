package ch6;

class Student {
	String name; // �̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		float average = Math.round(getTotal() / 3f * 10) / 10f;
		return average;
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

}
