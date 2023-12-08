package _09_dependency_injection;

public class DbBoardRepository implements IBoardRepository {
    public void save() {
        System.out.println("게사판 DB에 저장 중 ..");
    }

    public void delete() {
        System.out.println("게시판 DB에 삭제 중 ..");
    }
}
