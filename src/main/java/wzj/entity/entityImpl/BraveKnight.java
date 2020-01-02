package wzj.entity.entityImpl;

import wzj.entity.knights;
import wzj.service.Quest;
import wzj.service.serviceImpl.BraveQuest;

public class BraveKnight implements knights {
    private Quest quest;
    //这里通过构造函数注入的方式，是的quest与braveknight能够相对松耦合，这就是构造器注入
    public BraveKnight(Quest quest){
        this.quest=quest;
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
