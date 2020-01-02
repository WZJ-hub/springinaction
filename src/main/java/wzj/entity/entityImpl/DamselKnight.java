package wzj.entity.entityImpl;

import wzj.entity.knights;
import wzj.service.Quest;
import wzj.service.serviceImpl.BraveQuest;
import wzj.service.serviceImpl.DamselQuest;

public class DamselKnight implements knights {
    private Quest quest;
    //没有通过构造函数注入的方式，quest与DamselKnight紧耦合
    public DamselKnight(){
        this.quest=new DamselQuest();
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
