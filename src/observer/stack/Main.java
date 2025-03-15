package observer.stack;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        TeamMember member1 = new TeamMember("Thành viên A");
        TeamMember member2 = new TeamMember("Thành viên B");

        task.addObserver(member1);
        task.addObserver(member2);

        System.out.println("Thay đổi trang thái công việc: ");
        task.setTaskStatus("Đang thực hiện");

        System.out.println("----------------------------------------------------");
        System.out.println("Thay đổi trang thái công việc: ");
        task.setTaskStatus("Hoàn thành");
    }
}
