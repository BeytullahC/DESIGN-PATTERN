package examples.design_pattern.adapter_pattern;

import examples.design_pattern.adapter_pattern.enums.AudioTypeEnum;
import examples.design_pattern.adapter_pattern.player.AudioPlayer;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AudioTypeEnum.MP3, "beyond the horizon.mp3");

        audioPlayer.play(AudioTypeEnum.MP4, "alone.mp4");

        audioPlayer.play(AudioTypeEnum.VLC, "far far away.vlc");

        audioPlayer.play(null, null);

    }
}
