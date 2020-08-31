public class RunnerB {
	public static void main(String[] args)
	{
		new RunnerB();
	}
	RunnerB()
	{
		PerfectSquare func = num -> {
			return Math.sqrt(num) % 1 == 0;
		};

		System.out.printf("" + func.checkPerfectSquare(27));
	}
}