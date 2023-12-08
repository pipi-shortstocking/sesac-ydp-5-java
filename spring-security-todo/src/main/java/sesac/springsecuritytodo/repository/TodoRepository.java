package sesac.springsecuritytodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sesac.springsecuritytodo.TodoEntity;

// TodoRepository 인터페이스
// - JpaRepository 인터페이스를 확장한 인터페이스
// - JpaRepository<TodoEntity, Long>
//  - TodoEntity: 테이블에 매핑될 엔티티 클래스
//  - Long: 엔티티의 PK 타입
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
