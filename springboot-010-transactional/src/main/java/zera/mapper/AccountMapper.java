package zera.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zera.pojo.Account;

public interface AccountMapper {

    @Select("""
    select actno,balance from t_bank where actno = #{actno}
""")
    Account selectByActno(String actno);

    @Update("""
    update t_bank set balance = #{balance} where actno = #{actno}
""")
    int update(Account account);
}
