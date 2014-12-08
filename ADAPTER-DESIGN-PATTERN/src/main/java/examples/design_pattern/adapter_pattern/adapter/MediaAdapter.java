package examples.design_pattern.adapter_pattern.adapter;

import examples.design_pattern.adapter_pattern.enums.AudioTypeEnum;
import examples.design_pattern.adapter_pattern.model.player.AdvancedMediaPlayer;
import examples.design_pattern.adapter_pattern.model.player.impl.Mp4Player;
import examples.design_pattern.adapter_pattern.model.player.impl.VlcPlayer;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AudioTypeEnum audioType) {

        if (audioType == AudioTypeEnum.VLC) {

            advancedMusicPlayer = new VlcPlayer();

        } else if (audioType == AudioTypeEnum.MP4) {

            advancedMusicPlayer = new Mp4Player();

        }

    }

    @Override

    public void play(AudioTypeEnum audioType, String fileName) {

        if (audioType == AudioTypeEnum.VLC) {

            advancedMusicPlayer.playVlc(fileName);

        } else if (audioType == AudioTypeEnum.MP4) {

            advancedMusicPlayer.playMp4(fileName);

        }

    }
}
