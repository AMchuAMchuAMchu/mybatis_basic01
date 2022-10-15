import com.itheima.config.SpringConfig;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.IAnimeInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-15 09:48:01
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AnimeInfoTest01 {

   @Autowired
   private IAnimeInfoService iAnimeInfoService;

   @Test
   public void testDeleteById(){

      boolean b = iAnimeInfoService.deleteById(111);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println(">>>>>"+b);
      System.out.println();
      System.out.println();
      System.out.println();

   }

   @Test
   public void updateById(){
      AnimeInfo animeInfo = new AnimeInfo();
      animeInfo.setName("刀剑神域Alicization...小野学");
      animeInfo.setRelease_time(2018);
      animeInfo.setCharacter01("爱丽丝·辛赛西斯·萨提茅野爱衣");
      animeInfo.setCharacter02("尤吉欧岛崎信长");
      animeInfo.setId(27);

      boolean b = iAnimeInfoService.updateById(animeInfo);

      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println(">>>>>"+b);
      System.out.println();
      System.out.println();
      System.out.println();

   }

   @Test
   public void selectAll(){

      List<AnimeInfo> animeInfos = iAnimeInfoService.selectAll();

      animeInfos.forEach(System.out::println);

   }

   @Test
   public void testSelectById(){

      AnimeInfo animeInfo = iAnimeInfoService.selectById(27);

      System.out.println(">>>>"+animeInfo);

   }

   @Test
   public void testInsert(){
      AnimeInfo animeInfo = new AnimeInfo();
      animeInfo.setName("刀剑神域Alicization...小野学");
      animeInfo.setRelease_time(2018);
      animeInfo.setCharacter01("爱丽丝·滋贝鲁库·萨提茅野爱衣");
      animeInfo.setCharacter02("尤吉欧岛崎信长");
      animeInfo.setId(27);
      boolean b = iAnimeInfoService.insertOne(animeInfo);
      System.out.println(">>>"+b);
   }

}
