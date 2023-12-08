package _09_dependency_injection;

import _05_class._access_modifier._pack01.B;

public class Main {
    public static void main(String[] args) {
        IBoardRepository repository = new FileBoardRepository();
//        IBoardRepository repository = new DbBoardRepository();
        // 파일에서 데이터베이스로 기획이 변경되었는데, repository가 바뀌었는데 서비스 코드를 변경하지 않아도 된다!!

        // 1. 생성자를 이용한 DI
//        BoardService service = new BoardService(repository);

        // 2. setter를 이용한 DI
        BoardService service = new BoardService();
        service.setIBoardRepository(repository);

        service.save();
        service.delete();

    }
}
