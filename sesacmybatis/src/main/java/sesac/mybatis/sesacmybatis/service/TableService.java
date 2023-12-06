package sesac.mybatis.sesacmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sesac.mybatis.sesacmybatis.domain.Table;
import sesac.mybatis.sesacmybatis.dto.TableDTO;
import sesac.mybatis.sesacmybatis.mapper.TableMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {
    @Autowired
    TableMapper tableMapper;

    public List<TableDTO> getTableList() {
        List<Table> table = tableMapper.showAll();
        List<TableDTO> result = new ArrayList<>();

        for(Table one : table) {
            String id = Integer.toString(one.getId());

            TableDTO tabledto = TableDTO.builder()
                    .no(one.getWriter() + id)
                    .id(one.getId())
                    .title(one.getTitle())
                    .content(one.getContent())
                    .writer(one.getWriter())
                    .registered(one.getRegistered())
                    .build();

            result.add(tabledto);
        }
            return result;
    }

    public void insertOne(Table table) {
        tableMapper.insertOne(table);
    }

    public void updateOne(Table table) { tableMapper.updateOne(table); }

    public void deleteOne(int id) { tableMapper.deleteOne(id); }
}
