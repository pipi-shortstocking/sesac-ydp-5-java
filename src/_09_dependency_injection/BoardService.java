package _09_dependency_injection;

// 게시판 목록을 관리하는 기능을 제공하는 클래스 (save, delete)
public class BoardService {
    // 1. 생성자를 이용한 DI
//    private final IBoardRepository repository;
//
//    public BoardService(IBoardRepository repository) {
//        this.repository = repository;
//    }

    // 2. setter를 이용한 의존성 주입
    private IBoardRepository repository;
    public void setIBoardRepository(IBoardRepository repository) {
        this.repository = repository;
    }

    public void save() {
        repository.save();
    }

    public void delete() {
        repository.delete();
    }
}
