import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streams {
	public static void main(String[] args) {
		// 1 integer stream
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x)); // skip first 5
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println();

		// Stream.of("ava","bobby","rick").sorted().forEach(x->System.out.println(x));
//		System.out.println(Stream.of("ava","bobby","rick").sorted().findFirst().filter(x->x.contains("ava")));
		String[] names = { "romio", "ava", "bobby", "rick", "ass" };
		Arrays.stream(names).filter(x -> x.startsWith("a")).forEach(System.out::println);
//		Arrays.stream(names).filter(x->x.startsWith("a")).sorted().forEach(System.out::println);//sorted

		Arrays.stream(new int[] { 2, 4, 6, 8 }).map(x -> x * 2).average().ifPresent(System.out::println);
		List<String> p = Arrays.asList("romio", "ava", "bobby", "rick", "Ass");
		p.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach((System.out::println));
	}
}
