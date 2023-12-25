package Mappers;
import Entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("Select * from users where userName=#{userName}")
    User findByUsername(String userName);

}
