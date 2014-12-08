package examples.design_pattern.adapter_pattern.adapter;

import examples.design_pattern.adapter_pattern.enums.AudioTypeEnum;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public interface MediaPlayer {
    public void play(AudioTypeEnum audioType,String fileName);
}
