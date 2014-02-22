public class Hoge {

	private static final Hoge self = new Hoge();

	@Setter
	@Getter
	private String hoge = "hoge";

	private void exec(String str) {
		System.out.println(str);
	}

	public static void main(String[] args){
		self.exec(args[0]);
	}
}
