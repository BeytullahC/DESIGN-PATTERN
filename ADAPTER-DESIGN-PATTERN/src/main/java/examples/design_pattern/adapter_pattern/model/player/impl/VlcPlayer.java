package examples.design_pattern.adapter_pattern.model.player.impl;

import examples.design_pattern.adapter_pattern.model.player.AdvancedMediaPlayer;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
     //do nothing
    }
}
