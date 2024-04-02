package zera.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zera.mapper.AccountMapper;
import zera.pojo.Account;
import zera.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public void transfer(String fromActno, String toActno, Double money) {
        Account fromAccount = accountMapper.selectByActno(fromActno);
        if(fromAccount.getBalance() < money){
            throw new RuntimeException("钱不够转");
        }

        Account toAccount = accountMapper.selectByActno(toActno);
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);

        int count = accountMapper.update(fromAccount);

        String s = null;
        s.toString();


        count+= accountMapper.update(toAccount);
        if(count != 2){
            throw new RuntimeException("Wrong happen");
        }
    }
}
