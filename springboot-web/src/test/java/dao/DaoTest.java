package dao;

import com.lanxing.boot.dao.mapper.MovieDetailModelDOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author gaofan
 * @version 1.0
 * @date 2017/8/3 下午4:43
 * @desc 功能描述
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DaoTest.class)
public class DaoTest {

    @Resource
    private MovieDetailModelDOMapper movieDetailModelDOMapper;

    @Test
    public void test(){
        System.out.println(movieDetailModelDOMapper.selectByPrimaryKey(1));
    }

}
