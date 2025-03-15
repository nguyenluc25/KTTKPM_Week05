package observer.stack;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskStatus) {
        System.out.println(name + " nhận được thông báo: Trạng thái công việc thay đổi thành " + taskStatus);
    }
}
