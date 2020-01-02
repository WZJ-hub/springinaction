package wzj.springinaction;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Test;
import wzj.entity.entityImpl.BraveKnight;
import wzj.entity.entityImpl.DamselKnight;
import wzj.service.Quest;
import wzj.service.serviceImpl.BraveQuest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void knightShouldEmbarkOnQuest(){
        //创建虚拟测试对象 即mock对象，也可以为接口
        Quest mockQuest=mock(BraveQuest.class);
        //注入mock对象
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        //当调用embarkOnQuest()方法时，你可以要求Mockito框架炎症Quest的mock实现的embark()方法仅仅被调用一次
        // TODO 为什么没有将Quest中的方法实现内容展示出来？
        verify(mockQuest,times(1)).embark();
    }
    @Test
    public void DamselKnight(){
        new DamselKnight().embarkOnQuest();
    }
}
