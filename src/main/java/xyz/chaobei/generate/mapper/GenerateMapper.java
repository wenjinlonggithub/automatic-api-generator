package xyz.chaobei.generate.mapper;

import xyz.chaobei.generate.entity.ColumnEntity;
import xyz.chaobei.generate.entity.GenerateEntity;
import xyz.chaobei.generate.entity.TableEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GenerateMapper extends Mapper {
    /**
     * @Author MRC
     * @Description 通过表名查询表信息和字段信息
     * @Date 10:43 2019/11/5
     * @Param [tableName]
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    GenerateEntity selectTable(String name);
    /**
     * @Author MRC
     * @Description 查询当前连接数据库的所有表信息
     * @Date 17:37 2020/9/27
     * @Param []
     * @return java.util.List<xyz.chaobei.generate.entity.TableEntity>
     **/
    List<TableEntity> tableList();
    /**
     * @Author MRC
     * @Description 查询指定表的字段信息
     * @Date 13:40 2020/9/28
     * @Param [name]
     * @return java.util.List<xyz.chaobei.generate.entity.ColumnEntity>
     **/
    List<ColumnEntity> selectColumns(String name);
}
