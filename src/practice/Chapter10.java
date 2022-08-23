package practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
	 public static void main(String[] args) throws Exception {
		 List<Task> tasks = new ArrayList<>(); 
		 tasks.add(new Task(LocalDate.of(2021,10,21), "牛乳を買う。", true));
		 tasks.add(new Task(LocalDate.of(2021,9,15), "○○社面談。", false));
		 tasks.add(new Task(LocalDate.of(2021,12,4), "手帳を買う。", true));
		 tasks.add(new Task(LocalDate.of(2021,8,10), "散髪に行く。", false));
		 tasks.add(new Task(LocalDate.of(2021,11,9), "スクールの課題を解く。", false));
		 long count = tasks.stream().filter(t -> t.isDone() == false).count();
                System.out.println("未完了のタスクの個数は"+count);
         tasks.stream()
                .filter(t -> t.isDone() == false)
                .sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate()))
		        .forEach(System.out::println);
	}	        
}
