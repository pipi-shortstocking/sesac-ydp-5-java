package _09_dependency_injection;

// "파일"에 게시판 목록을 저장하는 클래스
public class FileBoardRepository implements IBoardRepository{
    public void save() {
        System.out.println("게시판 파일 저장 중 ..");
    }

    public void delete() {
        System.out.println("게시판 파일 삭제 중 ..");
    }
}
