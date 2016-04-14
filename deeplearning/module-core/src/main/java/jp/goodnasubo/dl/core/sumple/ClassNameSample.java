package jp.goodnasubo.dl.core.sumple;

public class ClassNameSample extends AbstractSample {


	public static void main(String[] args) {
		ClassNameSample my = new ClassNameSample();

		AbstractSample parent = (AbstractSample)my;

		Sample sample = (Sample)my;

		System.out.println("my: " + my.getClassName());

		System.out.println("parent: " + parent.getClassName());

		System.out.println("sample: " + sample.getClassName());

	}
}
