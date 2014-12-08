package examples.design_pattern.adapter_pattern.model.player.impl;

import examples.design_pattern.adapter_pattern.model.player.AdvancedMediaPlayer;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: "+ fileName);
    }
}
