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
        //����������Զ��� ��mock����Ҳ����Ϊ�ӿ�
        Quest mockQuest=mock(BraveQuest.class);
        //ע��mock����
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        //������embarkOnQuest()����ʱ�������Ҫ��Mockito�����֢Quest��mockʵ�ֵ�embark()��������������һ��
        // TODO Ϊʲôû�н�Quest�еķ���ʵ������չʾ������
        verify(mockQuest,times(1)).embark();
    }
    @Test
    public void DamselKnight(){
        new DamselKnight().embarkOnQuest();
    }
}
