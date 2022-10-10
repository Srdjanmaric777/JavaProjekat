package services.AdapterService.impl;

import services.AdapterService.IAdvancedMediaPlayer;

public class Mp4Player implements IAdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
