package examples.design_pattern.adapter_pattern.player;

import examples.design_pattern.adapter_pattern.adapter.MediaAdapter;
import examples.design_pattern.adapter_pattern.adapter.MediaPlayer;
import examples.design_pattern.adapter_pattern.enums.AudioTypeEnum;

/**
 * Created by BeytullahCaliskan on 08.12.2014.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override

    public void play(AudioTypeEnum audioType, String fileName) {

        //inbuilt support to play mp3 music files

        if (audioType == AudioTypeEnum.MP3) {

            System.out.println("Playing mp3 file. Name: " + fileName);

        }

        //mediaAdapter is providing support to play other file formats

        else if (audioType == AudioTypeEnum.VLC
                || audioType == AudioTypeEnum.MP4) {

            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);

        } else {

            System.out.println("Invalid media. " +
                    audioType + " format not supported");

        }

    }
}