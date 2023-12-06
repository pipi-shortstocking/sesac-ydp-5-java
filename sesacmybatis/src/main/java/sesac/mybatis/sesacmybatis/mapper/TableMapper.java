package sesac.mybatis.sesacmybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import sesac.mybatis.sesacmybatis.domain.Table;

import java.util.List;


@Mapper
public interface TableMapper {
    List<Table> showAll();

    @Insert("insert into `table`(title, content, writer) values (#{title}, #{content},#{writer})")
    void InsertOne(Table table);

    void updateOne(Table table);
}
